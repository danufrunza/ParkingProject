package com.dprojects.dto;


public class CarDTO
{

    public int id;
    public String marca;
    public String model;

    // Constructor
    public CarDTO(int id, String marca, String model) {
        this.id = id;
        this.model = model;
        this.marca = marca;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }
}
