package com.petfood.Backend.Petfood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.petfood.Backend.Petfood.repository.PetshopRepository;

@Service
public class PetshopService {

    @Autowired
    private PetshopRepository petshopRepository;

}
