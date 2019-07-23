package com.czbank.integralservice.dao;

import com.czbank.integralservice.domain.Mission;
import com.czbank.integralservice.domain.MissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MissionMapper {
    int countByExample(MissionExample example);

    int deleteByExample(MissionExample example);

    int insert(Mission record);

    int insertSelective(Mission record);

    List<Mission> selectByExample(MissionExample example);

    int updateByExampleSelective(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByExample(@Param("record") Mission record, @Param("example") MissionExample example);
}