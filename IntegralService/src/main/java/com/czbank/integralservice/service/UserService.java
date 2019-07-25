package com.czbank.integralservice.service;

import com.czbank.integralservice.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author danghaibulan
 */
public interface UserService {


    /*用户首页相关模块需要的业务方法接口*/

    //通过获得当前用户信息
    User getUserOneById(User user);

    //获取可展示的用户信息
    User getUserInfoOneById(User user);
    //获得当前可获取积分的任务列表

    //获得推荐商品预览列表

    public int userInsert(User user);
    //添加用户信息 陈易京

    public int userDelete(Long userId);
    //删除用户信息 陈易京

    public int integralAmountUpdate(Long userId,int integralAmount2);
    //更新用户积分

    public int integralHistoryAmountUpdate(Long userId,int integralHistoryAmount2);
    //更新用户历史总积分

}
