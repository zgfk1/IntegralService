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
        utest.setUserId(1001L);


        //用户基本信息获取
        User userInfo = userService.getUserInfoOneById(utest);

        return JSON.toJSONString(userInfo);
    }

}
