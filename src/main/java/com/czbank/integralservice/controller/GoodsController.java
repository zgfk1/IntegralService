package com.czbank.integralservice.controller;

import com.czbank.integralservice.dao.CommodityMapper;
import com.czbank.integralservice.dao.ExchangeMapper;
import com.czbank.integralservice.domain.Commodity;
import com.czbank.integralservice.domain.CommodityExample;
import com.czbank.integralservice.domain.Exchange;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
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
public class GoodsController {

    @Resource
    private CommodityMapper commodityMapper;

    @Resource
    private ExchangeMapper exchangeMapper;

    /**
     * 添加新商品接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @PostMapping("/account")
    public void addGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        commodity.setCommodityName(request.getParameter("commodityName"));
        commodity.setCommodityIntegral(Integer.parseUnsignedInt(request.getParameter("commodityIntegral")));
        commodity.setCommodityAmount(Integer.parseUnsignedInt(request.getParameter("commodityAmount")));
        commodity.setCommodityExchangenum(Integer.parseUnsignedInt(request.getParameter("commodityExchangenum")));
        commodity.setCommodityAvailablenum(Integer.parseUnsignedInt(request.getParameter("commodityAvailablenum")));
        commodity.setCommodityIntro(request.getParameter("commodityIntro"));
        commodity.setCommodityPicture(request.getParameter("commodityPicture"));
        try {
            commodityMapper.insert(commodity);
        } catch (RuntimeException e) {
            e.printStackTrace();
            log.warn(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        } finally {
            PrintWriter out = response.getWriter();
            out.flush();
            out.close();
        }
    }

    /**
     * 删除商品接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @PostMapping("/account")
    public void deleteGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        CommodityExample example = new CommodityExample();
        CommodityExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityIdEqualTo(Long.parseLong(request.getParameter("commodityId")));
        try{
            commodityMapper.deleteByExample(example);
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
    @ResponseBody
    @PostMapping("/account")
    public void updateGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        commodity.setCommodityName(request.getParameter("commodityName"));
        commodity.setCommodityIntegral(Integer.parseUnsignedInt(request.getParameter("commodityIntegral")));
        commodity.setCommodityAmount(Integer.parseUnsignedInt(request.getParameter("commodityAmount")));
        commodity.setCommodityExchangenum(Integer.parseUnsignedInt(request.getParameter("commodityExchangenum")));
        commodity.setCommodityAvailablenum(Integer.parseUnsignedInt(request.getParameter("commodityAvailablenum")));
        commodity.setCommodityIntro(request.getParameter("commodityIntro"));
        commodity.setCommodityPicture(request.getParameter("commodityPicture"));
        CommodityExample example = new CommodityExample();
        CommodityExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityIdEqualTo(Long.parseLong(request.getParameter("commodityId")));
        try{
            commodityMapper.updateByExample(commodity, example);
        } catch (Exception e) {
            log.error("查询失败，请稍后再试", e);
            throw e;
        }
    }

    /**
     * 查询商品信息接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @PostMapping("/account")
    public void queryGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Commodity> commoditys = new ArrayList<>();
        CommodityExample example = new CommodityExample();
        CommodityExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityIdEqualTo(Long.parseLong(request.getParameter("commodityId")));
        try{
            commoditys = commodityMapper.selectByExample(example);
        } catch (Exception e) {
            log.error("查询失败，请稍后再试", e);
            throw e;
        }
    }

    /**
     * 查询特定商品信息接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @PostMapping("/account")
    public void querySpecialGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Commodity> commoditys = new ArrayList<>();
        CommodityExample example = new CommodityExample();
        CommodityExample.Criteria criteria = example.createCriteria();
        criteria.andCommodityIdEqualTo(Long.parseLong(request.getParameter("commodityId")));
        try{
            commoditys = commodityMapper.selectByExample(example);
            Commodity commodity = new Commodity();
            if(commoditys.size() > 0){
                commodity = commoditys.get(0);
            }
        } catch (Exception e) {
            log.error("查询失败，请稍后再试", e);
            throw e;
        }
    }
    /**
     * 提交商品信息接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @PostMapping("/account")
    public void submitGoodsInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Exchange exchange = new Exchange();
        exchange.setExchangeId(Long.parseLong(request.getParameter("exchangeId")));
        exchange.setUserId(Long.parseLong(request.getParameter("userId")));
        exchange.setCommodityId(Long.parseLong(request.getParameter("commodityId")));
        exchange.setExchangeQuantity(Integer.parseUnsignedInt(request.getParameter("exchangeQuantity")));
        exchange.setExchangeTime(new Date());
        exchange.setAmountbefore(Integer.parseUnsignedInt(request.getParameter("amountbefore")));
        exchange.setAmountafter(Integer.parseUnsignedInt(request.getParameter("amountafter")));
        exchange.setDeliveryAddress(request.getParameter("deliverAddress"));
        exchange.setUserContact(request.getParameter("userContact"));
        try{
            exchangeMapper.insert(exchange);
        } catch (Exception e) {
            log.error("兑换失败，请稍后再试", e);
            throw e;
        }
    }

}
