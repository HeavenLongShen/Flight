package com.flight.domain;

import java.io.Serializable;

//存放航班座位信息javaBean
public class Beat implements Serializable {
    private String firstClass;
    //头等舱的价格
    private double firstPrice;
    //头等舱的座位数
    private int firstCount;

    private String businessClass;
    //商务舱的价格
    private double businessPrice;
    //商务舱的座位数
    private int businessCount;

    private String economyClass;
    //经济舱的价格
    private double economyPrice;
    //经济舱的座位数
    private int economyCount;

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    public String getBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(String businessClass) {
        this.businessClass = businessClass;
    }

    public String getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(String economyClass) {
        this.economyClass = economyClass;
    }

    public double getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(double firstPrice) {
        this.firstPrice = firstPrice;
    }

    public int getFirstCount() {
        return firstCount;
    }

    public void setFirstCount(int firstCount) {
        this.firstCount = firstCount;
    }

    public double getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(double businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getBusinessCount() {
        return businessCount;
    }

    public void setBusinessCount(int businessCount) {
        this.businessCount = businessCount;
    }

    public double getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(double economyPrice) {
        this.economyPrice = economyPrice;
    }

    public int getEconomyCount() {
        return economyCount;
    }

    public void setEconomyCount(int economyCount) {
        this.economyCount = economyCount;
    }
}
