/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12muonlaxinamoniquejhoienyl;

/**
 *
 * @author MUON
 */
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /*vars*/
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        /* initializing window*/
        JFrame window = new JFrame("Subjects");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout */
        GridLayout layout = new GridLayout(3,3);
        window.setLayout(layout);
        
        /*making the subject panels*/
        SubjectLayout mathLO = new SubjectLayout(math); 
        SubjectLayout bioLO = new SubjectLayout(bio); 
        SubjectLayout chemLO = new SubjectLayout(chem); 
        SubjectLayout physicsLO = new SubjectLayout(physics); 
        SubjectLayout csLO = new SubjectLayout(cs); 
        
        /*display*/
        window.add(mathLO);
        window.add(bioLO);
        window.add(chemLO);
        window.add(physicsLO);
        window.add(csLO);
        
        window.setVisible(true);
    }
    
}
 
