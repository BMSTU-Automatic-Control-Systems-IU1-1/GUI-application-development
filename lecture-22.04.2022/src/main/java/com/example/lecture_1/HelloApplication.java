package com.example.lecture_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group_first = new Group();
        Scene scene_first = new Scene(group_first, 500, 500);

        
    }

    public static void main(String[] args) {
        launch();
    }
}