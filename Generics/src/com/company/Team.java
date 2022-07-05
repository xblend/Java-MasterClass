package com.company;

import java.util.ArrayList;

//To apply generics from different class and interfaces
//Keep the name of Class first then interfaces
//public class Team<T extends Player & Coach & Manager>
//public class Team<T>{//This can accept any objects
public class Team<T extends Player> implements Comparable<Team<T>>{
    //Comparable<Team<T>> to take objects only of Team class and <T> to take only objects having similar Player class
    //To accept objects from classes those extend abstract class Player
    private String name;
    int lost;
    int won;
    int tie;
    int played;
    ArrayList<Player> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.lost = 0;
        this.won = 0;
        this.tie = 0;
        this.played = 0;
    }

    public void memberList(){
        System.out.println("**************\n"+this.getName()+" has players:");
        for(Player i : members)
            System.out.println(i.getName());
        System.out.println("**************\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addMember(T member){
        if(members.contains(member)){
            //Typecast the object to Player class as class accepts any objects if used <T>
            //System.out.println(((Player)member).getName()+" already exists");
            System.out.println(member.getName()+" already exists");
            return false;
        }
        System.out.println(member.getName()+" selected in "+this.getName());
        members.add(member);
        return true;
    }

    public void scoring(Team<T> opponent, int ourScores, int theirScores){
        String message;
        if(ourScores>theirScores){
            this.won++;
            message=" won against ";}
        else if(ourScores<theirScores){
            this.lost++;
            message=" lost against ";}
        else{
            this.tie++;
            message=" tied against ";}
        played++;
        if(opponent!=null){
            System.out.println(this.name+message+opponent.getName());
            opponent.scoring(null,theirScores,ourScores);
        }
    }

    public int ranking(){
        return won*2+tie;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()<team.ranking())
            return 1;
        else if(this.ranking()>team.ranking())
            return -1;
        return 0;
    }
}
