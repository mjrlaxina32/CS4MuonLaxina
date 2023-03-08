/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exercise13muonlaxinamoniquejhoienyl;

import static exercise13muonlaxinamoniquejhoienyl.Main.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import java.io.*;

/**
 *
 * @author Monique Jhoienyl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML TextField searchField;
    @FXML Button searchButton;
    @FXML ImageView subjImg;
    @FXML Label subjName;
    @FXML Text subjUnits;
    @FXML Text subjGrade;
    @FXML Button navPrev;
    @FXML Button navNext;
    @FXML Text info;
    private Label label;
    private int curr;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        update(0);
        info.setVisible(false);
        
    }    
      
    private void update(int curr){
        displayedSubject = displayedSubject.getSubject(curr); 
        
        subjName.setText(displayedSubject.getName());
        subjUnits.setText("Units: " + String.valueOf(displayedSubject.getUnits()));
        subjGrade.setText("Grade: " + String.valueOf(displayedSubject.getGrade()));
        Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
        subjImg.setImage(image);
        
        info.setVisible(false);
        
        int ind = Subject.getListLength()-1;
        if(curr<ind){
            navNext.setDisable(false); 
        }
        else{
            navNext.setDisable(true);
        }
        
        if(curr>0){
            navPrev.setDisable(false); 
        }
        else{
            navPrev.setDisable(true);
        }
    }
    
    @FXML private void next(){
        curr++;
        update(curr);
    }
    
    @FXML private void prev(){
        curr--;
        update(curr);
    }
    
    @FXML private void search(){
        String searchSub = searchField.getText();
        try{
            int searchRes = Subject.getSubjectIndex(searchSub);
            curr = searchRes;
            update(curr);
        }
        catch(Exception e){
            info.setVisible(true);
        }  
    } 
}
