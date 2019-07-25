package com.czbank.integralservice.service;

import com.czbank.integralservice.model.Mission;

import java.util.List;

/**
 * ClassName: MissionService
 * ClassDesc: 任务处理的Service
 * Author: Wangshuai
 * Date: 2019/07/25
 **/

public interface MissionService {
    //0insert
    public int missionInsert(Mission mission);
    //1delete
    public int missionDelete(long missionId);
    //2update
    public int missionUpdate(Mission mission);
    //3selectOne
    public Mission missionSelectOne(long missionId);
    //4selectAll
    public List<Mission> missionSelectAll();
}
