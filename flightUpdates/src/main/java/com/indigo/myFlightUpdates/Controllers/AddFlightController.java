package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.entity.Passenger;
import com.indigo.myFlightUpdates.service.AddFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Controller
@RequestMapping("/add-flight")
public class AddFlightController {

    @Autowired
    private AddFlightService addFlightService;

    @GetMapping
    public String addFlight(Model model) {
        model.addAttribute("flight", new Flight());
        return "addFlight";
    }

    @PostMapping
    public String addFlight(@ModelAttribute Flight flight, Model model) {
        // Process the flight object
        addFlightService.saveFlight(flight);
        return "redirect:/";
    }

}
