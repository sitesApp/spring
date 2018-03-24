package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Category;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    private List<Category> categorys = new ArrayList<>();


    @Autowired
    public CategoryServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        categorys.add(new Category("Restaurantes", "/assets/category/restaurantes.png"));
        categorys.add(new Category("Bares", "/assets/category/bares.png"));
        categorys.add(new Category("Cafeterias", "/assets/category/cafeterias.png"));
        categorys.add(new Category("Paintball", "/assets/category/paintball.png"));
    }

    @Override
    public List<Category> getCategorys() {
        return categorys;
    }
}
