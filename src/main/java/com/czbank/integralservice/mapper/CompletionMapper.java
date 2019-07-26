package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Exchange;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
  Author:Yijing Chen
  Date:2019.7.25
 */

@Mapper
@Repository
public interface CompletionMapper {

    //0insert
    @Insert("insert into completion(completion_id,user_id,mission_id,completion_time,amount_before,amount_after)" +
            "values(#{completionId},#{userId},#{missionId},#{completionTime}," +
            "#{amountBefore},#{amountAfter})")
    public int insert(Completion completion);
    //1delete
    @Delete("delete from completion where completion_id = #{completionId}")
    int delete(long completionId);
    //2update
    @Update("update completion set user_id = #{userId}," +
            "mission_id = #{missionId}," +
            "completion_time = #{completionTime}," +
            "amount_before = #{amountBefore}," +
            "amount_after = #{amountAfter}" +
            "where completion_id = #{completionId}" )
    int update(Completion completion);
    //3selectOne
    @Select("select * from completion where completion_id = #{completionId}")
    Completion selectOne(Completion completion);
    //4selectAll
    @Select("select * from completion")
    List<Completion> selectAll();

}
