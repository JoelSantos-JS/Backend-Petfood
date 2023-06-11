package com.petfood.Backend.Petfood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petfood.Backend.Petfood.dto.ProductDTO;
import com.petfood.Backend.Petfood.model.Product;
import com.petfood.Backend.Petfood.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> product = productRepository.findAll(pageable);

        return product.map(e -> new ProductDTO(e));

    }

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = productRepository.getOne(id);
        return new ProductDTO(product);
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto) {
        Product product = new Product();

        product.setName(dto.getName());
        product.setAvaliations(dto.getAvaliations());
        product.setPrice(dto.getPrice());
        product.setAvaliations(dto.getAvaliations());
        product.setCape(dto.getCape());

        product = productRepository.save(product);

        return new ProductDTO(product);

    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO dto) {
        Product product = productRepository.getById(id);
        product.setName(dto.getName());
        product.setAvaliations(dto.getAvaliations());
        product.setPrice(dto.getPrice());
        product.setAvaliations(dto.getAvaliations());
        product.setCape(dto.getCape());

        product = productRepository.save(product);

        return new ProductDTO(product);

    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);

    }

}