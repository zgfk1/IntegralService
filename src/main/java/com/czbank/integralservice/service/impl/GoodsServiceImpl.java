package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.CommodityMapper;
import com.czbank.integralservice.model.Commodity;
import com.czbank.integralservice.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private CommodityMapper commodityrMapper;
    @Override
    public int insert(Commodity commodity) {
        return commodityrMapper.insert(commodity);
    }

    @Override
    public int delete(long commodity_id) {
        return commodityrMapper.delete(commodity_id);
    }

    @Override
    public int update(Commodity commodity) {
        return commodityrMapper.update(commodity);
    }

    @Override
    public Commodity selectOne(Commodity commodity) {
        return commodityrMapper.selectOne(commodity);
    }

    @Override
    public List<Commodity> selectAll() {
        return commodityrMapper.selectAll();
    }

    @Override
    public List<Commodity> selectAllPage( int np, int size){ return commodityrMapper.selectAllPage((np-1)*size,size); }

    @Override
    public int count(){ return commodityrMapper.count(); }

}

