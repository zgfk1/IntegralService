package com.czbank.integralservice.model;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class Commodity implements Serializable {
    //0定义字段
    @NotBlank
    @Length(max = 11)
    private long commodity_id;

    @NotBlank
    @Length(max = 50)
    private String commodity_name;

    @NotBlank
    @Length(max = 255)
    private long commodity_integral;

    @NotBlank
    @Length(max = 255)
    private long commodity_amount;

    @NotBlank
    @Length(max = 50)
    private int commodity_exchangenum;

    @NotBlank
    @Length(max = 50)
    private int commodity_availablenum;

    @Length(max = 255)
    private String commodity_intro;

    @Length(max = 255)
    private String commodity_picture;

    //1定义属性 get,set

    public long getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(long commodity_id) {
        this.commodity_id = commodity_id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public long getCommodity_integral() {
        return commodity_integral;
    }

    public void setCommodity_integral(long commodity_integral) {
        this.commodity_integral = commodity_integral;
    }

    public long getCommodity_amount() {
        return commodity_amount;
    }

    public void setCommodity_amount(long commodity_amount) {
        this.commodity_amount = commodity_amount;
    }

    public int getCommodity_exchangenum() {
        return commodity_exchangenum;
    }

    public void setCommodity_exchangenum(int commodity_exchangenum) {
        this.commodity_exchangenum = commodity_exchangenum;
    }

    public int getCommodity_availablenum() {
        return commodity_availablenum;
    }

    public void setCommodity_availablenum(int commodity_availablenum) {
        this.commodity_availablenum = commodity_availablenum;
    }

    public String getcommodity_intro() {
        return commodity_intro;
    }

    public void setCommodity_intro(String commodity_intro) {
        this.commodity_intro = commodity_intro;
    }

    public String setCommodity_picture() {
        return commodity_picture;
    }

    public void setCommodity_picture(String commodity_picture) {
        this.commodity_picture = commodity_picture;
    }

    //2定义空构造
    public Commodity() {
    }

    //3定义构造的重载
    public Commodity(long commodity_id, String commodity_name, long commodity_integral,
                     long commodity_amount, int commodity_exchangenum, int commodity_availablenum,
                     String commodity_intro, String commodity_picture) {
        this.commodity_id = commodity_id;
        this.commodity_name = commodity_name;
        this.commodity_integral = commodity_integral;
        this.commodity_amount = commodity_amount;
        this.commodity_exchangenum = commodity_exchangenum;
        this.commodity_availablenum = commodity_availablenum;
        this.commodity_intro = commodity_intro;
        this.commodity_picture = commodity_picture;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodity_id=" + commodity_id +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_integral=" + commodity_integral +
                ", commodity_amount=" + commodity_amount +
                ", commodity_exchangenum=" + commodity_exchangenum +
                ", commodity_availablenum=" + commodity_availablenum +
                ", commodity_intro='" + commodity_intro + '\'' +
                ", commodity_picture='" + commodity_picture + '\'' +
                '}';
    }
}
