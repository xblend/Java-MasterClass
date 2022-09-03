package com.company;

public class DogMain {
    //This will explain the problems of equals and hashCode for having a subclass instance
    public static void main(String[] args) {
        Dog mani = new Dog("mani");
        Labrador mani2 = new Labrador("mani");

        System.out.println(mani.equals(mani2));//Returns true because object of Labrador is an instance of Dog class
        System.out.println(mani2.equals(mani));//Returns false because object of Dog is not an instance of Labrador class
        System.out.println(mani.getClass());
        System.out.println(mani2.getClass());

        //To overcome this we should either declare the class as final or, the equals and hashCode methods as final

    }
}
