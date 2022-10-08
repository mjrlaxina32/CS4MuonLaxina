/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex4;

/**
 *
 * @author Monique Jhoienyl
 */
public class Song {
    private double minuteRunTime;
    private String title, artist, album;
    private boolean liked;
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public Song(double minuteRunTime, String title, String artist, String album, boolean liked){
        this.minuteRunTime = minuteRunTime;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.liked = liked;
        System.out.println(title+" by "+artist+"\n Album: "+album+"\n Duration "+minuteRunTime+"\n Liked: "+liked+"\n");
    }
}
