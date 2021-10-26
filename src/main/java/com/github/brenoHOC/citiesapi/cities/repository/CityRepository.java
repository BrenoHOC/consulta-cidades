package com.github.brenoHOC.citiesapi.cities.repository;

import com.github.brenoHOC.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
