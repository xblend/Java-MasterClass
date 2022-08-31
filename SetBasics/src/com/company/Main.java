package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 87.97);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 224.70);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365.26);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 686.98);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Jupiter", 11.86*365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Saturn", 29.46*365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 84.01*365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 164.79*365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody satellite = new HeavenlyBody("Moon",384);
        solarSystem.get("Earth").addSatellite(satellite);

        satellite = new HeavenlyBody("Phobos",9.38);
        solarSystem.get("Mars").addSatellite(satellite);

        satellite = new HeavenlyBody("Deimos",23.46);
        solarSystem.get("Mars").addSatellite(satellite);

        satellite = new HeavenlyBody("Metis",127.96);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Adrastea",128.98);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Amalthea",384);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Thebe",221.9);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Io",421.6);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Europa",670.9);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Ganymede",1070);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Callisto",1880);
        solarSystem.get("Jupiter").addSatellite(satellite);

        satellite = new HeavenlyBody("Atlas",137.67);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Prometheus",139.35);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Pandora",141.70);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Janus",151.47);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Epimetheus",151.42);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Mimus",185.54);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Enceladus",238.04);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Tethys",294.67);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Telesto",294.67);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Calypso",294.67);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Dione",377.42);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Helene",377.42);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Rhea",527.04);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Titan",1221.86);
        solarSystem.get("Saturn").addSatellite(satellite);

        satellite = new HeavenlyBody("Hyperion",1481);
        solarSystem.get("Saturn").addSatellite(satellite);

        System.out.println("Planets :");
        for(HeavenlyBody planet : planets) System.out.println("\t"+planet.getName());

        String planetName = "Jupiter";
        System.out.println("Moons of "+planetName+" :");
        for(HeavenlyBody moon : solarSystem.get(planetName).getSatellites()) System.out.println("\t"+moon.getName());

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) moons.addAll(planet.getSatellites());

        System.out.println("Moons in the solar system :");
        for(HeavenlyBody moon : moons) System.out.println("\t"+moon.getName());

        /**There is a rule in java doc that if we are making a set having objects of our class, then it should override
        equals and hashcode methods
        Why?
        Sets shouldn't contain a duplicate data
         So what's the role of equals and hashcode
         Well, equals method decides whether an object is equal to another object or not, every class could have its own
         unique way of identifying equality
         For eg: Object class uses referential way to identify if the object is equal or not.
         That means 2 objects of Object class would be declared as equal if they are pointing/referring to the same object
         The role of hashcode is to decide in which bucket the object will go, for the objects of similar kind, the hashcode
         should be always similar
         **/

        Object o = new Object();
        System.out.println(o.equals(o));//referential
        System.out.println("Earth".equals("EartH"));//will compare character by character
        //Ctrl+right click over the method it will give you its definition


        /**Below object would be added in the planets set as this object would be created newly since, HeavenlyBody class is mutable
         and hence, JAVA will treat this object as a different object as compared to the one on line 20
         reason because equals method will return false**/
        temp = new HeavenlyBody("Earth", 365.26);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        for(HeavenlyBody planet : planets) System.out.println(planet.getName()+" : "+planet.getOrbitalPeriod());

    }


}
