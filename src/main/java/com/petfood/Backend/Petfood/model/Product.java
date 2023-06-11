package com.petfood.Backend.Petfood.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cape;
    private double price;
    private String avaliations;

    @ManyToMany
    @JoinTable(name = "tb_product_petshop", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "petshop_id"))
    private Set<Petshop> petshops = new HashSet<>();

    public Product() {

    }

    public Product(long id, String name, String cape, double price, String avaliations) {
        this.id = id;
        this.name = name;
        this.cape = cape;
        this.price = price;
        this.avaliations = avaliations;
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

    public Set<Petshop> getPetshop() {
        return petshop;
    }

    public void setPetshop(Set<Petshop> petshop) {
        this.petshop = petshop;
    }

}
