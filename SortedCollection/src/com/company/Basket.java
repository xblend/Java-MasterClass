package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem,Integer> basket;

    public Basket(String name) {
        this.name = name;
        //this.basket = new HashMap<>();
        this.basket = new TreeMap<>();//This will store the data as per the compareTo method in StockItem i.e. alphabetically
    }

    public int addToBasket(StockItem item,int quantity){
        if(item!=null && quantity>0){
            int toBasket = basket.getOrDefault(item,0);
            basket.put(item,toBasket+quantity);
            return toBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item,int quantity){
        if(item!=null && quantity>0) {
            int fromBasket = basket.getOrDefault(item, 0);
            int newQuantity = fromBasket-quantity;
            if(newQuantity>0){
                basket.put(item, newQuantity);
                return quantity;
            }
            else if (newQuantity==0) {
                basket.remove(item);
                return quantity;
            }
        }
        return 0;
    }

    public void clear(){
        basket.clear(); //Will invoke clear() method of the Map's class
    }

    public Map<StockItem,Integer> getBasket(){
        return Collections.unmodifiableMap(basket);
    }

    @Override
    public String toString() {
        int size = basket.size();
        String s = "\nThere " + (size==1 ? "is " : "are ") + size + (size==1 ? " item" : " items") +" in " + this.name + "'s basket:\n";
        double totalBasketValue = 0.0;
        for(Map.Entry<StockItem,Integer> item:basket.entrySet()){
            double price = item.getKey().getPrice()*item.getValue();
            s=s+item.getKey()+". "+item.getValue()+" quantity "+" purchased at "+price+"\n";
            totalBasketValue=totalBasketValue+price;
        }
        return s+"The total basket value is "+totalBasketValue;
    }
}
