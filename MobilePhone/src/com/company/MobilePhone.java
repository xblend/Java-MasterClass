package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void getContacts() {
        for(int i=0;i<this.contacts.size();i++) {
            System.out.println((i + 1) + ". Name: " + this.contacts.get(i).getName());
            System.out.println("\tPhone number: " + this.contacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String phoneNumber){
        int index = this.queryContact(name);
        Contact contact = new Contact(name,phoneNumber);
        if(index>-1){
            System.out.println("Contact with name " + name + " already exist! It is indexed at "+index);
            return;
        }
        this.contacts.add(contact);
    }

    public void updateContact(String name, String newName,String newPhoneNumber){
        int index = this.queryContact(name);
        if(index==-1) {
            System.out.println("Contact with name " + name + " doesn't exist");
            return;
        }
        int indexNew = this.queryContact(newName);
        if(indexNew>-1){
            System.out.println("Contact with name " + newName + " already exist! It is indexed at "+indexNew);
            return;
        }
        Contact updatedContact = new Contact(newName,newPhoneNumber);
        System.out.println("Updating contact with name " + name +" indexed at "+index);
        System.out.println("->Name: "+newName+"\nand phone Number: "+newPhoneNumber);
        this.contacts.set(index,updatedContact);
    }

    public void removeContact(String name){
        int index = this.queryContact(name);
        if(index==-1) {
            System.out.println("Contact with name " + name + " doesn't exist");
            return;
        }
        System.out.println("Removing contact with name " + name +" indexed at "+index);
        this.contacts.remove(index);
    }
    public void queryContactName(String name){
        int index = this.queryContact(name);
        if(index==-1) {
            System.out.println("Contact with name " + name + " doesn't exist");
            return;
        }
        String phoneNumber = this.contacts.get(index).getPhoneNumber();
        System.out.println("Contact Name: "+name+"\nPhone Number: "+phoneNumber+"\nis index at "+index);
    }

    private int queryContact(String name){
        for(int i =0;i<this.contacts.size();i++){
            if(this.contacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

}
