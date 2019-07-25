package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Exchange;

import java.util.List;

/*
  Author:Yijing Chen
  Date:2019.7.25
 */

public interface CompletionService {
    //0insert
    public int insert(Completion completion);
    //1delete
    public int delete(long completionId);
    //2update
    public int update(Completion completion);
    //3selectOne
    public Completion selectOne(Completion completion);
    //4selectAll
    public List<Completion> selectAll();
}
