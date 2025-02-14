package com.flight.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight implements Serializable {
    //航班编号
    private String flightId;
    //出发城市
    private String departureCity;
    //到达城市
    private String finalCity;
    //出发时间
    private Date departureTime;
    private String departureTimeStr;
    //到达时间
    private Date arrivalTime;
    private String arrivalTimeStr;

    //获取航班对应的座位信息
    private Beat beat;
    //获取对应的旅客信息
    private Traveller traveller;

    public Traveller getTraveller() {
        return traveller;
    }

    public void setTraveller(Traveller traveller) {
        this.traveller = traveller;
    }

    public Beat getBeat() {
        return beat;
    }

    public void setBeat(Beat beat) {
        this.beat = beat;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getFinalCity() {
        return finalCity;
    }

    public void setFinalCity(String finalCity) {
        this.finalCity = finalCity;
    }

    public Date getDepartureTime() throws ParseException {
        if(departureTimeStr != null){
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return df.parse(departureTimeStr);
        }
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepartureTimeStr() {
        if(departureTime != null){
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String time=df.format(departureTime);
            return time;
        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Date getArrivalTime() throws ParseException {
        if(arrivalTimeStr != null){
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return df.parse(arrivalTimeStr);
        }
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrivalTimeStr() {
        if(arrivalTime != null){
            SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String time=df.format(arrivalTime);
            return time;
        }
        return arrivalTimeStr;
    }

    public void setArrivalTimeStr(String arrivalTimeStr) {
        this.arrivalTimeStr = arrivalTimeStr;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId='" + flightId + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", finalCity='" + finalCity + '\'' +
                ", departureTime=" + departureTime +
                ", departureTimeStr='" + departureTimeStr + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", arrivalTimeStr='" + arrivalTimeStr + '\'' +
                ", beat=" + beat +
                '}';
    }
}
