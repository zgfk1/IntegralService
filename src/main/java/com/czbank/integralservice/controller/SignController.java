package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSONObject;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

/**
 * @author HanrAx
 * @Date 2019-07-26
 */
@Controller
@Slf4j
public class SignController {

    @Autowired
    private UserService userService;

    /**
     * 执行登陆操作
     *
     * @throws Exception
     */
    @PostMapping("/login")
    public void doSignIn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        log.info("username:{}, password:{}", username, password);
        JSONObject resultJson = new JSONObject();
        User user = userService.findUserByAccount(username);
        try {
            if (user == null) {
                resultJson.put("code", "101");
                resultJson.put("msg", "用户不存在");
                resultJson.put("attach", "");
                throw new Exception("用户不存在");
            }
            if (!user.getPassword().equals(password)) {
                resultJson.put("code", "102");
                resultJson.put("msg", "密码错误");
                resultJson.put("attach", "");
                throw new Exception("密码错误");
            }
            String token = UUID.randomUUID().toString();
            JSONObject attachJson = new JSONObject();
            attachJson.put("token", token);

            resultJson.put("code", "0");
            resultJson.put("msg", "登陆成功");
            resultJson.put("attach", attachJson);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            response.setContentType("application/json;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print(resultJson.toString());
            out.flush();
            out.close();
        }


    }

}
