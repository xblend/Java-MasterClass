package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        int choice;
        boolean quit = false;
        while(!quit) {
            System.out.println("1. Add New Contact\n" +
                    "2. Modify Contact\n" +
                    "3. Remove Contact\n" +
                    "4. Query Contact\n" +
                    "5. Print PhoneBook\n" +
                    "6. Quit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    System.out.println("Enter the name to remove: ");
                    mobilePhone.removeContact(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Enter the name to query: ");
                    mobilePhone.queryContactName(scanner.nextLine());
                    break;
                case 5:
                    mobilePhone.getContacts();
                    break;
                default:
                    quit=true;

            }
            if(!quit){
                System.out.println("Continue(Y\\N):");
                if(scanner.nextLine().equals("n"))
                    quit=true;
            }
        }

    }
    private static void addContact(){
        String name;
        String phoneNumber;
        System.out.println("Enter the name: ");
        name = scanner.nextLine();
        System.out.println("Enter the phone Number");
        phoneNumber = scanner.nextLine();
        mobilePhone.addContact(name,phoneNumber);
    }
    private static void modifyContact(){
        String oldName;
        String name;
        String phoneNumber;
        System.out.println("Enter the name to modify: ");
        oldName = scanner.nextLine();
        System.out.println("Enter the new name: ");
        name = scanner.nextLine();
        System.out.println("Enter the new phone Number");
        phoneNumber = scanner.nextLine();
        mobilePhone.updateContact(oldName,name,phoneNumber);
    }
}


