package com.indigo.myFlightUpdates.repo;


import com.indigo.myFlightUpdates.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface AddFlightRepository extends MongoRepository<Flight, String> {

    Optional<Flight> findByFromAndToAndDepDate(String from, String to, LocalDate depDate);
}
