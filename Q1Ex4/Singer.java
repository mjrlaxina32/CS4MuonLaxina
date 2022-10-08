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
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favSong;
    private static int totalPerformances;
    
    //favoriteSong - how to assign a class to a variable 
    public Singer(String name){
        this.name = name;
        noOfPerformances = 0;
        earnings = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public void performForAudience(int personNum) {
        noOfPerformances++;
        totalPerformances++;
        earnings += 100*personNum;
        System.out.println(name+" performed for a whopping audience of "+personNum+". They now have "+earnings+" pesos. They have performed "+noOfPerformances+" times.");
        System.out.println("All the singers have performed "+totalPerformances+" times.\n");
    }
    
    public void performForAudience(int personNum, Singer collab) {
        noOfPerformances++;
        totalPerformances++;
        collab.noOfPerformances++;
        earnings += 50*personNum;
        collab.earnings += 50*personNum;
        System.out.println(name+" collabed with "+collab.getName()+" to perform for a whopping audience of "+personNum+". They now have "+earnings+" pesos. They have performed "+noOfPerformances+" times.");
        System.out.println("All the singers have performed "+totalPerformances+" times.\n");
    }
     
    
    public void setFavSong(Song cSong) {
        this.favSong = cSong;
        System.out.println(name+"'s Favorite song is "+favSong.getTitle()+" by "+favSong.getArtist()+".\n");
    }
}
