package com.czbank.integralservice.service.impl;

import com.czbank.integralservice.mapper.MissionMapper;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: MissionServiceImpl
 * ClassDesc: 任务处理的ServiceImpl
 * Author: Wangshuai
 * Date: 2019/07/25
 **/

@Service
public class MissionServiceImpl implements MissionService {
    @Autowired
    private MissionMapper missionMapper;
    @Override
    public int missionInsert(Mission mission) {
        return missionMapper.missionInsert(mission);
    }

    @Override
    public int missionDelete(long missionId) {
        return missionMapper.missionDelete(missionId);
    }

    @Override
    public int missionUpdate(Mission mission) {
        return missionMapper.missionUpdate(mission);
    }

    @Override
    public Mission missionSelectOne(long missionId) {
        return missionMapper.missionSelectOne(missionId);
    }

    @Override
    public List<Mission> missionSelectAll() { return missionMapper.missionSelectAll();
    }

    @Override
    public int missionValidCount() {
        return missionMapper.missionValidSelectAll().size();
    }

    @Override
    public List<Mission> missionSelectOnepage(int page, int limit) {
        return missionMapper.missionSelectLimitPage(page,limit);
    }
}
