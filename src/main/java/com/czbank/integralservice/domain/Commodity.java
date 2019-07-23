package com.czbank.integralservice.domain;

public class Commodity {
    private Long commodityId;

    private String commodityName;

    private Integer commodityIntegral;

    private Integer commodityAmount;

    private Integer commodityExchangenum;

    private Integer commodityAvailablenum;

    private String commodityIntro;

    private String commodityPicture;

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    public Integer getCommodityIntegral() {
        return commodityIntegral;
    }

    public void setCommodityIntegral(Integer commodityIntegral) {
        this.commodityIntegral = commodityIntegral;
    }

    public Integer getCommodityAmount() {
        return commodityAmount;
    }

    public void setCommodityAmount(Integer commodityAmount) {
        this.commodityAmount = commodityAmount;
    }

    public Integer getCommodityExchangenum() {
        return commodityExchangenum;
    }

    public void setCommodityExchangenum(Integer commodityExchangenum) {
        this.commodityExchangenum = commodityExchangenum;
    }

    public Integer getCommodityAvailablenum() {
        return commodityAvailablenum;
    }

    public void setCommodityAvailablenum(Integer commodityAvailablenum) {
        this.commodityAvailablenum = commodityAvailablenum;
    }

    public String getCommodityIntro() {
        return commodityIntro;
    }

    public void setCommodityIntro(String commodityIntro) {
        this.commodityIntro = commodityIntro == null ? null : commodityIntro.trim();
    }

    public String getCommodityPicture() {
        return commodityPicture;
    }

    public void setCommodityPicture(String commodityPicture) {
        this.commodityPicture = commodityPicture == null ? null : commodityPicture.trim();
    }
}