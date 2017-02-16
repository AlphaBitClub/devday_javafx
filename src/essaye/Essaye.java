
package essaye;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Essaye extends Application {
    
    @Override
   
    public void start(Stage primaryStage) {
       AnchorPane root = null;
      try{
        
         root = FXMLLoader.load(getClass().getResource("/essaye/FXMLessaye.fxml"));// pan principal
      }catch(IOException e){
         e.printStackTrace();}
        
        
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("mon touuuut 1er exemple");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
