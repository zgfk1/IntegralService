package com.czbank.integralservice.controller;

import com.czbank.integralservice.mapper.CommodityMapper;
import com.czbank.integralservice.model.Commodity;
import jdk.nashorn.internal.runtime.JSONFunctions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

    /**
     * 添加新商品接口
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/addGoods")
    public void addGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodity_id(Long.parseLong(request.getParameter("commodity_id")));
        commodity.setCommodity_name(request.getParameter("commodity_name"));
        commodity.setCommodity_integral(Long.parseLong(request.getParameter("commodity_integral")));
        commodity.setCommodity_amount(Long.parseLong(request.getParameter("commodity_amount")));
        commodity.setCommodity_exchangenum(Integer.parseUnsignedInt(request.getParameter("commodity_exchangenum")));
        commodity.setCommodity_availablenum(Integer.parseUnsignedInt(request.getParameter("commodity_availablenum")));
        commodity.setCommodity_intro(request.getParameter("commodity_intro"));
        commodity.setCommodity_picture(request.getParameter("commodity_picture"));
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
    @RequestMapping("/deleteGoods")
    public void deleteGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try{
            commodityMapper.delete(Long.parseLong(request.getParameter("commodityId")));
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
    @RequestMapping("/updateGoods")
    public void updateGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodity_id(Long.parseLong(request.getParameter("commodity_id")));
        commodity.setCommodity_name(request.getParameter("commodity_name"));
        commodity.setCommodity_integral(Long.parseLong(request.getParameter("commodity_integral")));
        commodity.setCommodity_amount(Long.parseLong(request.getParameter("commodity_amount")));
        commodity.setCommodity_exchangenum(Integer.parseUnsignedInt(request.getParameter("commodity_exchangenum")));
        commodity.setCommodity_availablenum(Integer.parseUnsignedInt(request.getParameter("commodity_availablenum")));
        commodity.setCommodity_intro(request.getParameter("commodity_intro"));
        commodity.setCommodity_picture(request.getParameter("commodity_picture"));
        try{
            commodityMapper.update(commodity);
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
    @PostMapping("/commoditys")
    public Object queryGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Commodity> commoditys = new ArrayList<>();
        try{
            commoditys = commodityMapper.selectAll();
//            return JSON.toJsonString(commoditys);
            return "";
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
    @PostMapping("/commodity")
    public void querySpecialGoods(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Commodity commodity = new Commodity();
        commodity.setCommodity_id(Long.parseLong(request.getParameter("commodityId")));
        try{
            commodity = commodityMapper.selectOne(commodity);
        } catch (Exception e) {
            log.error("查询失败，请稍后再试", e);
            throw e;
        }
    }

}
