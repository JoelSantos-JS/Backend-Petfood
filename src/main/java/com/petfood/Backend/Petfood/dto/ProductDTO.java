package com.petfood.Backend.Petfood.dto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.petfood.Backend.Petfood.model.Petshop;
import com.petfood.Backend.Petfood.model.Product;

public class ProductDTO {

    private long id;
    private String name;
    private String cape;
    private double price;
    private String avaliations;

    Set<PetshopDTO> petshop = new HashSet<>();

    public ProductDTO() {

    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.cape = product.getCape();
        this.cape = product.getCape();
        this.price = product.getPrice();
        this.avaliations = product.getAvaliations();
        product.getPetshops().forEach(e -> this.petshop.add(new PetshopDTO(e)));
    }

    public ProductDTO(Product product, Set<Petshop> petshop) {
        this(product);

    }

    public Set<PetshopDTO> getPetshop() {
        return petshop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCape() {
        return cape;
    }

    public void setCape(String cape) {
        this.cape = cape;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAvaliations() {
        return avaliations;
    }

    public void setAvaliations(String avaliations) {
        this.avaliations = avaliations;
    }

}
