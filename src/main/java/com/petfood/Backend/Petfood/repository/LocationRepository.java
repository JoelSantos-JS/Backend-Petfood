package com.petfood.Backend.Petfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petfood.Backend.Petfood.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
