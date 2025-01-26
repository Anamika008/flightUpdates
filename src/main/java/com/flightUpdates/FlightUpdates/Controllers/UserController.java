package com.flightUpdates.FlightUpdates.Controllers;

import com.flightUpdates.FlightUpdates.Entity.User;
import com.flightUpdates.FlightUpdates.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/sign-up")
    public String signUp() { return "sign-up" ; }

    @PostMapping("/sign-up")
    public String addUser(@RequestParam String contact,
                          @RequestParam String email,
                          @RequestParam String password,
                          @RequestParam String confirmPassword,
                          Model model) {

        if( password.equals(confirmPassword) ) {
            User newuser = new User(email, contact, password);
            customerService.addUser(newuser);

            System.out.println("Password matched...");
            model.addAttribute("userName",email);
            model.addAttribute("userContact",contact);
            return "user-home";
        }
        else {
            System.out.println("Password not matched...");
        }

        return "redirect:/flights";
    }
}
