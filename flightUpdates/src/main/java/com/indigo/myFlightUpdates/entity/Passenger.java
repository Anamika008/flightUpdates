package com.indigo.myFlightUpdates.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "passengerDB")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public final class Passenger {

    @NonNull
    String name;
    @Id
    @Indexed(unique = true)
    String email;
    @Indexed(unique = true)
    String contact;



}







