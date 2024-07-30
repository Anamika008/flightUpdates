package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.service.FlightUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("/flight-status")
public class MyFlightStatus {

    private FlightUpdateService flightUpdateService;

    @GetMapping
    public String getFlight(Model model) {

        return "checkFlightStatus";
    }

    @PostMapping
    public String checkFlightStatus(@RequestParam String flightNo, @RequestParam LocalDate depDate, Model model) {
        model.addAttribute("status", flightUpdateService.getFlight(flightNo));

        return "flightStatus";
    }

}
