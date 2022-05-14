package com.company;

public class Main {

    //Instance of a class is created when an object of a class is initiated using a "new" keyword
    //Reference of a class is created when an instance of an object is being referred by another object.

    public static void main(String[] args) {

        Animal animal = new Animal(1,1,5,5,"Wild Animal");//Instance of a class Animal
        Animal anotherAnimal = animal;//Reference to the object animal
        System.out.println("Name of animal = "+animal.getName());//Wild Animal
        System.out.println("Name of anotherAnimal = "+anotherAnimal.getName());//Wild Animal
        anotherAnimal.setName("Domestic Animal");
        //Since the object anotherAnimal which is referenced to animal object has changed the name of Animal
        //It will also affect the instance named animal
        System.out.println("Name of animal = "+animal.getName());//Domestic Animal
        System.out.println("Name of anotherAnimal = "+anotherAnimal.getName());//Domestic Animal
        Animal petAnimal = new Animal(1,1,5,5,"Pet Animal");//Instance of a class Animal
        anotherAnimal = petAnimal;//Now anotherAnimal is referencing to the instance petAnimal
        System.out.println("Name of animal = "+animal.getName());//Domestic Animal
        System.out.println("Name of anotherAnimal = "+anotherAnimal.getName());//Pet Animal
        System.out.println("Name of petAnimal = "+petAnimal.getName());//Pet Animal

        Dog dog = new Dog(20,24,"German Shepard",2,4,1,25,"double");
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish = new Fish(5,1,"Gold fish",2,2,2);
        fish.rest();
        fish.swim(20);

        Dog.printMessage("No need to create instance of the Dog class!!");

        Dog newDog = new Dog(10,14,"Pug",2,4,1,25,"single");
        //count is a static variable in class Dog
        System.out.println(newDog.getCount());//0
        System.out.println(dog.getCount());//0
        Dog.setCount(3);
        System.out.println(newDog.getCount());//3
        System.out.println(dog.getCount());//3




    }
}
