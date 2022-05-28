package com.company;

public class Main {

    public static void main(String[] args) {
	    //1. Static Nested Class
        //2. Non-static Nested Class
        //3. Local Nested Class
        //4. Anonymous Nested Class - Class doesn't have a name
        Gearbox mcLaren = new Gearbox(6);
        //Using the outer class object to declare inner class object is the correct way
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //Since we made inner Gear class as private the above will throw an error


        //The following throws a syntax error
        //Gearbox.Gear second = Gearbox.new Gear(2,10.23);
        //Gearbox.Gear second = new Gearbox.Gear(2,10.23);
        //Gearbox.Gear second = new mcLaren.Gear(2,10.23);
        //System.out.println(first.driveSpeed(1000));
        //Since we made inner Gear class as private the above will throw an error
        mcLaren.addGear(7,12.3);
        mcLaren.addGear(-1,12.3);
        mcLaren.addGear(1,12.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(2);
        mcLaren.addGear(2,23.2);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));

    }
}