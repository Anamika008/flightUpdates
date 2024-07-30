package com.indigo.myFlightUpdates.service;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.entity.Passenger;
import com.indigo.myFlightUpdates.repo.AddFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CancelFlightService {
    @Autowired
    private AddFlightRepository addFlightRepository;

    public boolean cancelFlight(String flightId) {

        if(!addFlightRepository.existsById(flightId)) {
            return false;
        }

        Flight flight = addFlightRepository.findById(flightId).orElse(null);
        List<Passenger> passengers = flight.getPassengers();

        NotificationService mailNotification = new NotificationService();
        String text = "Your flight has been cancelled.\nSorry for inconvenience.\n\nBest Regards,\nIndigo";

        for(Passenger passenger : passengers) {
            mailNotification.sendMail(passenger.getEmail(),"Flight Cancel",text);
        }

        addFlightRepository.deleteById(flightId);
        return true;
    }
}
