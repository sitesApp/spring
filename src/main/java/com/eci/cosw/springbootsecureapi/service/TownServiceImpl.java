package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Town;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class TownServiceImpl implements TownService {

    private List<Town> towns = new ArrayList<>();

    @PostConstruct
    private void populateSampleData()
    {
        towns.add( new Town("Cajicá") );
        towns.add( new Town("Chia") );

    }


    @Override
    public List<Town> getTowns() {
        return towns;
    }
}
