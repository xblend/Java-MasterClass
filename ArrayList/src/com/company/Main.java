package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        int ch;
        boolean quit = false;
        while(!quit){
            System.out.println("Menu:\n1. Add Item\n2. Modify Item\n3. Remove Item\n4. Query Item\n" +
                    "5. Print Grocery List");
            System.out.println("Enter choice: \r");
            ch = scan.nextInt();
            scan.nextLine();
            switch (ch){
                case 1:
                    addItem();
                    break;
                case 2:
                    modifyItem();
                    break;

                case 3:
                    removeItem();
                    break;
                case 4:
                    queryItem();
                    break;
                case 5:
                    groceryList.printGroceryList();
                    System.out.println("Continue?(Y/N):");
                    if(scan.nextLine().equals("n"))
                        quit=true;
                    break;
                default:
                    quit = true;
            }
            if(quit)
                break;

        }
        //Methods to copy array list
        //1.
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        printGroceryList(newArray);

        //2.
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        printGroceryList(newArray);

        //Convert ArrayList to Array
        String[] stringArray = new String[groceryList.getGroceryList().size()];
        stringArray = groceryList.getGroceryList().toArray(stringArray);
        System.out.println(Arrays.toString(stringArray));

        /*
	    GroceryList groceryList = new GroceryList();
        groceryList.addItem("Cooker Ring 5litre");
        groceryList.addItem("Milk");
        groceryList.addItem("Dahi");
        groceryList.addItem("Red chilli powder");
        groceryList.printGroceryList();
        groceryList.modifyItem(1,"Chocolate Shake");
        groceryList.printGroceryList();
        groceryList.removeItem(1);
        groceryList.printGroceryList();
        System.out.println(groceryList.searchItems("Dahi"));
         */
    }
    public static void addItem(){
        System.out.println("Enter item to be added:\r");
        groceryList.addItem(scan.nextLine());
    }
    public static void modifyItem(){
        String item;
        System.out.println("Enter the item to be modified:\r");
        item = scan.nextLine();
        System.out.println("Enter the new item:\r");
        groceryList.modifyItem(item,scan.nextLine());
    }
    public static void removeItem(){
        String item;
        System.out.println("Enter the item to be removed:\r");
        item = scan.nextLine();
        groceryList.removeItem(item);
    }
    public static void queryItem(){
        System.out.println("Enter the item to be queried:\r");
        System.out.println(groceryList.searchItems(scan.nextLine()));
    }

    public static void printGroceryList(ArrayList<String> arrayList){
        int length = arrayList.size();
        System.out.println("The array list has "+length+" items");
        for(int i=0;i<length;i++){
            System.out.println((i+1)+". "+ arrayList.get(i));
        }
    }
}
