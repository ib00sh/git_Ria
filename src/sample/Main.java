package sample;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;




public class Main extends Application {
    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws Exception{
        myStage.setTitle ("Demonstrate a JavaFX label");
        FlowPane rootNode = new FlowPane(10,10);
        rootNode.setAlignment(Pos.CENTER);
        Scene myScence = new Scene(rootNode, 300, 100);
        myStage.setScene(myScence);
        response = new Label("Push a Button");

        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

//        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                response.setText("Alpha was pressed. ");
//            }
//        });

        btnAlpha.setOnAction( (ae) -> response.setText("Alpha was pressed"));


        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Beta was pressed");
            }
        });

        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);
        myStage.show();
    }



}
