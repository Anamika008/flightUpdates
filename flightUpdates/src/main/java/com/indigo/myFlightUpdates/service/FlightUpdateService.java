package com.indigo.myFlightUpdates.service;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.repo.AddFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightUpdateService {

    @Autowired
    private AddFlightRepository addFlightRepository;
    // because I need to update in the same database and remove entries if required

    // return list of flight that is already added
    public List<Flight> getFlights() {
        return addFlightRepository.findAll();
    }

    public boolean isPresent(String flightId) {
        return addFlightRepository.existsById(flightId);
    }

    public Flight getFlight(String flightId) {
        return addFlightRepository.findById(flightId).get();
    }
}
