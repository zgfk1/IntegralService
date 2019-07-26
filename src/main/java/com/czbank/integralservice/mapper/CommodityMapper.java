package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.Commodity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommodityMapper {
    //0insert
    @Insert("insert into commodity(commodity_id,commodity_name,integral_num,amount," +
            "exchange_num,available_num,intro,picture)" +
            "values(#{commodityId},#{commodityName},#{integralNum},#{amount}," +
            "#{exchangeNum},#{availableNum},#{intro},#{picture})")
    int insert(Commodity commodity);
    //1delete
    @Delete("delete from commodity where commodity_id = #{commodityId}")
    int delete(long commodity_id);
    //2update
    @Update("update commodity set commodity_name = #{commodityName}," +
            "integral_num = #{integralNum}," +
            "amount = #{amount}," +
            "exchange_num = #{exchangeNum}," +
            "available_num = #{availableNum}," +
            "intro = #{intro}," +
            "picture = #{picture}" +
            "where commodity_id = #{commodityId}")
    int update(Commodity commodity);
    //3selectOne
    @Select("select * from commodity where commodity_id = #{commodityId}")
    Commodity selectOne(Commodity commodity);
    //4selectAll
    @Select("select * from commodity")
    List<Commodity> selectAll();
}

