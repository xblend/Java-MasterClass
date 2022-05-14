package com.company;

public class Furniture {
    private String name;
    private String material;
    private Dimensions dimensions;

    public Furniture(String name, String material, Dimensions dimensions) {
        this.name = name;
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    private Dimensions getDimensions() {
        return dimensions;
    }

    public void getInfo(){
        System.out.println(this.name+" is of size "+this.dimensions.getWidth()+"x"+this.dimensions.getHeight()+"x"+
                this.dimensions.getDepth()+" made up of "+this.material);
    }
}
