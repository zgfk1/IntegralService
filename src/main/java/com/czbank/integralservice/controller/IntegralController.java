package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.czbank.integralservice.model.*;
import com.czbank.integralservice.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

/*
  author: Yijing Chen
  Date:2019.7.25
 */

@Slf4j
@RestController
public class IntegralController {

    @Autowired
    private UserService userService;

    @Autowired
    private MissionService missionService;

    @Autowired
    private CompletionService completionService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private ExchangeService exchangeService;

    //查询用户积分
    @RequestMapping("/integral")
    public Object searchOfUserIntegral(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("user_id");

        User user = new User();
        user.setUserId(Long.parseLong(userId));

        try {
            User userInfo = userService.getUserInfoOneById(user);
            return JSON.toJSONString(userInfo.getIntegralAmount());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;//表示指定用户不存在！

    }

    //完成任务积分结算
    @RequestMapping("/integral_mission")
    public Object integralSettlementOfMission(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("user_id");
        String missionId = req.getParameter("mission_id");

        User user = new User();
        user.setUserId(Long.parseLong(userId));//创立User
        Completion completion = new Completion();
        completion.setUserId(Long.parseLong(userId));
        completion.setMissionId(Long.parseLong(missionId));//创立任务完成记录
        System.out.println("1 CLEAR");

        try {
            User userInfo = userService.getUserInfoOneById(user);
            Mission mission = missionService.missionSelectOne(Long.parseLong(missionId));//找到User和Completion
            Long missionIntegral = mission.getMissionIntegral();
            int integralAmountBefore = userInfo.getIntegralAmount();
            int integralHistoryAmountBefore = userInfo.getIntegralHistoryAmount();

            System.out.println("2 CLEAR");
            completion.setAmountBefore(Long.valueOf(integralAmountBefore));
            completion.setAmountAfter(Long.valueOf(integralAmountBefore) + missionIntegral);
            completion.setCompletionTime(LocalDate.now());//封装

            System.out.println(completion.toString());
            completionService.insert(completion);
            userService.integralAmountUpdate(Long.parseLong(userId), integralAmountBefore + missionIntegral.intValue());
            userService.integralHistoryAmountUpdate(Long.parseLong(userId), integralHistoryAmountBefore + missionIntegral.intValue());

            System.out.println("4 CLEAR");
            return JSON.toJSONString(integralAmountBefore + missionIntegral.intValue());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;//表示失败

    }

    //兑换商品积分结算
    @RequestMapping("/integral_commodity")
    public Object integralSettlementOfCommodity(HttpServletRequest req, HttpServletResponse resp) {
        JSONObject resultJson = new JSONObject();
        //接受
        String userId = req.getParameter("userId");
        String commodityId = req.getParameter("commodityId");
        int exchangeQuantity = Integer.parseInt(req.getParameter("quantity"));
        String deliveryAddress = req.getParameter("address");
        String userContact = req.getParameter("userContact");

        User user = new User();
        user.setUserId(Long.parseLong(userId));//创立User
        Exchange exchange = new Exchange();
        exchange.setUserId(Long.parseLong(userId));
        exchange.setCommodityId(Long.parseLong(commodityId));
        exchange.setExchangeQuantity(exchangeQuantity);//创立商品兑换记录

        try {
            User userInfo = userService.getUserInfoOneById(user);
            Commodity commodity = goodsService.selectOne(Long.parseLong(commodityId));//找到User和Commodity
            //商品积分价格
            Long integralNum = commodity.getIntegralNum();
            //当前用户剩余的积分
            int integralAmountBefore = userInfo.getIntegralAmount();//商品兑换不影响历史积分
            if (integralAmountBefore < integralNum * exchangeQuantity) {
                resultJson.put("code", "100");
                resultJson.put("msg", "积分不足，无法兑换");
                resultJson.put("attach", "");
                return resultJson.toJSONString();
            }

            exchange.setAmountBefore((long) integralAmountBefore);
            exchange.setAmountAfter((long) integralAmountBefore - integralNum * exchangeQuantity);
            exchange.setExchangeTime(LocalDate.now());
            exchange.setDeliveryAddress(deliveryAddress);
            exchange.setUserContact(userContact);//封装

            System.out.println(exchange.toString());
            exchangeService.insert(exchange);
            commodity.setAvailableNum(commodity.getAvailableNum() - exchangeQuantity);
            commodity.setExchangeNum(commodity.getExchangeNum() + exchangeQuantity);
            goodsService.update(commodity);//更新商品供给数量

            int leftIntegral = integralAmountBefore - integralNum.intValue() * exchangeQuantity;
            userService.integralAmountUpdate(Long.parseLong(userId), leftIntegral);


            JSONObject attachJson = new JSONObject();
            attachJson.put("leftIntegral", leftIntegral + "");

            resultJson.put("code", "0");
            resultJson.put("msg", "成功兑换");
            resultJson.put("attach", attachJson);
            return resultJson.toJSONString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        resultJson.put("code", "101");
        resultJson.put("msg", "未知错误");
        resultJson.put("attach", "");
        return resultJson.toJSONString();
    }
}
