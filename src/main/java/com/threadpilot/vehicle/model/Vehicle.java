package com.threadpilot.vehicle.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @Column(name = "registration_number")
    private String registrationNumber;
    @Column(name = "fuel_type")
    private String fuelType;
    @Column(name = "model")
    private String model;
    @Column(name = "make")
    private String make;
    @Column(name = "year")
    private int year;
    @Column(name = "color")
    private String color;
    @Column(name = "owner_personal_number")
    private String ownerPersonalNumber;
    @Column(name = "mileage")
    private Long mileage;

    public Vehicle() {}

    public Vehicle(String registrationNumber, String fuelType, String model, String make, int year, String color, String ownerPersonalNumber, Long mileage) {
        this.registrationNumber = registrationNumber;
        this.fuelType = fuelType;
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
        this.ownerPersonalNumber = ownerPersonalNumber;
        this.mileage = mileage;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getOwnerPersonalNumber() { return ownerPersonalNumber; }
    public void setOwnerPersonalNumber(String ownerPersonalNumber) { this.ownerPersonalNumber = ownerPersonalNumber; }
    public Long getMileage() { return mileage; }
    public void setMileage(Long mileage) { this.mileage = mileage; }
}
