package com.company;

public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("German Shepherd");
        dog.eat();
        dog.breathe();

        /*
        //This will throw an error as we can instantiate an abstract class
        Bird bird = new Bird("Parrot");
        bird.eat();
        bird.breathe();
        */
        //All Animals can't fly and all Birds can't fly so we implement a Abstract method in bird class,
        //and declare the Bird class as abstract

        //If we take the example of Bat or dragonfly, those creatures can fly but are not birds
        //So, we decide to shift fly method in an interface to avoid redundancy and class of Mammals or Insects can
        //implement it
        Parrot parrot = new Parrot("Indian redneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
    //Abstract vs Interface
    //Since, we can't instantiate a interface the members should be static and final type only.
    //Interface can't have defined methods unlike Abstract classes
    //A child class inherits from an interface using "implements" keyword, whereas
    //A child class inherits from an abstract class using "extends" keyword.
    //An abstract class can extend only one parent, but can implement multiple interfaces
    //Abstract class will contain methods which are either implemented or not implemented
    //Interface class will only contain methods which are not implemented.
}
