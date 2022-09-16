package com.company;

public class Main {
    public static StockList stockList = new StockList();
    public static void main(String[] args) {


        StockItem temp = new StockItem("bread",22.5,20);
        stockList.addStock(temp);

        temp = new StockItem("cream biscuits",15.72,40);
        stockList.addStock(temp);

        temp = new StockItem("dartboard",2000,3);
        stockList.addStock(temp);

        temp = new StockItem("eggs",1.5,100);
        stockList.addStock(temp);

        temp = new StockItem("fish",100,10);
        stockList.addStock(temp);

        temp = new StockItem("figs",20.53,30);
        stockList.addStock(temp);

        temp = new StockItem("gold",7300.48,5);
        stockList.addStock(temp);

        temp = new StockItem("hamburger",65.23,20);
        stockList.addStock(temp);

        temp = new StockItem("hazelnut",4.78,200);
        stockList.addStock(temp);

        temp = new StockItem("jam",73.48,35);
        stockList.addStock(temp);

        temp = new StockItem("kite",3.48,350);
        stockList.addStock(temp);

        temp = new StockItem("lemon",5.41,100);
        stockList.addStock(temp);

        temp = new StockItem("melon",37.24,15);
        stockList.addStock(temp);

        temp = new StockItem("meat",730.48,8);
        stockList.addStock(temp);

        temp = new StockItem("orange",20.14,150);
        stockList.addStock(temp);

        temp = new StockItem("sugar",34.48,75);
        stockList.addStock(temp);

        temp = new StockItem("salt",13.33,95);
        stockList.addStock(temp);

        temp = new StockItem("tablecloth",173.74,23);
        stockList.addStock(temp);

        temp = new StockItem("vase",730.25,8);
        stockList.addStock(temp);

        temp = new StockItem("watermelon",43.54,17);
        stockList.addStock(temp);

        temp = new StockItem("hamburger",43.54,17);
        stockList.addStock(temp);


        //HashMap will store the objects in random order
        //LinkedHashMap will store the objects in order, i.e. the objects would be stored in the same order as they were added.
        System.out.println(stockList);

        Basket basket = new Basket("Akshat");
        //TreeMap will use the compareTo method of StockItem and will order the Basket's map accordingly
        sellItem(basket,"dartboard",2);
        System.out.println(basket);
        sellItem(basket,"dartboard",2);
        sellItem(basket,"wrench",2);
        sellItem(basket,"jam",20);
        sellItem(basket,"gold",1);
        sellItem(basket,"kite",10);
        sellItem(basket,"hamburger",4);
        sellItem(basket,"vase",1);
        sellItem(basket,"watermelon",5);
        sellItem(basket,"orange",25);

        System.out.println(basket);
        System.out.println("*************************");
        System.out.println(stockList);

        temp = new StockItem("wrench",32.32,5);
        //stockList.Items().put(temp.getName(), temp);//Not possible as we cannot do operations on the unmodifiable Map
        //But we can make the changes in the elements like
        stockList.Items().get("gold").adjustStock(3);
        System.out.println(stockList);
        System.out.println("*************************");
        stockList.get("gold").adjustStock(-2);
        System.out.println(stockList);
        //Both of the above statements will work and stock quantity of gold would be adjusted accordingly

    }

    public static int sellItem(Basket basket, String item, int quantity){
         StockItem stockItem = stockList.get(item);
         if(stockItem==null){
             System.out.println("We don't sell "+item+" currently!");
             return 0;
         }
         if(stockList.sellStock(item,quantity)!=0){
             basket.addToBasket(stockItem,quantity);
             return quantity;
         }
        System.out.println("We currently don't have "+quantity+" "+item+" in stock!");
         return 0;
    }
}
