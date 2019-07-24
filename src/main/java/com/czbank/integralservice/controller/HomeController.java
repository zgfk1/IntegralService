package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author danghaibulan
 * 用于控制用户的首页页面
 */
@Slf4j
@Controller
public class HomeController {


    @Autowired
    private UserService userService;

    /**
     * @return 用户首页控制器
     */
    @ResponseBody
    @RequestMapping("/")

    public Object index(HttpServletRequest req, HttpServletResponse resp) {

        //预留用户sesssion，此处用户ID为1001；
        User utest = new User();
        utest.setUserId(1003L);


        //用户基本信息获取
        User userInfo = userService.getUserInfoOneById(utest);

        return JSON.toJSONString(userInfo);
    }

    @ResponseBody
    @RequestMapping("/insert")

    public String index2(HttpServletRequest req, HttpServletResponse resp) {

        User utest = new User(1003L,"1","123","0","ddd",0,120,120,"157","bbb");

        userService.userInsert(utest);

        return "添加用户成功！";
    }//Yijing Chen

    @ResponseBody
    @RequestMapping("/delete")

    public String index3(HttpServletRequest req, HttpServletResponse resp) {

        //删除用户
        userService.userDelete(1003L);

        return "删除用户成功！";
    }//Yijing Chen

    @ResponseBody
    @RequestMapping("/update1")

    public String index4(HttpServletRequest req, HttpServletResponse resp) {

        User utest = new User();
        utest.setUserId(1003L);

        User userInfo = userService.getUserInfoOneById(utest);
        int integralAmount2=userInfo.getIntegralAmount()+100;
        Long userId=userInfo.getUserId();
        userService.integralAmountUpdate(userId,integralAmount2);

        return userId+"号用户积分增加100成功！";
    }//Yijing Chen

    @ResponseBody
    @RequestMapping("/update2")

    public String index5(HttpServletRequest req, HttpServletResponse resp) {

        User utest = new User();
        utest.setUserId(1003L);

        User userInfo = userService.getUserInfoOneById(utest);
        int integralHistoryAmount2=userInfo.getIntegralHistoryAmount()+100;
        Long userId=userInfo.getUserId();
        userService.integralHistoryAmountUpdate(userId,integralHistoryAmount2);

        return userId+"号用户历史积分增加100成功！";
    }//Yijing Chen
}
/*

*/



