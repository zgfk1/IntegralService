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
    int delete(long exchange_id);
    //2update
    @Update("update exchange set user_id = #{userId}," +
            "set commodity_id = #{commodityId}," +
            "set exchange_quantity = #{exchangeQuantity}," +
            "set exchange_time = #{exchangeTime}," +
            "set amount_before = #{amountBefore}," +
            "set amount_after = #{amountAfter}," +
            "set delivery_address = #{deliveryAddress}," +
            "set user_contact = #{userContact}," +
            "where exchange_id = #{exchangeId}" )
    int update(Exchange exchange);
    //3selectOne
    @Select("select * from exchange where exchange_id = #{exchangeId}")
    Exchange selectOne(Exchange exchange);
    //4selectAll
    @Select("select * from exchange")
    List<Exchange> selectAll();

}
