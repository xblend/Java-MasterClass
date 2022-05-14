package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Delhi");
        placesToVisit.add("Pune");
        placesToVisit.add("Mumbai");
        placesToVisit.add("Bangalore");

        printLinkedList(placesToVisit);

        placesToVisit.add(2,"Nagpur");

        printLinkedList(placesToVisit);

        placesToVisit.remove(3);

        printLinkedList(placesToVisit);

        LinkedList<String> placesToVisitInOrder = new LinkedList<String>();
        addInOrder(placesToVisitInOrder,"Delhi");
        addInOrder(placesToVisitInOrder,"Pune");
        addInOrder(placesToVisitInOrder,"Mumbai");
        addInOrder(placesToVisitInOrder,"Bangalore");
        addInOrder(placesToVisitInOrder,"Mysore");
        addInOrder(placesToVisitInOrder,"Mumbai");
        addInOrder(placesToVisitInOrder,"Raipur");

        printLinkedList(placesToVisitInOrder);

    }

    private static void printLinkedList(LinkedList<String> linkedList){
        //linkedList.iterator() goes only in forward direction it gives object of type Iterator
        //i.e. it doesn't have a .previous() function
        Iterator<String> i = linkedList.iterator();
        System.out.println("=============================");
        System.out.println("Head ->");
        while(i.hasNext()){
            System.out.println("Node: "+i.next()+" ->");
        }
        System.out.println("Tail");
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newString){
        //linkedList.listIterator() is bidirectional it gives object of type ListIterator
        //i.e. it doesn't have a .previous() function
        ListIterator<String> stringListIterator = linkedList.listIterator();
        int comparator;
        while(stringListIterator.hasNext()){

            comparator = stringListIterator.next().compareTo(newString);
            if(comparator==0){
                System.out.println("Element already in the list");
                return false;
            }else if(comparator>0){
                System.out.println("Adding "+newString+" after "+stringListIterator.previous());
                //We have to go previous node since we need to add the element before the current node
                //NOTE: We use ListIterator stringListIterator object to add the newString and not the linkedList object
                //Why?
                //We didn't use linkedList add method to add the newString because,
                // it will append the newString at the end of the linkedList and not in-place
                stringListIterator.add(newString);
                return true;
            }
        }
        System.out.println("Adding "+newString+" at last ");
        //The element will however get added in last so using linkedList or stringListIterator add method won't matter
        //Here I am using linkedList.add() method just to make myself remember the difference.
        linkedList.add(newString);
        return true;
    }
}
