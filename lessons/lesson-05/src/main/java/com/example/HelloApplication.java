package com.example.lesson_5;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 800, 800);

        stage.setTitle("Game!");

        Button button_1 = new Button("Roma");
        Button button_2 = new Button("Lesha");
        button_2.setLayoutX(150);
        button_2.setLayoutY(150);

        button_1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        }

                group.getChildren().add(button_1);
        group.getChildren().add(button_2);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}