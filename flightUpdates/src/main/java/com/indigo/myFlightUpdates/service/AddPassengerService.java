package com.indigo.myFlightUpdates.service;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.entity.Passenger;
import com.indigo.myFlightUpdates.repo.AddFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddPassengerService {

    private AddFlightRepository addFlightRepository;

    public boolean addPassenger(String flightNo,String name,String email,String contact) {
        Optional<Flight> flights = addFlightRepository.findById(flightNo);

        Passenger passenger = new Passenger(name,email,contact);

        for(Flight flight: flights.stream().toList())
            if (flight.getPassengers().size() <= 10) {
                flight.getPassengers().add(passenger);
                return true;
            }

        return false;
    }

}
