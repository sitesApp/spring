package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Person;
import com.eci.cosw.springbootsecureapi.model.User;

public interface PersonService {

    Person getUser(String username );

    Person createPerson(Person person);
}
