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
public class SubjectLayout extends JPanel{
    private JPanel subjLO;
    private JFrame subjDet;
    private JLabel subjIcon;
    
    
    public SubjectLayout(Subject displayedSubject){
        /*super("Subjects");
        this.setLayout(new GridLayout(2,3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);*/
        this.subjIcon = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        this.subjIcon.setIcon(img);
        this.subjIcon.setText(displayedSubject.getName());
        this.subjIcon.setHorizontalTextPosition(JLabel.CENTER);
        this.subjIcon.setVerticalTextPosition(JLabel.BOTTOM);
        this.subjDet = new DetailLayout(displayedSubject);
        subjLO.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        subjLO.add(subjIcon);
        subjLO.add(subjDet);
    }
    
    
}
