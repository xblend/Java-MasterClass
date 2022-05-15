package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(this.findSong(title)!=null)
            return false;
        this.songs.add(new Song(title,duration));
        return true;
    }

    private Song findSong(String title){
        for(int i=0;i<this.songs.size();i++){
            if(this.songs.get(i).getTitle().equals(title))
                return this.songs.get(i);
        }
        return null;
    }

    public boolean addToPlayList(int number, LinkedList<Song> linkedList){
        if(number>this.songs.size() || number<=0)
            return false;
        Song song = this.songs.get(number-1);
        Iterator<Song> songIterator = linkedList.iterator();
        while(songIterator.hasNext()){
            if(songIterator.next().getTitle().equals(song.getTitle()))
                return false;
        }
        linkedList.add(song);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> linkedList){
        Song song = this.findSong(title);
        if(song==null)
            return false;
        Iterator<Song> songIterator = linkedList.iterator();
        while(songIterator.hasNext()){
            if(songIterator.next().getTitle().equals(song.getTitle()))
                return false;
        }
        linkedList.add(song);
        return true;
    }
}
