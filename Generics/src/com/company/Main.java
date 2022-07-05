package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer beckham = new FootballPlayer("Beckham");
        CricketPlayer rahul = new CricketPlayer("Rahul");
        SoccerPlayer mike = new SoccerPlayer("Mike");

        Team<FootballPlayer> UCLA = new Team<>("UCLA");
        UCLA.addMember(beckham);
        //footballTeam.addMember(mike);//This will throw an error as we are adding soccerPlayer to a footballTeam
        UCLA.addMember(new FootballPlayer("Messi"));
        UCLA.addMember(new FootballPlayer("Leonardo"));
        UCLA.memberList();

        Team<CricketPlayer> cricketTeam = new Team<>("Chennai SuperKings");
        cricketTeam.addMember(rahul);
        cricketTeam.addMember(new CricketPlayer("Krishna"));
        cricketTeam.addMember(new CricketPlayer("Dhoni"));
        //cricketTeam.addMember(new SoccerPlayer("Cristano"));
        //This will throw an error as we are adding soccerPlayer to a cricketTeam
        cricketTeam.addMember(new CricketPlayer("Parthiv"));

        Team<FootballPlayer> UFCA = new Team<>("UFCA");
        UFCA.addMember(new FootballPlayer("Cristano"));
        UFCA.addMember(new FootballPlayer("Davinci"));
        UFCA.addMember(new FootballPlayer("Jayant"));
        UFCA.addMember(new FootballPlayer("Jatin"));
        UFCA.memberList();

        Team<FootballPlayer> EA = new Team<>("EA");
        EA.addMember(new FootballPlayer("Razor"));
        EA.addMember(new FootballPlayer("Dustin"));
        EA.addMember(new FootballPlayer("Steve"));
        EA.addMember(new FootballPlayer("Max"));
        EA.memberList();

        UCLA.scoring(UFCA,10,20);
        UCLA.scoring(UFCA,20,10);
        UCLA.scoring(UFCA,10,10);
        UFCA.scoring(EA,30,10);
        UCLA.scoring(EA,10,30);

        System.out.println(UCLA.getName()+" rank is "+UCLA.ranking());
        System.out.println(UFCA.getName()+" rank is "+UFCA.ranking());
        System.out.println(EA.getName()+" rank is "+EA.ranking());

        System.out.println(UCLA.compareTo(EA));
        System.out.println(UCLA.compareTo(UFCA));
        System.out.println(EA.compareTo(UFCA));//-1
        System.out.println(UFCA.compareTo(EA));//1
        UCLA.scoring(UFCA,30,10);
        System.out.println(UCLA.getName()+" rank is "+UCLA.ranking());
        System.out.println(UFCA.getName()+" rank is "+UFCA.ranking());
        System.out.println(EA.getName()+" rank is "+EA.ranking());
        System.out.println(UCLA.compareTo(UFCA));


        //We can use Comparable compareTo method implemented in Team class to sort teamList using Collections.sort()
        //ArrayList<Team> teamList = new ArrayList<>();
        //Collections.sort(teamList)

        League<Team<FootballPlayer>> footballLeague = new League<>("Euro League");
        footballLeague.addTeam(EA);
        footballLeague.addTeam(UCLA);
        footballLeague.addTeam(UFCA);
        //footballLeague.addTeam(cricketTeam);//Throws an error
        footballLeague.teamRankings();
        UFCA.scoring(UCLA,30,20);
        footballLeague.teamRankings();


    }
}
