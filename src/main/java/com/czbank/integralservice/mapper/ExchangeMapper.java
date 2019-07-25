package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.Commodity;
import com.czbank.integralservice.model.Exchange;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ExchangeMapper {
    //0insert
    @Insert("insert into exchange(exchange_id,user_id,commodity_id,exchange_quantity," +
            "exchange_time,amount_before,amount_after,delivery_address,user_contact)" +
            "values(#{exchangeId},#{userId},#{commodityId},#{exchangeQuantity}," +
            "#{exchangeTime},#{amountBefore},#{amountAfter},#{deliveryAddress},#{userContact})")
    int insert(Exchange exchange);
    //1delete
    @Delete("delete from exchange where exchange_id = #{exchangeId}")
    int delete(long exchangeId);
    //2update
    @Update("update exchange set user_id = #{userId}," +
            "commodity_id = #{commodityId}," +
            "exchange_quantity = #{exchangeQuantity}," +
            "exchange_time = #{exchangeTime}," +
            "amount_before = #{amountBefore}," +
            "amount_after = #{amountAfter}," +
            "delivery_address = #{deliveryAddress}," +
            "user_contact = #{userContact}" +
            "where exchange_id = #{exchangeId}" )
    int update(Exchange exchange);
    //3selectOne
    @Select("select * from exchange where exchange_id = #{exchangeId}")
    Exchange selectOne(Exchange exchange);
    //4selectAll
    @Select("select * from exchange")
    List<Exchange> selectAll();

}
