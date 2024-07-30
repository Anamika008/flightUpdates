package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.service.AddPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add-passenger")
public class AddPassengerController {
    @Autowired
    private AddPassengerService addPassengerService;

    @GetMapping
    public String getAddPassengerForm(){

        return "addPassenger";
    }

    @PostMapping
    public String addPassenger(@RequestBody String name,
                               @RequestBody String email,
                               @RequestBody String contact,
                               @RequestBody String flightNo,
                               Model model){

        boolean add = addPassengerService.addPassenger(flightNo,name,email,contact);
        if(!add){
            model.addAttribute("message", "Unable to add passenger.");
            return "redirect:/flightStatus";
        }

        return "redirect:/";
    }
}
