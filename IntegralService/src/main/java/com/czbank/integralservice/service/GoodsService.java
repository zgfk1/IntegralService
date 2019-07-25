package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Commodity;

import java.util.List;

public interface GoodsService {
    //0insert
    public int insert(Commodity commodity);
    //1delete
    public int delete(long commodity_id);
    //2update
    public int update(Commodity commodity);
    //3selectOne
    public Commodity selectOne(Commodity commodity);
    //4selectAll
    public List<Commodity> selectAll();
}
