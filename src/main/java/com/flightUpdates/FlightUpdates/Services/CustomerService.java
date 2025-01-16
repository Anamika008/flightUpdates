package com.flightUpdates.FlightUpdates.Services;

import com.flightUpdates.FlightUpdates.Entity.Passenger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {
    private Map<String, Passenger> map = new HashMap<>();

    public boolean addPassenger(Passenger passenger) {

        return true;
    }



}
