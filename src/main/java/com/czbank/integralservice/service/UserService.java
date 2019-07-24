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

    //获得当前可获取积分的任务列表

    //获得推荐商品预览列表


}
