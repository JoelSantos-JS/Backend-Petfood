package com.petfood.Backend.Petfood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private double lat;
    private double len;

    // Construtor

    public Location() {

    }

    public Location(long id, Double lat, Double len) {
        this.id = id;
        this.lat = lat;
        this.len = len;
    }

    // Getters e Setters
    public double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public double getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
