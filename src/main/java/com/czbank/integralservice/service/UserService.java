package com.czbank.integralservice.service;

import com.czbank.integralservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 用户相关的服务
 * @author danghaibulan
 */
public interface UserService {


    /**
     * 个人中心用户信息的显示
     * @param user 传入的特定用户
     * @return 用户界面需要的用户信息
     */
    User getUserInfoOneById(User user);



    int userInsert(User user);
    //添加用户信息 陈易京

    int userDelete(Long userId);
    //删除用户信息 陈易京

    int integralAmountUpdate(Long userId, int integralAmount2);
    //更新用户积分

    int integralHistoryAmountUpdate(Long userId, int integralHistoryAmount2);
    //更新用户历史总积分

    User findUserByAccount(String account);

}
