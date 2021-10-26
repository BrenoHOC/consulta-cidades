package com.github.brenoHOC.citiesapi.cities.resources;

import com.github.brenoHOC.citiesapi.cities.City;
import com.github.brenoHOC.citiesapi.cities.repository.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    private final CityRepository repository;

    public CityResource(final CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> getAll(Pageable page) {
        return repository.findAll(page);
    }
}
