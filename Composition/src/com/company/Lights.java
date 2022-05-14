package com.company;

public class Lights {
    private String model;
    private String manufacturer;

    public Lights(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void powerOnLights(String color){
        System.out.println("Powering ON lights with "+color+" color");
    }
}
