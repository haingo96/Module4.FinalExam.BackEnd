package com.example.restpractice1.controller;

import com.example.restpractice1.model.City;
import com.example.restpractice1.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin("*")
public class CityController {

    @Autowired
    private ICityService iCityService;

    @GetMapping
    public ResponseEntity<List<City>> getAllCity() {
        List<City> cities = iCityService.findAll();

        if (cities.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(cities, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<?> saveCity(@RequestBody City city) {
        iCityService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/{cityId}")
    public ResponseEntity<City> getCity(@PathVariable Long cityId) {
        return new ResponseEntity<>(iCityService.findById(cityId), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> editCity(@RequestBody City city) {
        iCityService.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(path = "/{cityId}")
    public ResponseEntity<?> deleteCity(@PathVariable Long cityId) {
        iCityService.delete(cityId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
