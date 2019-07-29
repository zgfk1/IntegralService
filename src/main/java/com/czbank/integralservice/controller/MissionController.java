package com.czbank.integralservice.controller;

import com.alibaba.fastjson.JSON;
import com.czbank.integralservice.model.Mission;
import com.czbank.integralservice.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ClassName: MissionController
 * ClassDesc: 任务处理的Controller
 * Author: Wangshuai
 * Date: 2019/07/25
 **/

@Controller
public class MissionController {
    @Autowired
    private MissionService missionService;
    //0insert
    @ResponseBody
    @RequestMapping("/missionInsert")
    public Object missionInsert(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String mission = req.getParameter("mission");
        ;
        Mission missionUp = JSON.toJavaObject(JSON.parseObject(mission), Mission.class);
        //处理
        missionService.missionInsert(missionUp);

        return '0';
    }
    //1delete
    @ResponseBody
    @RequestMapping("/missionDelete")
    public Object missionDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        String missionId = req.getParameter("missionId");
        //处理
        missionService.missionDelete(Long.parseLong(missionId));
        return '0';
    }
    //2update
    @ResponseBody
    @RequestMapping("/missionUpdate")
    public Object missionUpdate(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
//        String missionId = req.getParameter("missionId");
        String mission = req.getParameter("mission");
        ;
        Mission missionUp = JSON.toJavaObject(JSON.parseObject(mission), Mission.class);
        //处理
        missionService.missionUpdate(missionUp);
        PrintWriter pw = resp.getWriter();
        pw.write("2");
        pw.flush();
        pw.close();
        return null;
    }
    //3selectOne
    @ResponseBody
    @RequestMapping("/missionSelectOne")
    public Object missionSelectOne(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        String missionId = req.getParameter("missionId");
        //处理
        String result = JSON.toJSONString(missionService.missionSelectOne(Long.parseLong(missionId)));
        return result;
    }
    //4selectAll
    @ResponseBody
    @RequestMapping("/missionSelectAll")
    public Object missionSelectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //处理
        String result = JSON.toJSONString(missionService.missionSelectAll());
        return result;
    }
    //4selectAll


    //5selectAllCount
    @ResponseBody
    @RequestMapping("/missionSelectAllCount")
    public Object missionSelectAllCount(){

        //处理
        return JSON.toJSONString(missionService.missionSelectAllCount());
    }



    /**
     * @author 李举磊
     * @return 返回有效任务总数
     */
    @ResponseBody
    @RequestMapping("/getAllMissionCount")
    public int getAllMissionCount() {
        return missionService.missionValidCount();
    }

    /**
     * @author 李举磊
     * @param req
     * @return 返回特定一页的有效任务列表
     */
    @ResponseBody
    @RequestMapping("/getMissionOnePage")
    public Object getMissionOnePage(HttpServletRequest req) {
        int start=Integer.valueOf(req.getParameter("start"));
        int limit=Integer.valueOf(req.getParameter("limit"));
        return JSON.toJSONString(missionService.missionSelectOnepage(start*limit,limit));
    }
}
