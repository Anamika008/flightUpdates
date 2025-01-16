package com.flightUpdates.FlightUpdates.Controllers;

import com.flightUpdates.FlightUpdates.Entity.Passenger;
import com.flightUpdates.FlightUpdates.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class PassengerController {
    Map<String,Passenger> passengers = new HashMap<>();

    @GetMapping("/add-passenger")
    public String addPassenger() {
        return "add-passenger";
    }

    @PostMapping("/add-passenger")
    public String getPassengerInfo(@ModelAttribute Passenger passenger) {
        passengers.put(passenger.getContact(),passenger);
        return "redirect:/";
    }

    @GetMapping("/book-flight")
    public String bookFlight() {
        return "book-flight";
    }

    @PostMapping("/book-flight")
    public String checkFlight(){
        return "home";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "sign-up";
    }

}
