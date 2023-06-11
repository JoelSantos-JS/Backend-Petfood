package com.petfood.Backend.Petfood.dto;

import com.petfood.Backend.Petfood.model.Petshop;

public class PetshopDTO {

    private Long id;
    private String name;
    private String logo;
    private String category;
    private String emphasis;
    private Object location;

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

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

}