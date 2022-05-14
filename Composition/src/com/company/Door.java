package com.company;

public class Door {
    private boolean isSafetyDoor;
    private String material;
    private Dimensions2D dimensions;

    public Door(boolean isSafetyDoor, String material, Dimensions2D dimensions) {
        this.isSafetyDoor = isSafetyDoor;
        this.material = material;
        this.dimensions = dimensions;
    }

    public void openDoor(){
        System.out.println("Opening the door.....");
    }

    public boolean isSafetyDoor() {
        return isSafetyDoor;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions2D getDimensions() {
        return dimensions;
    }
}
