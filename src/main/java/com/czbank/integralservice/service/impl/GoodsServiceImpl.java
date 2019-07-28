package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.CommodityMapper;
import com.czbank.integralservice.mapper.ExchangeMapper;
import com.czbank.integralservice.model.Commodity;
import com.czbank.integralservice.model.Exchange;
import com.czbank.integralservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private CommodityMapper commodityrMapper;

    @Autowired
    private ExchangeMapper exchangeMapper;

    @Override
    public int insert(Commodity commodity) {
        return commodityrMapper.insert(commodity);
    }

    @Override
    public int delete(long commodityId) {
        return commodityrMapper.delete(commodityId);
    }

    @Override
    public int update(Commodity commodity) {
        return commodityrMapper.update(commodity);
    }

    @Override
    public Commodity selectOne(long commodityId) {
        return commodityrMapper.selectOne(commodityId);
    }

    @Override
    public List<Commodity> selectAll() {
        return commodityrMapper.selectAll();
    }

    @Override
    public List<Commodity> selectAllPage(int np, int size) {
        return commodityrMapper.selectAllPage((np - 1) * size, size);
    }

    @Override
    public int count() {
        return commodityrMapper.count();
    }

    @Override
    public int countUserGoods(String userId){
        return exchangeMapper.countUserGoods(userId);
    }

    @Override
    public List<Exchange> selectAllUserGoods(String userId){
        return exchangeMapper.selectAllUserGoods(userId);
    }
}

