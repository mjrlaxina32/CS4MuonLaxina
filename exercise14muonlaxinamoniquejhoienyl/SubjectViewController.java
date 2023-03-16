/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exercise14muonlaxinamoniquejhoienyl;

import static exercise14muonlaxinamoniquejhoienyl.FXExer14.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import javafx.scene.control.Alert.AlertType;
import java.io.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 *
 * @author Monique Jhoienyl
 */
public class SubjectViewController implements Initializable {
    
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
      
    public void update(int curr){
        this.curr = curr;
        displayedSubject = Subject.getSubjectByIndex(curr); 
        
        subjName.setText(displayedSubject.getName());
        subjUnits.setText("Units: " + String.valueOf(displayedSubject.getUnits()));
        subjGrade.setText("Grade: " + String.valueOf(displayedSubject.getGrade()));
        Image image = new Image(getClass().getResourceAsStream("imgs/" + displayedSubject.getImgFileName()));
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
    
    @FXML public void back(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        Parent root = loader.load(); 
        Scene subjectScene = new Scene(root);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        thisStage.setScene(subjectScene);
        thisStage.show();
    }
    
    @FXML private void search(){
        String searchSub = searchField.getText();
        try{
            int searchRes = Subject.getSubjectIndex(searchSub);
            curr = searchRes;
            update(curr);
        }
        catch(Exception e){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("");
            alert.setHeaderText("Invalid Search");
            alert.setContentText("The subject " + searchSub + " does not exist. Please try again.");
            alert.showAndWait();
            info.setVisible(true);
        }  
    } 
}
