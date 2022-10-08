/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1ex4;

/**
 *
 * @author Monique Jhoienyl
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favSong;
    
    //favoriteSong - how to assign a class to a variable 
    public Singer(String name){
        this.name = name;
        noOfPerformances = 0;
        earnings = 0;
    }
    
    public void performForAudience(int personNum) {
        noOfPerformances++;
        earnings += 100*personNum;
        System.out.println(name+" performed for a whopping audience of "+personNum+". They now have "+earnings+" pesos. They have performed "+noOfPerformances+" times.");
    }
     
    public void setFavSong(Song cSong) {
        this.favSong = cSong;
        System.out.println(name+"'s Favorite song is "+favSong.title+" by "+favSong.artist+".");
    }
}
