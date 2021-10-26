package com.github.brenoHOC.citiesapi.staties.resources;

import com.github.brenoHOC.citiesapi.countries.Country;
import com.github.brenoHOC.citiesapi.staties.State;
import com.github.brenoHOC.citiesapi.staties.repository.StateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<State> getAll(Pageable page) {
        return repository.findAll(page);
    }
}
