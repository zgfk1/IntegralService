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
    int delete(Long commodityId);
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
    Commodity selectOne(Long commodityId);
    //4selectAll
    @Select("select * from commodity order by commodity_id desc")
    List<Commodity> selectAll();
    //5selectAllPage
    @Select("select * from commodity order by commodity_id desc limit #{np},#{size}")
    List<Commodity> selectAllPage(@Param("np") int np,@Param("size") int size);
    //6count
    @Select("select count(*) from commodity")
    int count();
}


