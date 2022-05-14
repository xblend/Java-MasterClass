package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(this.findBranch(branchName)!=null)
            return false;
        this.branches.add(new Branch(branchName));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName,
                               double initialTransaction){
        Branch branch = this.findBranch(branchName);
        if(branch==null)
            return false;
        return branch.newCustomer(customerName, initialTransaction);

    }

    public boolean addCustomerTransaction(String branchName, String customerName,
                                          double transaction){
        Branch branch = this.findBranch(branchName);
        if(branch==null)
            return false;
        return branch.addCustomerTransaction(customerName,transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = this.findBranch(branchName);
        if(branch==null)
            return false;
        System.out.println("Customer details for branch "+branch.getName());
        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for(int i=0;i<branchCustomers.size();i++){
            System.out.println("Customer: "+branchCustomers.get(i).getName()+"["+(i+1)+"]");
            if(printTransactions){
                ArrayList<Double> customerTransactions = branchCustomers.get(i).getTransactions();
                System.out.println("Transactions");
                for(int j=0;j<customerTransactions.size();j++){
                    System.out.println("["+(j+1)+"]  Amount "+customerTransactions.get(j).doubleValue());
                }
            }
        }
        return true;
    }

    private Branch findBranch(String name){
        for(int i=0;i<this.branches.size();i++){
            if(this.branches.get(i).getName().equals(name))
                return this.branches.get(i);
        }
        return null;
    }

}
