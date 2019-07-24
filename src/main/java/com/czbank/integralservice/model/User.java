package com.czbank.integralservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Han
 * @date 2019.7.24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private Long userId;

    private String account;

    private String password;

    private String name;

    private String salt;

    private Integer userType;

    private Integer integralAmount;

    private Integer integralHistoryAmount;

    private String telNumber;

    private String address;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public Integer getIntegralHistoryAmount() {
        return integralHistoryAmount;
    }

    public void setIntegralHistoryAmount(Integer integralHistoryAmount) {
        this.integralHistoryAmount = integralHistoryAmount;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}