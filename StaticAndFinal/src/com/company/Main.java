package com.company;


public class Main {

    public static void main(String[] args) {
        Password myPassword = new Password("Akshat",5346);
        //myPassword.name = "Ravi"; //This will throw an error as name member of password class is declared as final
        System.out.println("Password instance "+Password.getInstance()+" is created");
        System.out.println(myPassword.name+" was assigned with an instance of "+myPassword.getMyInstance());
        myPassword.savePassword();

        Password fatherPassword = new Password("Ravi",5122346);
        System.out.println("Password instance "+Password.getInstance()+" is created");
        System.out.println(fatherPassword.name+" was assigned with an instance of "+fatherPassword.getMyInstance());
        fatherPassword.savePassword();

        Password motherPassword = new Password("Ranjana",58621);
        System.out.println("Password instance "+Password.getInstance()+" is created");
        System.out.println(motherPassword.name+" was assigned with an instance of "+motherPassword.getMyInstance());
        motherPassword.savePassword();

        
    }
}
