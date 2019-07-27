package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.integralservice.model.*;
import com.czbank.integralservice.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
        String userId=req.getParameter("user_id");

        User user = new User();
        user.setUserId(Long.parseLong(userId));

        try {
            User userInfo = userService.getUserInfoOneById(user);
            return JSON.toJSONString(userInfo.getIntegralAmount());
        }catch (Exception e) {
            e.printStackTrace();
        }

       return 0;//表示指定用户不存在！

    }

    //完成任务积分结算
    @RequestMapping("/integral_mission")
    public Object integralSettlementOfMission(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId=req.getParameter("user_id");
        String missionId=req.getParameter("mission_id");

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
            completion.setAmountAfter(Long.valueOf(integralAmountBefore)+missionIntegral);
            completion.setCompletionTime(LocalDate.now());//封装

            System.out.println(completion.toString());
            completionService.insert(completion);
            userService.integralAmountUpdate(Long.parseLong(userId),integralAmountBefore+missionIntegral.intValue());
            userService.integralHistoryAmountUpdate(Long.parseLong(userId),integralHistoryAmountBefore+missionIntegral.intValue());

            System.out.println("4 CLEAR");
            return JSON.toJSONString(integralAmountBefore+missionIntegral.intValue());
        }catch (Exception e) {
            e.printStackTrace();
        }

        return 0;//表示失败

    }

    //兑换商品积分结算
    @RequestMapping("/integral_commodity")
    public Object integralSettlementOfCommodity(HttpServletRequest req, HttpServletResponse resp) {
        //接受
        String userId = req.getParameter("user_id");
        String commodityId = req.getParameter("commodity_id");
        int exchangeQuantity = Integer.parseInt(req.getParameter("exchange_quantity"));
        String deliveryAddress = req.getParameter("delivery_address");
        String userContact = req.getParameter("user_contact");

        User user = new User();
        user.setUserId(Long.parseLong(userId));//创立User
        Exchange exchange = new Exchange();
        exchange.setUserId(Long.parseLong(userId));
        exchange.setCommodityId(Long.parseLong(commodityId));
        exchange.setExchangeQuantity(exchangeQuantity);//创立商品兑换记录
        System.out.println("1 CLEAR");

        try {
            User userInfo = userService.getUserInfoOneById(user);
            Commodity commodity = new Commodity();
            commodity = goodsService.selectOne(Long.parseLong(commodityId));//找到User和Commodity
            Long IntegralNum = commodity.getIntegralNum();
            int integralAmountBefore = userInfo.getIntegralAmount();//商品兑换不影响历史积分
            System.out.println("2 CLEAR");
            exchange.setAmountBefore(Long.valueOf(integralAmountBefore));
            exchange.setAmountAfter(Long.valueOf(integralAmountBefore)-IntegralNum*exchangeQuantity);
            exchange.setExchangeTime(LocalDate.now());
            exchange.setDeliveryAddress(deliveryAddress);
            exchange.setUserContact(userContact);//封装

            System.out.println(exchange.toString());
            exchangeService.insert(exchange);
            commodity.setAvailableNum(commodity.getAvailableNum()-exchangeQuantity);
            commodity.setExchangeNum(commodity.getExchangeNum()+exchangeQuantity);
            System.out.println("3 CLEAR");
            goodsService.update(commodity);//更新商品供给数量
            System.out.println("4 CLEAR");
            userService.integralAmountUpdate(Long.parseLong(userId),integralAmountBefore-IntegralNum.intValue()*exchangeQuantity);

            System.out.println("4 CLEAR");
            return JSON.toJSONString(integralAmountBefore-IntegralNum.intValue()*exchangeQuantity);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return 0;//表示失败

    }
}
