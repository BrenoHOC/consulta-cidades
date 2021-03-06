package com.github.brenoHOC.citiesapi.countries.resources;

import com.github.brenoHOC.citiesapi.countries.Country;
import com.github.brenoHOC.citiesapi.countries.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Country> getAll(Pageable page) {
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getById(@PathVariable Long id) {

        Optional<Country> optional = repository.findById(id);

        return optional.get();
    }
}
