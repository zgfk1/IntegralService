package com.czbank.integralservice.service.impl;


import com.czbank.integralservice.mapper.UserMapper;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    /**
     * @param user 需要查询的用户实体
     * @return 数据库中完整的用户实体
     * @author 李举磊
     */
    @Override
    public User getUserOneById(User user) {

        return userMapper.UserSelectOne(user);
    }

    ;

}
