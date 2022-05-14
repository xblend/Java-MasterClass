package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i=0;i<this.myContacts.size();i++){
            if(this.myContacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact.getName())==-1){
            return false;
        }
        this.myContacts.remove(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact.getName());
        if(index==-1 || findContact(newContact.getName())==-1){
            return false;
        }
        this.myContacts.set(index,newContact);
        return true;
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())!=-1){
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public Contact queryContact(String name){
        int index = findContact(name);
        if(index==-1){
            return null;
        }
        return this.myContacts.get(index);
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+". "+this.myContacts.get(i).getName()+" -> "+this.myContacts.get(i).getPhoneNumber());
        }
    }
}
