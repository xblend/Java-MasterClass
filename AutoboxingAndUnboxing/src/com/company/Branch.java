package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction){
        if(this.findCustomer(name)!=null)
            return false;
        this.customers.add(new Customer(name,initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction){
        Customer customer = this.findCustomer(name);
        if(customer==null)
            return false;
        customer.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String name){
        for(int i=0;i<this.customers.size();i++){
            if(this.customers.get(i).getName().equals(name))
                return this.customers.get(i);
        }
        return null;
    }
}
