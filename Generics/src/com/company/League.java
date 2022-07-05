package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{
    private String name;
    ArrayList<T> teamList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(teamList.contains(team)){
            System.out.println(team.getName()+" already added in the league");
            return false;
        }
        System.out.println(team.getName()+" added in the league");
        teamList.add(team);
        return true;
    }

    public void teamRankings(){
        Collections.sort(teamList);
        for(T team : teamList){
            System.out.println(team.getName()+" : "+ team.ranking());}
    }
}
