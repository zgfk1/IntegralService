package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.ExchangeMapper;
import com.czbank.integralservice.model.Exchange;
import com.czbank.integralservice.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeServiceImpl implements ExchangeService {

    @Autowired
    private ExchangeMapper exchangeMapper;
    @Override
    public int insert(Exchange exchange) {
        return exchangeMapper.insert(exchange);
    }

    @Override
    public int delete(long exchangeId) {
        return exchangeMapper.delete(exchangeId);
    }

    @Override
    public int update(Exchange exchange) {
        return exchangeMapper.update(exchange);
    }

    @Override
    public Exchange selectOne(Exchange exchange) {
        return exchangeMapper.selectOne(exchange);
    }

    @Override
    public List<Exchange> selectAll() {
        return exchangeMapper.selectAll();
    }
}
