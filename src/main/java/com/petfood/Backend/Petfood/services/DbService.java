package com.petfood.Backend.Petfood.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfood.Backend.Petfood.model.Location;
import com.petfood.Backend.Petfood.model.Petshop;
import com.petfood.Backend.Petfood.model.Product;
import com.petfood.Backend.Petfood.repository.LocationRepository;
import com.petfood.Backend.Petfood.repository.PetshopRepository;
import com.petfood.Backend.Petfood.repository.ProductRepository;

@Service
public class DbService {

        @Autowired
        private PetshopRepository petshopRepository;

        @Autowired
        private ProductRepository productRepository;

        public void instanciaBaseDeDados() {
                // List<Product> product = new ArrayList<>();
                // List<Petshop> petshops = new ArrayList<>();
                // Location location = new Location(1L, 50040, 544444);
                // Location location2 = new Location(2L, 50040, 544444);
                // Location location3 = new Location(3L, 50040, 544444);
                // Location location4 = new Location(4L, 50040, 544444);

                // petshops.add(new Petshop(1L, "PetShop Cao e cia ",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet1.jpg",
                // "raçao",
                // "cachorro ", location));
                // petshops.add(new Petshop(2L, "PetShop Amigo e cia ",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet2.webp",
                // "raçao",
                // "cachorro ", location2));
                // petshops.add(new Petshop(3L, "PetShop gatos e cia ",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet3.avif",
                // "raçao",
                // "cachorro ", location3));
                // petshops.add(new Petshop(4L, "PetShop gatos e dogs ",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/pet/pet4.jpg",
                // "raçao",
                // "cachorro ", location4));

                // Product product2 = new Product(1L, "Racao Glan Plus",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao1.webp",
                // 20.0,
                // "4.8");
                // Product product3 = new Product(2L, "Racao Legal",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao3.webp",
                // 29.0,
                // "4.6");
                // Product product4 = new Product(3L, "Racao gato",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao3.webp",
                // 39.0,
                // "4.6");
                // Product product5 = new Product(4L, "Racao Origens",
                // "https://raw.githubusercontent.com/JoelSantos-JS/PetFood/main/src/assets/racao/racao4.webp",
                // 19.0,
                // "4.6");

                // product.add(product5);
                // product.add(product4);
                // product.add(product3);
                // product.add(product2);

                // Petshop petshop = new Petshop();
                // petshop.getProducts().addAll(product);
                // petshopRepository.saveAll(petshops);
                // productRepository.saveAll(product);

        }

}
