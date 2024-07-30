package com.indigo.myFlightUpdates.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "FlightDetails")
@Getter
@Setter
@NoArgsConstructor
public class Flight {
    @Id
    private String flightNo;
    @NonNull
    private String from;
    @NonNull
    private String to;
    @NonNull
    private LocalDate depDate;
    @NonNull
    private LocalTime depTime;

    @DBRef
    private List<Passenger> passengers = new ArrayList<>();

    @Override
    public String toString() {
        return "Flight {" +
                "flightNo: '" + flightNo + '\'' +
                ", from:'" + from + '\'' +
                ", to:'" + to + '\'' +
                ", depDate:" + depDate +
                ", depTime:" + depTime +
                ", passengers: " + passengers +
                '}';
    }

}
