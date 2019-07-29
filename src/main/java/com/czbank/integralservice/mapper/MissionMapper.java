package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.Mission;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * InterfaceName: MissionMapper
 * InterfaceDesc: 任务处理的Mapper
 * Author: Wangshuai
 * Date: 2019/07/25
 **/

@Mapper
@Repository
public interface MissionMapper extends tk.mybatis.mapper.common.Mapper<Mission> {
    //0insert
    @Insert("insert into mission(mission_id,mission_name,mission_intro,mission_integral,mission_path,start_time,end_time,mission_valid)" +
            "values(#{missionId},#{missionName},#{missionIntro},#{missionIntegral},#{missionPath},#{startTime},#{endTime},#{missionValid})")
    public int missionInsert(Mission mission);

    //1delete
    @Delete("delete from mission where mission_id = #{missionId}")
    public int missionDelete(long missionId);

    //2update
    @Update("update mission set mission_name = #{missionName} ,mission_intro = #{missionIntro},mission_integral = #{missionIntegral}," +
            "mission_path = #{missionPath},start_time = #{startTime},end_time = #{endTime},mission_valid = #{missionValid} where mission_id = #{missionId}")
    public int missionUpdate(Mission mission);

    //3selectOne
    @Select("select * from mission where mission_id = #{missionId} limit 1")
    public Mission missionSelectOne(@Param("missionId") long missionId);

    //4selectAll
    @Select("select * from mission order by mission_id desc")
    public List<Mission> missionSelectAll();


    /**
     * 返回所有有效任务
     * @return 有效任务列表
     */
    @Select("select * from mission where mission_valid=1 order by mission_id desc")
    public List<Mission> missionValidSelectAll();

    /**
     * 返回特定页的有效任务
     * @param page
     * @param limit
     * @return
     */
    @Select("select * from mission where mission_valid=1 order by mission_id desc limit #{page},#{limit}")
    public List<Mission> missionSelectLimitPage(int page, int limit);


    //5selectAllCount
    @Select("select * from mission order by mission_id asc")
    public List<Mission> missionSelectAllCount();
}
