package com.petfood.Backend.Petfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfood.Backend.Petfood.services.PetshopService;

@RestController
@RequestMapping("/petshop")
public class PetshopController {

    @Autowired
    private PetshopService petshopService;

}
