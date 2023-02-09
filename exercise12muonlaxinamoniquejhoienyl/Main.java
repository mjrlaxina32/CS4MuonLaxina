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
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*vars*/
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        Subject displayedSubject = cs;
        
        JFrame window = new JFrame("Swing window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout */
        window.setLayout(new GridLayout(2,3));
        
        
        /* Adding text */
        JLabel subjUnits = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()));
        JLabel subjGrade = new JLabel("Grade: "+ String.valueOf(displayedSubject.getGrade()));
        subjUnits.setVerticalTextPosition(JLabel.BOTTOM);
        subjGrade.setForeground(Color.blue);
        window.add(subjUnits);
        window.add(subjGrade);
        
        /* Adding an image */
        JLabel subjIcon = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        subjIcon.setIcon(img);
        subjIcon.setText(displayedSubject.getName());
        subjIcon.setHorizontalTextPosition(JLabel.CENTER);
        subjIcon.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(subjIcon);
        
        /* Adding a button */
        JButton button = new JButton("Next");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
 
