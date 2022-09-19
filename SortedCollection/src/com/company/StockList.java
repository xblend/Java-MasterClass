package com.company;

import com.sun.jdi.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> stockList;

    public StockList() {
        //this.stockList = new HashMap<>();//random Map
        this.stockList = new LinkedHashMap<>();//inorder Map
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(this.stockList);
    }

    public int addStock(StockItem item){
        StockItem addStock = stockList.getOrDefault(item.getName(),item);
        if(item!=null) {
            if (item == addStock)
                stockList.put(item.getName(), item);
            else
                stockList.get(item.getName()).adjustStock(item.getQuantity());
            return stockList.get(item.getName()).getQuantity();
        }
        return 0;
    }

    public int reserveStock(String name,int quantity){
        StockItem item = stockList.get(name);
        if(item!=null && quantity>0)
            return item.reserve(quantity);
        return 0;
    }

    public int unReserveStock(String name,int quantity){
        StockItem item = stockList.get(name);
        if(item!=null && quantity>0)
            return item.unReserve(quantity);
        return 0;
    }


    public int sellStock(String name, int quantity){
        StockItem item = stockList.get(name);
        if(item!=null && quantity>0)
            return item.finalizeReserve(quantity);
        return 0;
        /*
        StockItem sellStock = stockList.getOrDefault(name,null);
        if(sellStock!=null && sellStock.getQuantity()>=quantity && quantity>0){
            sellStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
        */
    }

    public StockItem get(String key){
        return stockList.get(key);
    }

    @Override
    public String toString() {
        String s = "\nStock List:\n";
        double totalValue = 0.0;
        for(Map.Entry<String,StockItem> item : stockList.entrySet()){
            StockItem stockItem = item.getValue();
            double getTotalItemValue = stockItem.getPrice()*stockItem.getQuantity();
            s = s + stockItem + ". There "+ (stockItem.getQuantity()==1 ? "is " : "are ") + stockItem.getQuantity() + " in stock. Value of stock is ";
            s = s + String.format("%.2f",getTotalItemValue) + "\n";
            totalValue+=getTotalItemValue;
        }
        return s + "Total stock value is " + String.format("%.2f",totalValue) ;
    }
}
