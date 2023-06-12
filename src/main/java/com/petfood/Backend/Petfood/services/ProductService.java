package com.petfood.Backend.Petfood.services;

import javax.xml.crypto.KeySelector.Purpose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.petfood.Backend.Petfood.dto.PetshopDTO;
import com.petfood.Backend.Petfood.dto.ProductDTO;
import com.petfood.Backend.Petfood.model.Petshop;
import com.petfood.Backend.Petfood.model.Product;
import com.petfood.Backend.Petfood.repository.PetshopRepository;
import com.petfood.Backend.Petfood.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PetshopRepository petshopRepository;

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
        product.getPetshops().clear();

        for (PetshopDTO petshopDTO : dto.getPetshop()) {
            Petshop petshop = petshopRepository.getOne(petshopDTO.getId());
            product.getPetshops().add(petshop);
        }

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
        product.getPetshops().clear();

        for (PetshopDTO petshopDTO : dto.getPetshop()) {
            Petshop petshop = petshopRepository.getOne(petshopDTO.getId());
            product.getPetshops().add(petshop);
        }

        product = productRepository.save(product);

        return new ProductDTO(product);

    }

    public void deleteById(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
            throw new RuntimeException("Não foi possivel deletar o produto");
        }

    }

}