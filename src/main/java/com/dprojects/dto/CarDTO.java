package com.dprojects.dto;


import com.dprojects.enums.CarType;

public class CarDTO
{

    public int id;
    public String marca;
    public String model;
    public CarType type; // Using the enum as a type
    public boolean forSale; // Using the enum as a type

    // Constructor
    public CarDTO(int id, String marca, String model, boolean forSale, CarType type) {
        this.id = id;
        this.model = model;
        this.marca = marca;
        this.type = type;
        this.forSale = forSale;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }
    public boolean isForSale() { // Getter for forSale
        return forSale;
    }
    public String getModel() {
        return model;
    }
}
