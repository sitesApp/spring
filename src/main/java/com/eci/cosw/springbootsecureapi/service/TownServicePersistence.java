package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Town;
import com.eci.cosw.springbootsecureapi.repositories.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TownServicePersistence implements  TownService{

    @Autowired
    TownRepository townrepo;

    @Override
    public List<Town> getTowns() {
        return townrepo.findAll();
    }
}
