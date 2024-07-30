package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.entity.Flight;
import com.indigo.myFlightUpdates.entity.Passenger;
import com.indigo.myFlightUpdates.service.AddFlightService;
import com.indigo.myFlightUpdates.service.BookTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("/book-flight")
public class BookTicketController {

    private BookTicketService bookTicketService;

    @GetMapping
    public String getBookTicket() {
        return "bookTicket";
    }

    @PostMapping
    public String addBookTicket(@RequestParam String from, @RequestParam String to, @RequestParam LocalDate date, Model model) {
        Flight flight = bookTicketService.available(from, to, date);

        if(flight == null || flight.getPassengers().size() >= 10) {
            model.addAttribute("message", " is full...");
            return "redirect:/flightStatus";
        }

        model.addAttribute("flightNo", flight.getFlightNo());
        return "redirect:/addPassengers";
    }
}
