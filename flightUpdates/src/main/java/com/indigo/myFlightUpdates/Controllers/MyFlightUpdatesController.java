package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.service.FlightUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

@Controller
public class MyFlightUpdatesController {

    @Autowired
    private FlightUpdateService flightUpdateService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("flights", flightUpdateService.getFlights());
        return "home";
    }

    @GetMapping("/update-flight-status")
    public String getUpdateFlightDateTime(Model model) {
        model.addAttribute("message", "");
        return "updateFlightDateTime";
    }

    @PostMapping("/update-flight-status")
    public String updateFlightDateTime(@RequestBody String flightNo, @RequestBody LocalDate depDate,@RequestBody LocalTime depTime,Model model) {
        if(!flightUpdateService.isPresent(flightNo)) {
            model.addAttribute("message", "is not Present in the database");
            return "redirect:/flightStatus";
        }

        Flight savedFlight = flightUpdateService.getFlight(flightNo);

        LocalDate today = LocalDate.now();
        LocalTime todayTime = LocalTime.now();

        if(depDate.compareTo(today) < 0 || (depDate.compareTo(today) == 0 && depTime.compareTo(todayTime) < 0)) {
            model.addAttribute("message", " already departed.");
            return "redirect:/flightStatus";
        }

        model.addAttribute("message", " Delay by " + depDate+" time:"+depTime);
        return "redirect:/flightStatus";
    }

}
