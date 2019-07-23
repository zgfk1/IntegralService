package com.czbank.integralservice.domain;

import java.util.Date;

public class Completion {
    private Long completionId;

    private Long userId;

    private Long missionId;

    private Date completionTime;

    private Integer amountbefore;

    private Integer amountafter;

    public Long getCompletionId() {
        return completionId;
    }

    public void setCompletionId(Long completionId) {
        this.completionId = completionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMissionId() {
        return missionId;
    }

    public void setMissionId(Long missionId) {
        this.missionId = missionId;
    }

    public Date getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(Date completionTime) {
        this.completionTime = completionTime;
    }

    public Integer getAmountbefore() {
        return amountbefore;
    }

    public void setAmountbefore(Integer amountbefore) {
        this.amountbefore = amountbefore;
    }

    public Integer getAmountafter() {
        return amountafter;
    }

    public void setAmountafter(Integer amountafter) {
        this.amountafter = amountafter;
    }
}