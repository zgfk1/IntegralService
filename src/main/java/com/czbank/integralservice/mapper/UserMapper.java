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
}
