package com.company;

public class Dimensions2D {
    private int length;
    private int width;

    public Dimensions2D(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return this.length*this.width;
    }
}
