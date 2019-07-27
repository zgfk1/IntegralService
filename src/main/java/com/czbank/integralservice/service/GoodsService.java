package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Commodity;

import java.util.List;

public interface GoodsService {
    //0insert
    public int insert(Commodity commodity);
    //1delete
    public int delete(long commodityId);
    //2update
    public int update(Commodity commodity);
    //3selectOne
    public Commodity selectOne(long commodityId);
    //4selectAll
    public List<Commodity> selectAll();
    //5selectAllPage
    public List<Commodity> selectAllPage( int np, int size);
    //6count
    public int count();
}
