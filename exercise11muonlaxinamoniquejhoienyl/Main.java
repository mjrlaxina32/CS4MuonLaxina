/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise11muonlaxinamoniquejhoienyl;

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
        Subject displayedSubject = math;
        
        JFrame window = new JFrame("Swing window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(450,450);
        
        /* Setting a layout */
        window.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        
        /* Adding text */
        JLabel sampleText = new JLabel(displayedSubject.getName());
        sampleText.setForeground(Color.blue);
        sampleText.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        window.add(sampleText);
         
        /* Adding an image */
        JLabel sampleImage = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        sampleImage.setIcon(img);
        sampleImage.setText(String.valueOf(displayedSubject.getUnits()));
        sampleImage.setHorizontalTextPosition(JLabel.CENTER);
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(sampleImage);
        sampleImage.setText(String.valueOf(displayedSubject.getGrade()));
        sampleImage.setVerticalTextPosition(JLabel.BOTTOM);
        window.add(sampleImage);
        
        /* Adding a button */
        JButton button = new JButton("Next");
        button.setHorizontalTextPosition(JButton.LEFT);
        window.add(button);
        
        window.setVisible(true);
    }
    
}
 