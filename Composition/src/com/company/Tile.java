package com.company;

public class Tile {
    private String material;
    private Dimensions2D dimensions;
    private String manufacturer;


    public Tile(String material, Dimensions2D dimensions, String manufacturer) {
        this.material = material;
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions2D getDimensions() {
        return dimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
