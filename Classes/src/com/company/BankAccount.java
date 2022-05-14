package com.company;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Using constructors we don't really need setters method
    //Overloading a constructor and using this() is called as Constructor chaining
    public BankAccount(){
        this("001123456",10000,"default Name","+120984981","default email");
        System.out.println("Empty bank account created with default values");
    }

    public BankAccount(String number, double balance, String name, String phoneNumber, String email){
        /*
        //Not to call any other methods even setters in the constructor.
        this.setBalance(balance);
        this.setPhoneNumber(phoneNumber);
        this.setEmail(email);
        this.setCustomerName(name);
        this.setAccountNumber(number);
         */
        this.balance = balance;
        this.accountNumber = number;
        this.customerName = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        System.out.println("Account created!");
    }
    public BankAccount(String customerName, String phoneNumber, String email){
        /*
        Here instead of assigning values to each class fields we can call the constructor which sets all fields with
        default values of balance and account number
         */
        this("xxxxxx",5000,customerName,phoneNumber,email);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("Your balance after depositing "+amount+" is "+this.balance);
    }

    public void withdraw(double amount){
        if(this.balance<amount){
            System.out.println("Insufficient balance!");
            return;
        }
        this.balance-=amount;
        System.out.println("Your balance after withdrawing "+amount+" is "+this.balance);
    }
}
