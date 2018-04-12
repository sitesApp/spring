package com.eci.cosw.springbootsecureapi.model;

import java.math.BigInteger;

public class Person {

    String name;
    String username;
    String email;
    String celphone;
    String password;

    public Person(String name, String username, String email, String celphone, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.celphone = celphone;
        this.password = password;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
