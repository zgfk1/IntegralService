package com.czbank.integralservice.controller;

import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


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

    public String index() {
        User utest = new User();
        utest.setUserId(1001L);
        User uResult = userService.getUserOneById(utest);

        return uResult.getName();
    }

}
