package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price=0;
    private double addition2Price=0;
    private double addition3Price=0;
    private double addition4Price=0;


    public Hamburger(String name, String meat,  double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;

        System.out.println(this.name+" hamburger on a "+this.breadRollType+" roll with "+this.meat+
                ", price is "+this.price);
    }

    public void addHamburgerAddition1(String name , double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Price);
    }
    public void addHamburgerAddition2(String name , double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Price);
    }
    public void addHamburgerAddition3(String name , double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added "+this.addition3Name+" for an extra "+this.addition3Price);
    }
    public void addHamburgerAddition4(String name , double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added "+this.addition4Name+" for an extra "+this.addition4Price);
    }

    public double itemizeHamburger(){
        return this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
    }
}
