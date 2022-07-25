package com.company;

import com.company.game.ISaveable;
import com.company.game.Monster;
import com.company.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Player Alloy = new Player("Alloy",10,20);
        saveTheFile(Alloy);
        Alloy.setHitPoints(15);
        saveTheFile(Alloy);
        Alloy.setWeapon("Gauntlet");
        saveTheFile(Alloy);
        loadTheFile(Alloy);
        saveTheFile(Alloy);

        Monster ThunderJaw = new Monster("ThunderJaw",20,100);
        saveTheFile(ThunderJaw);
        loadTheFile(ThunderJaw);
        saveTheFile(ThunderJaw);

    }

    public static ArrayList<String> readValues(){
        ArrayList<String> loadValues = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter values for Player\n2. Enter values for Monster\nChoice:");
        int ch = scanner.nextInt();
        scanner.nextLine();
        switch (ch){
            case 1:
                System.out.println("Enter the name of the Player: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the hit points of the Player: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the strength of the Player: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the weapon(Optional): ");
                String weapon = scanner.nextLine();
                if(weapon.equals("")) {
                    System.out.println("Will load the default weapon");
                    loadValues.add("Sword");
                }
                else
                    loadValues.add(weapon);
                break;
            case 2:
                System.out.println("Enter the name of the Monster: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the hit points of the Monster: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the strength of the Monster: ");
                loadValues.add(scanner.nextLine());
                System.out.println("Enter the weapon(Optional): ");
                break;
            default:
                return null;
        }
        return loadValues;
    }

    public static void saveTheFile(ISaveable objectToSave){
        System.out.println("*********************************");
        System.out.println("Saving has started...");
        System.out.println("*********************************");
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to the disk");
        }
    }

    public static void loadTheFile(ISaveable objectToLoad){
        System.out.println("*********************************");
        System.out.println("Loading has started...");
        System.out.println("*********************************");
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
        System.out.println(objectToLoad.toString());
    }
}
