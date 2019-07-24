package com.czbank.integralservice.service.impl;


import com.czbank.integralservice.mapper.UserMapper;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author danghaibulan
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    /**
     * @param user 需要查询的用户实体
     * @return 数据库中完整的用户实体
     */
    @Override
    public User getUserOneById(User user) {

        return userMapper.UserSelectOne(user);
    }

    /**
     * 返回安全的用户信息
     * @param user 传入的用户信息
     * @return userInfo 返回的用户信息
     *
     */
    @Override
    public User getUserInfoOneById(User user) {
        User userInfo = new User();
        userInfo=userMapper.UserSelectOne(user);

        userInfo.setPassword(null);
        return  userInfo;
    }

    ;

}
