package com.petfood.Backend.Petfood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petfood.Backend.Petfood.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
