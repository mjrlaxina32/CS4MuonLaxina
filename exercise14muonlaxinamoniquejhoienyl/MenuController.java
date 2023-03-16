/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package exercise14muonlaxinamoniquejhoienyl;

import java.io.IOException;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Lauan 03
 */
public class MenuController implements Initializable {
    
    @FXML private ImageView icon1, icon2, icon3;
    @FXML private Button prev, next;
    
    private int page;
    private int maxPage;
    private ArrayList<ImageView> iconList;
    
    @FXML private void next(){
        clearIcons();
        page++;
        setSubjectIcons();
        checkLimit();
    }
    
    @FXML private void previous(){
        clearIcons();
        page--;
        setSubjectIcons();
        checkLimit();
    }
    
    public void setSubjectIcons(){
        int index = page*3;
        for(int i=0; i<iconList.size(); i++){
            try{
                Subject s = Subject.getSubjectByIndex(index + i);
                Image img = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
                iconList.get(i).setImage(img);
            }
            catch(IndexOutOfBoundsException e){
                Image img = new Image(getClass().getResourceAsStream("imgs/empty.png"));
                iconList.get(i).setImage(img);
            }
        }
    }
    
    public void checkLimit(){
        if(page == maxPage) next.setDisable(true);
        else next.setDisable(false);
        if(page == 0) prev.setDisable(true);
        else prev.setDisable(false);
    }
    
    public void clearIcons(){
        for(ImageView i : iconList){
            i.setImage(null);
        }
    }
    
    public void subjOpen(MouseEvent click) throws IOException{
       String iconN = ((ImageView)click.getSource()).getId();
       System.out.println(iconN);
       iconN = iconN.replace("icon", "");
       int indexList = page*3;
       int index = abs(indexList + parseInt(iconN)-1); 
       
       Node node = (Node)click.getSource();
       Scene currentScene = node.getScene();
       Stage currentStage = (Stage)currentScene.getWindow();

       FXMLLoader loader = new FXMLLoader(getClass().getResource("SubjectView.fxml"));
       Parent root = loader.load();
       SubjectViewController controller = loader.getController();
       controller.update(index);

       Scene subjectScene = new Scene(root);
       Stage thisStage = (Stage)((Node)click.getSource()).getScene().getWindow();
       thisStage.hide();
       thisStage.setScene(subjectScene);
       thisStage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iconList = new ArrayList();
        iconList.add(icon1);
        iconList.add(icon2);
        iconList.add(icon3);
        page = 0;
        maxPage = Subject.getListLength()/3;
        setSubjectIcons();
        checkLimit();
    }    
    
}
