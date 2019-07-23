package com.czbank.integralservice.domain;

import java.util.Date;

public class Exchange {
    private Long exchangeId;

    private Long userId;

    private Long commodityId;

    private Integer exchangeQuantity;

    private Date exchangeTime;

    private Integer amountbefore;

    private Integer amountafter;

    private String deliveryAddress;

    private String userContact;

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getExchangeQuantity() {
        return exchangeQuantity;
    }

    public void setExchangeQuantity(Integer exchangeQuantity) {
        this.exchangeQuantity = exchangeQuantity;
    }

    public Date getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Date exchangeTime) {
        this.exchangeTime = exchangeTime;
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact == null ? null : userContact.trim();
    }
}