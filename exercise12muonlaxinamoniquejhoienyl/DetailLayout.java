/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise12muonlaxinamoniquejhoienyl;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author MUON
 */
public class DetailLayout extends JFrame{
    private JPanel subjDet;
    private JLabel subjUnits, subjGrade;
    
    
    public DetailLayout(Subject displayedSubject){
        /*super("Subjects");
        this.setLayout(new GridLayout(2,3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);*/
        this.subjUnits = new JLabel("Units: " + String.valueOf(displayedSubject.getUnits()));
        this.subjGrade = new JLabel("Grade: "+ String.valueOf(displayedSubject.getGrade()));
        this.subjDet = new JPanel();
        subjDet.setLayout(new BoxLayout(subjDet, BoxLayout.Y_AXIS));
        subjDet.add(subjUnits);
        subjDet.add(subjGrade);
        
        
        //this.setLayout(new GridLayout(2,3));
    }
    
    
}
