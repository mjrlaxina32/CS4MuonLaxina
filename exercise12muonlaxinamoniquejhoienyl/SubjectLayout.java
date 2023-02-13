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
    private JPanel subjDet;
    private JLabel subjIcon;
    
    
    public SubjectLayout(Subject displayedSubject){
        subjLO = new JPanel();
        FlowLayout layout =  new FlowLayout(FlowLayout.CENTER);
        subjLO.setLayout(layout);
        this.subjIcon = new JLabel();
        ImageIcon img = new ImageIcon(Main.class.getResource(displayedSubject.getImgFileName()));
        this.subjIcon.setIcon(img);
        this.subjIcon.setText(displayedSubject.getName());
        this.subjIcon.setHorizontalTextPosition(JLabel.CENTER);
        this.subjIcon.setVerticalTextPosition(JLabel.BOTTOM);
        this.subjDet = new DetailLayout(displayedSubject);
        
        subjLO.add(subjIcon);
        subjLO.add(subjDet);
        this.add(subjLO);
        //this.add(subjDet);
        //this.add(subjIcon);
    }
}
