package com.flightUpdates.FlightUpdates.Services;

import com.flightUpdates.FlightUpdates.Entity.Passenger;
import com.flightUpdates.FlightUpdates.Entity.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {
    private Map<String, Passenger> map = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    public boolean addPassenger(Passenger passenger) {
        return true;
    }

    public boolean addUser(User user) {
        if(users.containsKey(user.getContact())) {
            return false;
        }
        else {
            users.put(user.getEmail(), user);

            System.out.println(users);
            return true;
        }
    }

}
