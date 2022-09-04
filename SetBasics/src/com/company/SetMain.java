package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1;i<=100;i++){ squares.add(i*i); cubes.add(i*i*i);}

        System.out.println("Size of set \"squares\" is "+squares.size());
        System.out.println("Size of set \"cubes\" is "+cubes.size());

        //Union of set squares and cubes
        Set<Integer> union = new HashSet<>(squares);
        System.out.println("Size of set \"union\" after adding elements from set \"squares\" is "+union.size());
        union.addAll(cubes);
        System.out.println("Size of set \"union\" after adding elements from set \"cubes\" is "+union.size());

        //Intersection of set squares and cubes
        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);

        for(Integer i:intersection) System.out.println(i+" is a square of "+Math.sqrt(i)+" and is a cube of " +
                Math.cbrt(i));


        String divine = "we all humans belong to the divine soul";
        Set<String> divineSet = new HashSet<>(Arrays.asList(divine.split(" ")));

        String nature = "the true nature of the humans comes out to the world during extreme circumstances";
        Set<String> natureSet = new HashSet<>(Arrays.asList(nature.split(" ")));
        System.out.println("Set containing words from \"divine\" string ");
        printSet(divineSet);
        System.out.println("Set containing words from \"nature\" string ");
        printSet(natureSet);

        //Asymmetric removal
        // asymmetricalNatureSet.removeAll(divineSet) will contain words from natureSet which doesn't belong to divineSet
        System.out.println("nature-divine");
        Set<String> asymmetricalNatureSet = new HashSet<>(natureSet);
        asymmetricalNatureSet.removeAll(divineSet);
        printSet(asymmetricalNatureSet);
        // asymmetricalDivineSet.removeAll(natureSet) will contain words from divineSet which doesn't belong to natureSet
        System.out.println("divine-nature");
        Set<String> asymmetricalDivineSet = new HashSet<>(divineSet);
        asymmetricalDivineSet.removeAll(natureSet);
        printSet(asymmetricalDivineSet);

        //Symmetric removal
        //It would be set of words which belongs to either in natureSet or in divineSet but not in both
        //Ways to get it
        //1. Union of both the asymmetric sets i.e. asymmetricalNatureSet and asymmetricalDivineSet
        //2. Removing the intersection of nature and divine set from its union
        Set<String> symmetricalRemovalSet1 = new HashSet<>(asymmetricalDivineSet);
        symmetricalRemovalSet1.addAll(asymmetricalNatureSet);
        System.out.println("Symmetrical removal using point 1");
        printSet(symmetricalRemovalSet1);
        Set<String> symmetricalRemovalSet2 = new HashSet<>(divineSet);
        symmetricalRemovalSet2.addAll(natureSet);
        Set<String> intersectionOfWordSet = new HashSet<>(divineSet);
        intersectionOfWordSet.retainAll(natureSet);
        symmetricalRemovalSet2.removeAll(intersectionOfWordSet);
        System.out.println("Symmetrical removal using point 2");
        printSet(symmetricalRemovalSet2);


        //containsAll is used to check if s2 is a subset of s1 in usage s1.containsAll(s2)
        System.out.println("Is natureSet subset of divineSet? "+divineSet.containsAll(natureSet));
        System.out.println("Is divineSet subset of natureSet? "+natureSet.containsAll(divineSet));
        System.out.println("Is intersection of divineSet and natureSet a subset of divineSet? "+
                divineSet.containsAll(intersectionOfWordSet));
        System.out.println("Is intersection of divineSet and natureSet a subset of natureSet? "+
                natureSet.containsAll(intersectionOfWordSet));
    }
    public static void printSet(Set<String> set){
        for(String s:set) System.out.print(s+" ");
        System.out.println();
    }
}
