package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addItem(String item){
        this.groceryList.add(item);
    }
    public void printGroceryList(){
        int length = this.groceryList.size();
        System.out.println("The grocery list has "+length+" items");
        for(int i=0;i<length;i++){
            System.out.println((i+1)+". "+ groceryList.get(i));
        }
    }
    public void modifyItem(String item,String newItem){
        int position = getItem(item);
        if(position<0) {
            System.out.println(item + " is not in the list");
            return;
        }
        this.modifyItem(position,newItem);
    }
    private void modifyItem(int position, String item){
        this.groceryList.set(position,item);
    }
    public void removeItem(String item){
        int position = getItem(item);
        if(position<0) {
            System.out.println(item + " is not in the list");
            return;
        }
        this.removeItem(position);
    }
    private void removeItem(int position){
        System.out.println("Removing item "+this.groceryList.get(position)+" indexed at "+position);
        this.groceryList.remove(position);
    }

    public String searchItems(String item){
        if(this.groceryList.contains(item))
            return "Item "+item+" is indexed at "+this.groceryList.indexOf(item);
        return item+" is not in the list";
    }
    private int getItem(String item){
        return this.groceryList.indexOf(item);
    }
}