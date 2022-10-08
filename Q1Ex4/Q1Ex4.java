/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1ex4;

/**
 *
 * @author Monique Jhoienyl
 */
public class Q1Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CLASS - SUBJECTS
            Subjects sub1 = new Subjects(2, "Sir. Tarcelo", "CompSci", "Monday");
            Subjects sub2 = new Subjects(1, "Ma'am Bulan", "English", "Monday");
            Subjects sub3 = new Subjects(2, "Sir. Neil", "Physics", "Friday");

        //SONG
            Song song1 = new Song(4.34, "Marilag", "Munimuni", "Simula", true);
            Song song2 = new Song(3.41, "Mercy", "Shawn Mendez", "Illuminate", false);

        //SINGER
            Song song3 = new Song(3.41, "Ligaya", "Eraserheads", "Ultramagneticpop!", true);

            Singer singer1 = new Singer("Mang Aawit");
            Singer singer2 = new Singer("Taga Tipa");
            singer1.setFavSong(song1);
            singer1.performForAudience(10);
            singer1.setFavSong(song3);
            singer1.performForAudience(10, singer2);
            singer2.performForAudience(1);
            singer2.performForAudience(10, singer1);
           //System.out.println(singer1.favSong.title);
    }
    
}
