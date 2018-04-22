package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Person;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


public class PersonServiceImpl implements PersonService{


    private List<Person> persons = new ArrayList<>();

    @PostConstruct
    private void populateSampleData()
    {
        persons.add( new Person("Alejandro Villarraga", "AlejandroVillarraga", "davg@gmail.com", "3158823178", "1234") );

    }



    @Override
    public Person getUser(String username) {
        int j = -1;
        for(int i=0;i<persons.size();i++) {
            if(persons.get(i).getUsername().equals(username)){
                j = i;
            }
        }
        return persons.get(j);
    }

    @Override
    public Person createPerson(Person person) {
        persons.add(person);
        return person;
    }
}
