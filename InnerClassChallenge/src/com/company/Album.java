package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean add(Song song){
            if(this.songs.contains(song))
                return false;
            this.songs.add(song);
            return true;

        }
        private Song findSong(String title){
            for(int i=0;i<this.songs.size();i++){
                if(this.songs.get(i).getTitle().equals(title))
                    return this.songs.get(i);
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber-1;
            if(index>=this.songs.size() || index<0)
                return null;
            return this.songs.get(index);
        }

    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
    }



    public boolean addToPlayList(int number, LinkedList<Song> linkedList){
        Song song = this.songs.findSong(number);
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

    public boolean addToPlayList(String title, LinkedList<Song> linkedList){
        Song song = this.songs.findSong(title);
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
