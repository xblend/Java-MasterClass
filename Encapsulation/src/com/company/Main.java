package com.company;

public class Main {

    public static void main(String[] args) {
	Player player = new Player();
    //Due to absence of encapsulation we can access the members of player
        //If there are small changes in the fields we have to change the occurrence
        //player.name = "Akshat"; //Error is observed as the field name was changed to fullName
        player.fullName = "Akshat";
        player.health = 30;//If we comment this out we fail to initialize the value of the members of the class
        player.weapon = "RPG";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health is "+player.remainingHealth());
        //Player can hack the data and can change the value of health like
        player.health=200;

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Akshat",500,"Sword");
        //health would be set to 100
        System.out.println("Remaining health is "+enhancedPlayer.getHealth());
        enhancedPlayer.loseHealth(70);
        System.out.println("Remaining health is "+enhancedPlayer.getHealth());

        Printer printer = new Printer(100,false);
        System.out.println(printer.addToner(0));


    }
}
