package com.czbank.integralservice.mapper;

import com.czbank.integralservice.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


/**
 * 用户表的Mapper
 *
 * @author 李举磊
 */
@Mapper
@Repository
public interface UserMapper {


    /**
     * @param user 带有ID用户对象
     * @return 完整的数据查询对象
     */
    @Select("select * from user where user_id=#{userId} limit 1 ")
    User UserSelectOne(User user);

    @Insert("insert into user(user_id,account,password,name,salt,user_type,integral_amount,integral_history_amount,tel_number,address)" +
            "values(#{userId},#{account},#{password},#{name},#{salt},#{userType},#{integralAmount},#{integralHistoryAmount},#{telNumber},#{address})")
    int userInsert(User user);//Yijing Chen

    @Delete("delete from user where user_id = #{userId}")
    int userDelete(Long userId);//Yijing Chen

    @Update("update user set integral_amount = #{integralAmount2} where user_id = #{userId}")
    int integralAmountUpdate(Long userId, int integralAmount2);//Yijing Chen

    @Update("update user set integral_history_amount = #{integralHistoryAmount2} where user_id = #{userId}")
    int integralHistoryAmountUpdate(Long userId, int integralHistoryAmount2);//Yijing Chen

    /**
     * 通过用户名来查找user
     */
    @Select("select * from user where account = #{account} limit 1")
    User selectUserByAccount(String account);

    @Update("update user set integral_history_amount = #{integralHis},integral_amount =#{integral} where user_id = #{userId}")
    int updateIntegralAmount(long userId,int integral,int integralHis);

}
