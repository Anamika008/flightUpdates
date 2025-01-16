package com.flightUpdates.FlightUpdates.Entity;

public class Passenger {
    String passengerName;
    int age;
    String gender;
    String contact;
    String email;

    public Passenger() {}

    public Passenger(String passengerName, int age, String gender) {
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public Passenger setPassengerName(String passengerName) {
        this.passengerName = passengerName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Passenger setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Passenger setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public Passenger setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Passenger setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerName='" + passengerName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
