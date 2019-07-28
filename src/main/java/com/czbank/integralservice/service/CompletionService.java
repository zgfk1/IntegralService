package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.model.User;

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


    /**
     * 用户每日签到操作
     * @return 返回签到结果
     */
    boolean userSignInMission(User user, Mission mission);

    /**
     * 查询用户每日签到的标志
     * @return 返回是否签到
     */
    boolean getUserSignIn(User user, Mission mission);
}
