package com.flightUpdates.FlightUpdates.Controllers;

import com.flightUpdates.FlightUpdates.Entity.Flight;
import com.flightUpdates.FlightUpdates.Services.FlightService;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Controller
public class FlightController {
    @Autowired
    private FlightService flightService;

    // This should map to home.jsp in the static folder
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // Showing the list of flights
    @GetMapping("/flights")
    public String getFlight(Model model) {
        List<Flight> flights = flightService.getFlightsList();
        model.addAttribute("flights",flights);
        model.addAttribute("flightToGate",flightService.getFlightToGate());
        return "flight-details";
    }

    // Add the flights then render to the /flights
    @GetMapping("/add-flight")
    public String addFlight(){
        return "add-flight";
    }

    @PostMapping("/add-flight")
    public String addFlight(@ModelAttribute Flight flight){
        flightService.addFlight(flight);
        return "redirect:flights";
    }

    // Update
    @GetMapping("/update-flight")
    public String updateFlightDetails(){
        return "update-flight";
    }

    @GetMapping ("/check-flight")
    public String checkFlight(@RequestParam String flightNo) {
        if(flightService.isFlightAvailable(flightNo)) {
            return "redirect:update/"+flightNo;
        }
        return "redirect:add-flight";
    }

    @GetMapping("/update/{flightNo}")
    public String updateFlight(@PathVariable String flightNo, Model model) {
        model.addAttribute("flightNo",flightNo);
        return "update";
    }

    @PostMapping("/update/{flightNo}")
    public String updateFlightTimeAndGate(@PathVariable String flightNo,
                                          @RequestParam String gate,
                                          @RequestParam String arrivalTime,
                                          @RequestParam String departureTime) {

        LocalTime arrival = null,departure = null;

        if(!arrivalTime.equals("")) {
            arrival = LocalTime.parse(arrivalTime);
        }

        if(!departureTime.equals("")) {
            departure = LocalTime.parse(departureTime);
        }

        flightService.updateFlightDetails( flightNo, arrival, departure);
        flightService.addFlightToGate( gate, flightNo);

        return "redirect:/flights";
    }

    @DeleteMapping("/flights/{flightNo}")
    public boolean removeFlight(@PathVariable String flightNo) {
        flightService.deleteFlight(flightNo);
        return true;
    }

}
