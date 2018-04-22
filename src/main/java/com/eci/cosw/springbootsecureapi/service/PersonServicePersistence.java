package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Person;
import com.eci.cosw.springbootsecureapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServicePersistence implements PersonService {

    @Autowired
    PersonRepository perrepo;

    @Override
    public Person getUser(String username) {
        return perrepo.getOne(username);
    }

    @Override
    public Person createPerson(Person person) {
        return perrepo.save(person);
    }
}

