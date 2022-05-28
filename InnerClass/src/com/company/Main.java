package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Button btn = new Button("Print");
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

        //Local class
        class onClickListen implements Button.onClickListener{
            public onClickListen() {
                System.out.println("I have been attached");
            }

            @Override
            public void onClick(String text) {
                System.out.println(text+" was clicked");
            }
        }
        btn.setOnClickListener(new onClickListen());
        listen();
        //Anonymous class
        btn.setOnClickListener(new Button.onClickListener() {
            @Override
            public void onClick(String text) {
                System.out.println(text+" was clicked by an anonymous class onClick method");
            }
        });
        listen();
    }

    public static void listen(){
        boolean quit=false;
        int ch;
        while(!quit){
            ch = scanner.nextInt();
            scanner.nextLine();
            switch (ch){
                case 0:
                    quit=true;
                    break;
                case 1:
                    btn.onClick();
            }
        }
    }
}