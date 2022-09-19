package com.company;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private int quantity;
    private double price;
    private int reserve;

    public StockItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public StockItem(String name, double price) {
        this.name = name;
        this.quantity = 0;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity-reserve;
    }

    public double getPrice() {
        return price;
    }

    public void adjustStock(int quantity){
        int newQuantity = quantity+this.quantity;
        if(newQuantity>0){
            this.quantity = newQuantity;
        }
    }

    public int reserve(int quantity){
        if(quantity<=this.getQuantity()){
            this.reserve+=quantity;
            return quantity;
        }
        return 0;
    }

    public int unReserve(int quantity){
        if(quantity<=this.reserve){
            this.reserve-=quantity;
            return quantity;
        }
        return 0;
    }

    public int finalizeReserve(int quantity){
        if(quantity<=reserve){
            this.reserve-=quantity;
            this.quantity-=quantity;
            return quantity;
        }
        return 0;
    }

    public void setPrice(double price) {
        if(price>0.0)
            this.price = price;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode() + 37;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        String objName = ((StockItem) obj).getName();
        return this.getName().equals(objName);
    }

    @Override
    public int compareTo(StockItem o) {
        //System.out.println("Entering compareTo");
        if(this==o)
            return 0;
        if(o!=null)
            return this.name.compareTo(o.getName());
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name+", price : "+this.price+", reserved : "+this.reserve;
    }
}
