package com.indigo.myFlightUpdates.service;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.repo.AddFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@Service
public class AddFlightService {

    @Autowired
    public AddFlightRepository flightRepository;


    // return all flight
    public List<Flight> getFlights() {

        return flightRepository.findAll();
    }

    public boolean saveFlight(Flight flight) {
        //Don't forget to check if the flight is already present or not
        //*************************************************************


        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        LocalDate depDate = flight.getDepDate();
        LocalTime depTime = flight.getDepTime();

        if((today.compareTo(depDate) == 0 && currentTime.compareTo(depTime) < 0) ||
            today.compareTo(depDate) < 0 ) {


            flightRepository.save(flight);
            return true;
        }

        return false;
    }

    public void deleteDepartedFlight() {
        List<Flight> flights = getFlights();

        for(Flight flight : flights) {
            if(flight.getDepDate().compareTo(LocalDate.now()) <= 0) {
                flightRepository.delete(flight);
            }
        }
    }

    // this will be going to add in some another class
    public boolean deleteCanceledFlight(Flight flight) {
        if(flightRepository.existsById(flight.getFlightNo())) {
            flightRepository.delete(flight);
            return true;
        }

        return false;
    }

    //-------------Check if already present----------------
    public boolean isPresent(Flight flight) {
        return flightRepository.existsById(flight.getFlightNo());
    }

}
