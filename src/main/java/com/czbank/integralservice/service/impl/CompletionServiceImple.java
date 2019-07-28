package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.CompletionMapper;
import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.CompletionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @Override
    public boolean userSignInMission(User user, Mission mission) {
        long missionID=mission.getMissionId();
        Completion signCompletion=new Completion();
        signCompletion.setUserId(user.getUserId());
        signCompletion.setMissionId(missionID);
        LocalDate now=LocalDate.now();
        signCompletion.setCompletionTime(now);
        signCompletion.setAmountAfter(Long.valueOf(user.getIntegralAmount()+mission.getMissionIntegral()));
        signCompletion.setAmountBefore(Long.valueOf(user.getIntegralAmount()));
        if(completionMapper.insert(signCompletion)!=0)
            return true;
        else
            return false;
    }

    @Override
    public boolean getUserSignIn(User user, Mission mission) {
        long missionID=mission.getMissionId();
        Completion signCompletion=new Completion();
        signCompletion.setUserId(user.getUserId());
        signCompletion.setMissionId(missionID);
        LocalDate now=LocalDate.now();
        signCompletion.setCompletionTime(now);
        if (completionMapper.selectSigned(signCompletion).size()>=1)
            return true;
        return false;
    }
}
