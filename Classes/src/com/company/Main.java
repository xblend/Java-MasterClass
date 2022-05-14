package com.company;

import java.sql.PseudoColumnUsage;

//Every class in the JAVA is inherited from the base class.
public class Main {

    public static void main(String[] args) {


	    Car porsche = new Car();//Classes don't have a default value, so new object of a class has to be initialized.
        Car toyota = new Car();
        porsche.setModel("GT911s");
        System.out.println("Model of Toyota is "+ toyota.getModel());//will get null
        System.out.println("Model of Porsche is "+porsche.getModel());
        toyota.setModel("Supra");
        System.out.println("Model of Toyota is "+ toyota.getModel());

        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(30.25);
        sc.setSecondNumber(0);
        System.out.println("First number = "+sc.getFirstNumber());
        System.out.println("Second number = "+sc.getSecondNumber());
        System.out.println("Multiplication = "+sc.getMultiplicationResult());
        System.out.println("Division = "+sc.getDivisionResult());
        System.out.println("Addition = "+sc.getAdditionResult());
        System.out.println("Subtraction = "+sc.getSubtractionResult());

        Person p = new Person();

        p.setAge(28);
        p.setFirstName("");
        p.setLastName("");
        System.out.println("First name = "+p.getFirstName());
        System.out.println("Last name = "+p.getLastName());
        System.out.println("Full name = "+p.getFullName());
        System.out.println("Age = "+p.getAge());
        System.out.println("IsTeen? "+p.isTeen());

        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber("12341113132");
        myAccount.setCustomerName("Akshat");
        myAccount.setEmail("akshat2995@gmail.com");
        myAccount.setPhoneNumber("+919158807716");
        myAccount.setBalance(1050000);
        myAccount.withdraw(20000000);
        myAccount.withdraw(5000);
        myAccount.deposit(100000);
        System.out.println("Account Number = "+myAccount.getAccountNumber());
        System.out.println("Customer Name = "+myAccount.getCustomerName());
        System.out.println("Email = "+myAccount.getEmail());
        System.out.println("Phone Number = "+myAccount.getPhoneNumber());
        System.out.println("Balance = "+myAccount.getBalance());


        BankAccount defaultCustomer = new BankAccount();
        System.out.println("Account Number = "+defaultCustomer.getAccountNumber());
        System.out.println("Customer Name = "+defaultCustomer.getCustomerName());
        System.out.println("Email = "+defaultCustomer.getEmail());
        System.out.println("Phone Number = "+defaultCustomer.getPhoneNumber());
        System.out.println("Balance = "+defaultCustomer.getBalance());


        BankAccount newCustomer = new BankAccount("Ravi Marathe",
                "+914219429857","ravi201@ymail.com");
        System.out.println("Account Number = "+newCustomer.getAccountNumber());
        System.out.println("Customer Name = "+newCustomer.getCustomerName());
        System.out.println("Email = "+newCustomer.getEmail());
        System.out.println("Phone Number = "+newCustomer.getPhoneNumber());
        System.out.println("Balance = "+newCustomer.getBalance());


        VipCustomer myVipAccount = new VipCustomer();
        VipCustomer AdvaitAccount = new VipCustomer("Advait",4000000);
        VipCustomer RaviAccount = new VipCustomer("Ravi",1000000,"ravi13451@ymail.com");
        System.out.println("**********************************************");
        System.out.println("Customer Name = "+myVipAccount.getName());
        System.out.println("Email = "+myVipAccount.getEmailAddress());
        System.out.println("Credit Limit = "+myVipAccount.getCreditLimit());
        System.out.println("**********************************************");
        System.out.println("Customer Name = "+AdvaitAccount.getName());
        System.out.println("Email = "+AdvaitAccount.getEmailAddress());
        System.out.println("Credit Limit = "+AdvaitAccount.getCreditLimit());
        System.out.println("**********************************************");
        System.out.println("Customer Name = "+RaviAccount.getName());
        System.out.println("Email = "+RaviAccount.getEmailAddress());
        System.out.println("Credit Limit = "+RaviAccount.getCreditLimit());


    }


}
