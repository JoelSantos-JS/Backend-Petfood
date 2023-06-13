package com.petfood.Backend.Petfood.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.petfood.Backend.Petfood.model.Location;
import com.petfood.Backend.Petfood.model.Petshop;

public class PetshopDTO {

    private Long id;
    private String name;

    private String logo;
    private String category;

    private String emphasis;

    private Location location;

    public PetshopDTO() {

    }

    public PetshopDTO(Petshop petshop) {
        this.id = petshop.getId();
        this.name = petshop.getName();
        this.logo = petshop.getLogo();
        this.category = petshop.getCategory();
        this.emphasis = petshop.getEmphasis();
        this.location = petshop.getLocation();

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(String emphasis) {
        this.emphasis = emphasis;
    }

}
