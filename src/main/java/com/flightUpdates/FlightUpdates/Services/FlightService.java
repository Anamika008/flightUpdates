package com.flightUpdates.FlightUpdates.Services;

import com.flightUpdates.FlightUpdates.Entity.Flight;
import org.springframework.stereotype.Service;
import java.time.LocalTime;
import java.util.*;

@Service
public class FlightService {
    // Map< flightNo, Flight >
    private Map<String, Flight> flights = new HashMap<>();

    // Map< gateNo, list of flights>
    private Map<String,List<Flight>> gates = new HashMap<>();

    // Map< flightNo, gateNo >
    private Map<String, String> flightToGate = new HashMap<>();

    public FlightService() {
        for(char ch='A' ; ch<='F' ; ch++) {
            gates.put( Character.toString(ch), new ArrayList<>());
        }
    }

    public boolean addFlight(Flight flight) {
        flights.put(flight.getFlightNo(),flight);
        return true;
    }

    public Flight getFlight(String flightNo) {
        if(flights.containsKey(flightNo)) return flights.get(flightNo);

        return null;
    }

    public List<Flight> getFlightsList() {
        return flights.values().stream().toList();
    }

    public boolean isFlightAvailable(String flightNo) {
        return flights.containsKey(flightNo);
    }

    public boolean updateFlightDetails(String flightNo, LocalTime arrivalTime, LocalTime depTime) {
        if(isFlightAvailable(flightNo)) {
            // get the current Flight
            Flight flight = flights.get(flightNo);

            // set their arrival and departure time
            if(arrivalTime != null) flight.setArrival(arrivalTime);
            if(depTime != null)     flight.setDeparture(depTime);

            return true;
        }

        return false;
    }

    public boolean addFlightToGate(String gate, String flightNo){
        List<Flight> flightList;

        if(isGatePresent(gate)) {
            flightList = gates.get(gate);
        }
        else {
            return false;
        }

        flightList.add(flights.get(flightNo));
        flightToGate.put(flightNo,gate);

        return true;
    }

    public boolean isGatePresent(String gateNo){
        return gates.containsKey(gateNo);
    }

    public Map<String,String> getFlightToGate(){
        return flightToGate;
    }

    public boolean deleteFlight(String flightNo) {
        if(isFlightAvailable(flightNo)) {
            flights.remove(flightNo);
            return true;
        }
        return false;
    }
}
