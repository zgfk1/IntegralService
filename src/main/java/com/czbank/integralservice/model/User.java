package com.czbank.integralservice.model;

public class User {
    private Long userId;

    private String acccount;

    private String password;

    private String name;

    private String salt;

    private Integer userType;

    private Integer integralAmount;

    private Integer integralHistoryamount;

    private String telNumber;

    private String address;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAcccount() {
        return acccount;
    }

    public void setAcccount(String acccount) {
        this.acccount = acccount == null ? null : acccount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getIntegralAmount() {
        return integralAmount;
    }

    public void setIntegralAmount(Integer integralAmount) {
        this.integralAmount = integralAmount;
    }

    public Integer getIntegralHistoryamount() {
        return integralHistoryamount;
    }

    public void setIntegralHistoryamount(Integer integralHistoryamount) {
        this.integralHistoryamount = integralHistoryamount;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber == null ? null : telNumber.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}