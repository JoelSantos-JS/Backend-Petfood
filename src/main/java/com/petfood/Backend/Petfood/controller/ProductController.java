package com.petfood.Backend.Petfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petfood.Backend.Petfood.dto.ProductDTO;
import com.petfood.Backend.Petfood.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    public Page<ProductDTO> getAllProducts(Pageable pageable) {

    }

}
