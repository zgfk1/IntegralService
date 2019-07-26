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

        //接受
//        long missionId = Long.parseLong(req.getParameter("missionId"));
//        String missionName = req.getParameter("missionName");
//        String missionIntro = req.getParameter("missionIntro");
//        long missionIntegral = Long.parseLong(req.getParameter("missionIntegral"));
//        String missionPath = req.getParameter("missionPath");
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        System.out.println(req.getParameter("startTime"));
//        LocalDate startTime = LocalDate.parse(req.getParameter("startTime"),df);
//        System.out.println(startTime.toString());
//        LocalDate endTime = LocalDate.parse(req.getParameter("endTime"),df);
//        boolean missionValid = Boolean.parseBoolean(req.getParameter("missionValid"));
//        Mission mission = null;
//        //封装
//        try {
//            System.out.println(missionId);
//            System.out.println(missionName);
//            mission = new Mission(
//                    missionId,
//                    missionName,
//                    missionIntro,
//                    missionIntegral,
//                    missionPath,
//                    startTime,
//                    endTime,
//                    missionValid
//            );
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String mission = req.getParameter("mission");
        ;
        Mission missionUp = JSON.toJavaObject(JSON.parseObject(mission), Mission.class);
        //处理
        missionService.missionInsert(missionUp);

        PrintWriter pw = resp.getWriter();
        pw.write("0");
        pw.flush();
        pw.close();

        return null;
    }
    //1delete
    @RequestMapping("/missionDelete")
    public Object missionDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        String missionId = req.getParameter("missionId");
        Mission mission = null;
        //处理
        missionService.missionDelete(Long.parseLong(missionId));
        PrintWriter pw = resp.getWriter();
        pw.write("1");
        pw.flush();
        pw.close();

        return null;
    }
    //2update
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
    @RequestMapping("/missionSelectOne")
    public void missionSelectOne(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        String missionId = req.getParameter("missionId");
        Mission mission = new Mission();
        //处理
        PrintWriter pw = resp.getWriter();
        pw.write( JSON.toJSONString(missionService.missionSelectOne(Long.parseLong(missionId))));
        pw.flush();
        pw.close();
    }
    //4selectAll
    @RequestMapping("/missionSelectAll")
    public void missionSelectAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //接受
        Mission mission = new Mission();
        //处理
        PrintWriter pw = resp.getWriter();
        pw.write( JSON.toJSONString(missionService.missionSelectAll()));
        pw.flush();
        pw.close();
    }
}
