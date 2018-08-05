package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage myStage) throws Exception{
        myStage.setTitle ("Demonstrate a JavaFX label");
        FlowPane rootNode = new FlowPane();
        Scene myScence = new Scene(rootNode, 300, 200);
        myStage.setScene(myScence);
        Label myLabel = new Label("This is a JavaFX label");
        rootNode.getChildren().add(myLabel);
        myStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
