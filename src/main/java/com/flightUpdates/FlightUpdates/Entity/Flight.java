package com.flightUpdates.FlightUpdates.Entity;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class Flight {
    private String src;
    private String des;
    private String flightNo; // fixed length 8
    private LocalTime departure;
    private LocalTime arrival;

    public Flight() { }

    public Flight(String src, String des, String flightNo, LocalTime departure, LocalTime arrival) {
        this.src = src;
        this.des = des;
        this.flightNo = flightNo;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getSrc() {
        return src;
    }

    public Flight setSrc(String src) {
        this.src = src;
        return this;
    }

    public String getDes() {
        return des;
    }

    public Flight setDes(String des) {
        this.des = des;
        return this;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public Flight setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        return this;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public LocalTime getArrival() {
        return arrival;
    }

    public void setArrival(LocalTime arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Flight {" +
                "src='" + src + '\'' +
                ", des='" + des + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", departure=" + departure + '\'' +
                ", arrival=" + arrival +
                '}';
    }
}
