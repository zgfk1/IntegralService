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
            "values(#{commodityId},#{commodityName},#{commodityIntegral},#{commodityAmount}," +
            "#{commodityExchangenum},#{commodityAvailablenum},#{commodityIntro},#{commodityPicture})")
    int insert(Commodity commodity);
    //1delete
    @Delete("delete from commodity where commodity_id = #{commodityId}")
    int delete(long commodity_id);
    //2update
    @Update("update commodity set commodity_name = #{commodityName}," +
            "set commodity_integral = #{commodityIntegral}," +
            "set commodity_amount = #{commodityAmount}," +
            "set commodity_exchangenum = #{commodityExchangenum}," +
            "set commodity_availablenum = #{commodityAvailablenum}," +
            "set commodity_intro = #{commodityIntro}," +
            "set commodity_picture = #{commodityPicture}," +
            "where commodity_id = #{commodityId}")
    int update(Commodity commodity);
    //3selectOne
    @Select("select * from commodity where commodity_id = #{commodityId}")
    Commodity selectOne(Commodity commodity);
    //4selectAll
    @Select("select * from commodity")
    List<Commodity> selectAll();
}

