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
     * 个人中心用户信息的显示
     * @param user 传入的特定用户
     * @return 用户界面需要的用户信息
     */
    @Override
    public User getUserInfoOneById(User user) {
        User userInfo=userMapper.UserSelectOne(user);
        userInfo.setPassword(null);
        userInfo.setUserType(null);
        userInfo.setSalt(null);
        return  userInfo;
    }

    @Override
    public int userInsert(User user) {
        return userMapper.userInsert(user);
    }//陈易京

    @Override
    public int userDelete(Long userId) {
        return userMapper.userDelete(userId);
    }//陈易京

    @Override
    public int integralAmountUpdate(Long userId,int integralAmount2) {
        return userMapper.integralAmountUpdate(userId,integralAmount2);
    }//陈易京

    @Override
    public int integralHistoryAmountUpdate(Long userId,int integralHistoryAmount2) {
        return userMapper.integralHistoryAmountUpdate(userId,integralHistoryAmount2);
    }//陈易京

    /**
     * Han 2019.7.26
     * 通过账号寻找user
     *
     * @param account
     * @return
     */
    @Override
    public User findUserByAccount(String account) {
        return userMapper.selectUserByAccount(account);
    }
}
