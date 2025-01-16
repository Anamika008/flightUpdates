package com.flightUpdates.FlightUpdates.Entity;

import java.util.ArrayList;
import java.util.List;

public class Gate {
    String gateNo;
    private List<Flight> scheduled;

    public String getGateNo() {
        return gateNo;
    }

    public Gate setGateNo(String gateNo) {
        this.gateNo = gateNo;
        return this;
    }

    public List<Flight> getScheduled() {
        return scheduled;
    }

    public Gate setSchedule(List<Flight> scheduled) {
        this.scheduled = scheduled;
        return this;
    }
}
