package com.flightUpdates.FlightUpdates.Entity;

public class User {
    private String email;
    private String contact;
    private String password;

    public User() {
    }

    public User(String email, String contact, String password) {
        this.email = email;
        this.contact = contact;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getContact() {
        return contact;
    }

    public User setContact(String contact) {
        this.contact = contact;
        return this;
    }

    @Override
    public String toString() {
        return "User {" +
                "email = '" + email + '\'' +
                ", contact = '" + contact + '\'' +
                ", password = '" + password + '\'' +
                '}';
    }
}
