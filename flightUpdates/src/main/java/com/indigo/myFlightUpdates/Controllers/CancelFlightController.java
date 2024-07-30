package com.indigo.myFlightUpdates.Controllers;

import com.indigo.myFlightUpdates.service.CancelFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cancel-flight")
public class CancelFlightController {

    private CancelFlightService cancelFlightService;

    @GetMapping
    public String getCancelFlight(Model model) {
        model.addAttribute("message","");
        return "cancelFlight";
    }

    @PostMapping
    public String postCancelFlight(@RequestBody String flightNo, Model model) {
        boolean cancel = cancelFlightService.cancelFlight(flightNo);

        if(cancel)
            model.addAttribute("message", " is cancelled.");
        else{
            model.addAttribute("message", " is not present.");
        }

        return "redirect:/flightStatus";
    }
}
