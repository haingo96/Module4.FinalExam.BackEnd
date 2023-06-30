package com.example.restpractice1.service;

import com.example.restpractice1.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();

    City findById(Long id);

    void save(City city);

    void delete(Long id);
}
