package com.petfood.Backend.Petfood.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfood.Backend.Petfood.model.Location;
import com.petfood.Backend.Petfood.model.Petshop;
import com.petfood.Backend.Petfood.model.Product;
import com.petfood.Backend.Petfood.repository.PetshopRepository;
import com.petfood.Backend.Petfood.repository.ProductRepository;

@Service
public class DbService {

    @Autowired
    private PetshopRepository petshopRepository;

    @Autowired
    private ProductRepository productRepository;

    public void instanciaBaseDeDados() {
        List<Product> product = new ArrayList<>();
        List<Petshop> petshops = new ArrayList<>();
        Location location = new Location(1L, 50040, 544444);
        petshops.add(new Petshop(1L, "PetShop ", "salve", "raçao", "cachorro ", location));

        petshopRepository.saveAll(petshops);

    }

}
