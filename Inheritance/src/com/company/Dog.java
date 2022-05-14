package com.company;

public class Dog  extends Animal{//Throws an error on extending Animal due to missing constructor.
    //Initialize base characteristics of Dog i.e. Animal

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);//calls the constructor of parent's class
        this.coat = coat;
        this.tail = tail;
        this.teeth = teeth;
        this.eyes = eyes;
        this.legs = legs;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.movement(5);//This will call the method movement of the parent class
    }
    public void run(){
        System.out.println("Dog.run() called");
        this.movement(15);//This will call the override method movement of this class
    }
    private void moveLegs(){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void movement(int speed) {
        System.out.println("Dog.movement() called");
        this.moveLegs();
        super.movement(speed);
    }

    /*
    We can't use this and super using static variables or static methods that leads to compile time errors
    this() calls the constructor of that particular class, useful while overloading class's constructor also called as
    Constructor Chaining.
    super() is the only way to call the constructor of a parent class.


    We can overload static and instance methods, overloading is termed as compile time polymorphism
    We cannot override static methods, but we can override instance methods,
    overriding is termed as run time polymorphism, used @Override annotation before the method.
    Rules for method overriding
    1. It must have same name and parameters. Unlike, overloading where different parameters is a must.
    2. Return type can be a subclass/covariant of the return type in the parent class.
    Eg: If a method returns a parent class and if the same method is overridden it can return the child class,
    as child class is the subclass of the parent class so, the return type is covariant.
    3. It can't have lower access modifier.
    Eg: If the parent method is protected then private in the child class is not allowed,
    but using public would be allowed.
    public>protected>private
    4. Only inherited methods can be overridden.
    5. Constructors and private methods cannot be overridden.
    6. final methods cannot be overridden.
   */

    /*
    1. Static methods can't access instance methods or instance variables directly.
    2. We can't use "this" keyword in the static methods, so any method which doesn't use the instance methods or variables
    should be declared as static
    3. We don't require instance of a class to be created for using a static method. Unlike for instance methods
    where instance using "new" keyword is required.
    */
    //E.g. static method in Dog class
    public static void printMessage(String Message){
        //This method doesn't use any instance method or instance variables of Dog class.
        System.out.println("The Message is "+Message);
    }
    /*
    1. Instance methods can access instance methods and instance variables directly
    2. Instance methods can also access static methods and static variables directly
     */
    /*
     Static variables also known as static member variables are being shared in all the instances of that class.
     If we change the value of the static variable of a class it will affect all its instances
     */
    //E.g. static variable in Dog
    private static int count = 0;

    public static void setCount(int count) {
        Dog.count = count;
    }

    public static int getCount() {
        return count;
    }
    /*
    1. Instance variables are known as fields or member variables.
    2. Each instance of a class has a copy of its instance variables whose values are not shared.
    As a result, different instances can have different values of instance variables unlike, static variables.
     */
}
