package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Exchange;

import java.util.List;

public interface ExchangeService {
    //0insert
    public int insert(Exchange exchange);
    //1delete
    public int delete(long exchange_id);
    //2update
    public int update(Exchange exchange);
    //3selectOne
    public Exchange selectOne(Exchange exchange);
    //4selectAll
    public List<Exchange> selectAll();
}