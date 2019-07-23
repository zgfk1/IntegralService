package com.czbank.integralservice.domain;

import java.util.Date;

public class Mission {
    private Long missionId;

    private String missionName;

    private String missionIntro;

    private Integer missionIntergral;

    private String missionPath;

    private Date missionStarttime;

    private Date missionEndtime;

    private Boolean missionIsvalid;

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName == null ? null : missionName.trim();
    }

    public String getMissionIntro() {
        return missionIntro;
    }

    public void setMissionIntro(String missionIntro) {
        this.missionIntro = missionIntro == null ? null : missionIntro.trim();
    }

    public Integer getMissionIntergral() {
        return missionIntergral;
    }

    public void setMissionIntergral(Integer missionIntergral) {
        this.missionIntergral = missionIntergral;
    }

    public String getMissionPath() {
        return missionPath;
    }

    public void setMissionPath(String missionPath) {
        this.missionPath = missionPath == null ? null : missionPath.trim();
    }

    public Date getMissionStarttime() {
        return missionStarttime;
    }

    public void setMissionStarttime(Date missionStarttime) {
        this.missionStarttime = missionStarttime;
    }

    public Date getMissionEndtime() {
        return missionEndtime;
    }

    public void setMissionEndtime(Date missionEndtime) {
        this.missionEndtime = missionEndtime;
    }

    public Boolean getMissionIsvalid() {
        return missionIsvalid;
    }

    public void setMissionIsvalid(Boolean missionIsvalid) {
        this.missionIsvalid = missionIsvalid;
    }
}