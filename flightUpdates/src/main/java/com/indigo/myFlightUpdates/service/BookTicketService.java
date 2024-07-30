package com.indigo.myFlightUpdates.service;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.repo.AddFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class BookTicketService {

    private AddFlightRepository addFlightRepository;

    public Flight available(String from, String to, LocalDate depDate) {
        Optional<Flight> flights = addFlightRepository.findByFromAndToAndDepDate(from, to, depDate);
        if (flights.isPresent())
            return flights.get();

        return null;
    }
}
