package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot added";
    }
}


class Deadpool extends Movie{
    public Deadpool() {
        super("Deadpool");
    }

    @Override
    public String plot() {
        return "Merc with a mouth go on killing spree to save lives";
    }
}

class SpiderMan extends Movie{
    public SpiderMan() {
        super("Spider-Man");
    }

    @Override
    public String plot() {
        return "A man bite by a radioactive spider get powers to save mankind";
    }
}

class Terminator extends Movie{
    public Terminator() {
        super("Terminator");
    }

    @Override
    public String plot() {
        return "A humanoid robot capable to kill comes from the future to protect the good";
    }
}

class KingsMan extends Movie {
    public KingsMan() {
        super("Kingsman");
    }

    @Override
    public String plot() {
        return "A spy agency from UK helps to save the world from wars";
    }
}


class BigHero6 extends Movie{
    public BigHero6() {
        super("Big Hero 6");
    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<21;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+" is "+movie.getName()+"\n"+
                           "Plot:" + movie.plot());//Polymorphism: one object can hold attributes of different classes
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5+1);
        System.out.println("Number generated is "+randomNumber);
        switch(randomNumber){
            case 1:
                return new Deadpool();
            case 2:
                return new SpiderMan();
            case 3:
                return new Terminator();
            case 4:
                return new KingsMan();
            case 5:
                return new BigHero6();
        }

        return null;
    }
}


