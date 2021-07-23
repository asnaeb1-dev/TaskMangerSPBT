package com.example.taskmanager.Model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.bson.BSONObject;

import java.time.LocalDate;

public class User {

    private String _id;
    private String username;
    private String emailAddress;
    private String name;
    private String password;
    @JsonDeserialize(as = LocalDate.class)
    private LocalDate dob;

    public User() {
    }

    public User(String username, String emailAddress, String name, String password, LocalDate dob) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.name = name;
        this.password = password;
        this.dob = dob;
    }

    public User(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dob=" + dob +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getID(){
        return _id;
    }
}
