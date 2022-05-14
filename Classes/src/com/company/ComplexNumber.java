package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;

    }

    public void add(ComplexNumber another){
        this.real  = this.real + another.real;
        this.imaginary = this.imaginary + another.imaginary;

    }

    public void subtract(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;

    }

    public void subtract(ComplexNumber another){
        this.real = this.real - another.real;
        this.imaginary = this.imaginary - another.imaginary;

    }
}
