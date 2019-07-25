package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.CompletionMapper;
import com.czbank.integralservice.mapper.ExchangeMapper;
import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Exchange;
import com.czbank.integralservice.service.CompletionService;
import com.czbank.integralservice.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
  Author:Yijing Chen
  Date:2019.7.25
 */

@Service
public class CompletionServiceImple implements CompletionService {

    @Autowired
    private CompletionMapper completionMapper;

    @Override
    public int insert(Completion completion) {
        return completionMapper.insert(completion);
    }

    @Override
    public int delete(long completionId) {
        return completionMapper.delete(completionId);
    }

    @Override
    public int update(Completion completion) {
        return completionMapper.update(completion);
    }

    @Override
    public Completion selectOne(Completion completion) {
        return completionMapper.selectOne(completion);
    }

    @Override
    public List<Completion> selectAll() {
        return completionMapper.selectAll();
    }
}
