package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.integralservice.mapper.CommodityMapper;
import com.czbank.integralservice.mapper.ExchangeMapper;
import com.czbank.integralservice.model.Commodity;
import com.czbank.integralservice.model.Exchange;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName: GoodsController
 * ClassDesc: 积分商场的主要处理请求的Controller
 * Author: Nhy_666
 * Date: 2019/02/14
 **/

@Slf4j
@RestController
public class GoodsController {

    @Resource
    private CommodityMapper commodityMapper;

    @Resource
    private ExchangeMapper exchangeMapper;

    @Resource
    private GoodsService goodsService;

    /**
     * 添加新商品接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @PostMapping("/addGoods")
    public int addGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        commodity.setCommodityName(request.getParameter("commodityName"));
        commodity.setIntegralNum(Long.parseLong(request.getParameter("commodityIntegral")));
        commodity.setAmount(Long.parseLong(request.getParameter("commodityAmount")));
        commodity.setExchangeNum(Integer.parseUnsignedInt(request.getParameter("commodityExchangenum")));
        commodity.setAvailableNum(Integer.parseUnsignedInt(request.getParameter("commodityAvailablenum")));
        commodity.setIntro(request.getParameter("commodityIntro"));
        commodity.setPicture(request.getParameter("commodityPicture"));
        try {
            commodityMapper.insert(commodity);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        } finally {
            PrintWriter out = response.getWriter();
            out.flush();
            out.close();
        }
        return 0;
    }


    /**
     * 删除商品接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @PostMapping("/deleteGoods")
    public int deleteGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            commodityMapper.delete(Long.parseLong(request.getParameter("commodityId")));
            return 1;
        } catch (Exception e) {
            log.error("删除失败，请稍后再试", e);
            throw e;
        }finally {
            PrintWriter out = response.getWriter();
            out.flush();
            out.close();
        }
    }

    /**
     * 修改商品信息接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @PostMapping("/updateGoods")
    public int updateGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        commodity.setCommodityName(request.getParameter("commodityName"));
        commodity.setIntegralNum(Long.parseLong(request.getParameter("commodityIntegral")));
        commodity.setAmount(Long.parseLong(request.getParameter("commodityAmount")));
        commodity.setExchangeNum(Integer.parseUnsignedInt(request.getParameter("commodityExchangenum")));
        commodity.setAvailableNum(Integer.parseUnsignedInt(request.getParameter("commodityAvailablenum")));
        commodity.setIntro(request.getParameter("commodityIntro"));
        commodity.setPicture(request.getParameter("commodityPicture"));
        try{
            commodityMapper.update(commodity);
            return 1;
        } catch (Exception e) {
            log.error("查询失败，请稍后再试", e);
            throw e;
        } finally {
            PrintWriter out = response.getWriter();
            out.flush();
            out.close();
        }
    }

    /**
     * 查询商品信息接口
     */
    @GetMapping("/commoditys")
    public Object queryGoods() {
        return JSON.toJSONString(goodsService.selectAll());
    }
    /**
     * 总数
     */
    @GetMapping("/goodcount")
    public int getGootCount() {
        return goodsService.count();
    }

    /**
     * 查询特定商品信息接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @GetMapping("/commodity")
    public Object querySpecialGoods(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("commodityId");
        List list = new ArrayList();
        list.add(goodsService.selectOne(Long.parseLong(id)));
        return JSON.toJSONString(list);
    }

    /**
     * 查询商品 分页接口
     */
    @GetMapping("/commoditysPage")
    public Object selectAllPage(HttpServletRequest req){
        //接受
        String np=req.getParameter("np");
        String size=req.getParameter("size");
        //处理
        List<Commodity> goodInfo=goodsService.selectAllPage(Integer.parseInt(np),Integer.parseInt(size));
        return JSON.toJSONString(goodInfo);
    }

    /**
     * 获取最新的两个商品，用户信息界面推送
     * @throws IOException
     */
    @GetMapping("/newGoods")
    public Object selectnewGoods(){
        List<Commodity> goodInfo=goodsService.selectAllPage(1,2);
        return JSON.toJSONString(goodInfo);
    }

    /**
     * 提交商品兑换记录接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @PostMapping("/exchange")
    public int submitGoodsExchange(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Exchange exchange = new Exchange();
        exchange.setUserId(Long.parseLong(request.getParameter("userId")));
        exchange.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        exchange.setUserContact(request.getParameter("userContact"));
        //exchange.setExchangeId();
        exchange.setExchangeQuantity(1);
        exchange.setExchangeTime(LocalDate.now());
        exchange.setDeliveryAddress(request.getParameter("deliveryAddress"));
        exchange.setAmountAfter(Long.parseLong(request.getParameter("amountafter")));
        exchange.setAmountBefore(Long.parseLong(request.getParameter("amountbefore")));
        try{
            exchangeMapper.insert(exchange);
            return 1;
        } catch (Exception e) {
            log.error("提交失败，请稍后再试", e);
            throw e;
        }
    }

    /**
     * 查询用户兑换商品 总数（总次数）接口
     * @throws IOException
     */
    @GetMapping("/selectAllUserGoods")
    public Object selectAllUserGoods(HttpServletRequest req, HttpServletResponse resp){
        //接受
        String userId=req.getParameter("userId");
        //处理
        List<Exchange> userGoodsList = goodsService.selectAllUserGoods(userId);
        return JSON.toJSONString(userGoodsList);
    }

}
