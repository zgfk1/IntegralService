package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
  author: Yijing Chen
  Date:2019.7.24
 */

@Slf4j
@RestController
public class IntegralController {

    @Autowired
    private UserService userService;

    //查询用户积分
    @RequestMapping("/integral")
    public int searchOfUserIntegral(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        String userId=req.getParameter("user_Id");
        User user = new User();
        user.setUserId(Long.parseLong(userId));
        try {
            User userInfo = userService.getUserInfoOneById(user);
            return userInfo.getIntegralAmount();
        }catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        } finally {
            PrintWriter out = resp.getWriter();
            out.flush();
            out.close();
        }

       return 0;
    }

}
