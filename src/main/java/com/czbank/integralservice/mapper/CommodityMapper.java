package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.Commodity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommodityMapper {
    //0insert
    @Insert("insert into commodity(commodity_id,commodity_name,commodity_integral,commodity_amount," +
            "commodity_exchangenum,commodity_availablenum,commodity_intro,commodity_picture)" +
            "values(#{commodity_id},#{commodity_name},#{commodity_integral},#{commodity_amount}," +
            "#{commodity_exchangenum},#{commodity_availablenum},#{commodity_intro},#{commodity_picture})")
    int insert(Commodity commodity);
    //1delete
    @Delete("delete from commodity where commodity_id = #{commodity_id}")
    int delete(long id);
    //2update
    @Update("update commodity set commodity_name = #{commodity_name}," +
            "set commodity_integral = #{commodity_integral}," +
            "set commodity_amount = #{commodity_amount}," +
            "set commodity_exchangenum = #{commodity_exchangenum}," +
            "set commodity_availablenum = #{commodity_availablenum}," +
            "set commodity_intro = #{commodity_intro}," +
            "set commodity_picture = #{commodity_picture}," +
            "where commodity_id = #{commodity_id}")
    int update(Commodity commodity);
    //3selectOne
    @Select("select * from commodity where commodity_id = #{commodity_id}")
    Commodity selectOne(Commodity commodity);
    //4selectAll
    @Select("select * from commodity")
    List<Commodity> selectAll();
}

