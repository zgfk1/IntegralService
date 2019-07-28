package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.czbank.integralservice.model.Completion;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.model.User;
import com.czbank.integralservice.service.CompletionService;
import com.czbank.integralservice.service.MissionService;
import com.czbank.integralservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @Autowired
    private CompletionService completionService;

    @Autowired
    private MissionService missionService;

    /**
     * @return 当前用户个人中心
     */
    @CrossOrigin
    @ResponseBody
    @RequestMapping("user/information")
    public Object userInfo(HttpServletRequest req) {

        //获取用户ID
        long userId=Long.valueOf(req.getParameter("userId"));
        //获取用户ID，
        //此处测试用户ID为1001；
        User uObj = new User();
        uObj.setUserId(userId);
        //用户基本信息获取
        User userInfo = this.userService.getUserInfoOneById(uObj);
        return JSONObject.parseObject(JSON.toJSONString(userInfo));
    }

    /**
     * 用户签到函数
     * @param req
     * @return 返回签到成功结果
     */
    @ResponseBody
    @RequestMapping("user/signin")
    public boolean  userSignInEveryDay(HttpServletRequest req){
        //获取用户ID
        long userId=Long.valueOf(req.getParameter("userId"));
        User user = new User();
        user.setUserId(userId);
        //获取签到任务积分
        Mission mission =missionService.missionSelectOne(1);
        //构建用户
        user= userService.getUserInfoOneById(user);
        //判断是否签到
        if (completionService.getUserSignIn(user,mission)) {
            return false;
        }

        //签到
        boolean flag=completionService.userSignInMission(user,mission);
        //更改用户表积分和历史积分
        if (!flag) {
            return false;
        }
        int integral= mission.getMissionIntegral().intValue()+user.getIntegralAmount();
        int integralHis=mission.getMissionIntegral().intValue()+user.getIntegralHistoryAmount();
        this.userService.signInUpdate(user.getUserId(),integral,integralHis);
        return true;
    }
    /**
     * 用户签到函数
     * @return 返回签到成功结果
     */
    @ResponseBody
    @RequestMapping("user/issigned")
    public boolean userSignedIn(HttpServletRequest req){
        //获取用户ID
        //Long userId=Long.valueOf(req.getParameter("userId"));
        User user = new User();
        user.setUserId(1001L);
        //获取签到任务积分
        Mission mission =missionService.missionSelectOne(1);
        //构建用户
        user= userService.getUserInfoOneById(user);
        //查询是否签到
        boolean flag=completionService.getUserSignIn(user,mission);
        if (flag) {
            return true;
        }
        return false;
    }

}
/*

*/



