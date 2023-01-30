package com.example.homework_2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
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

        stage.setScene(scene);
        stage.setTitle("SQUARE OF BUTTON");

        Button button1 = new Button("First");
        Button button2 = new Button("Second");

        button1.setLayoutX(500);
        button1.setLayoutY(500);

        button2.setLayoutX(100);
        button2.setLayoutY(100);

        button1.setMinSize(200, 200);
        button2.setMinSize(200, 200);

        group.getChildren().add(button2);
        group.getChildren().add(button1);

        final double[] buttonCoords_1 = new double[2];
        final double[] buttonCoords_2 = new double[2];

        button1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Mouse 1 clicked");
                System.out.println("1 X: " + mouseEvent.getSceneX());
                System.out.println("1 Y: " + mouseEvent.getSceneY());

                if((mouseEvent.getSceneX() - button2.getHeight() < 0)
                        && (mouseEvent.getSceneY() - button2.getWidth() < 0)) {

                    System.out.println(
                            (mouseEvent.getSceneX() - button2.getHeight())
                            * (mouseEvent.getSceneY() - button2.getWidth())
                    );

                }

                buttonCoords_1[0] = mouseEvent.getX();
                buttonCoords_1[1] = mouseEvent.getY();
                scene.setCursor(Cursor.CLOSED_HAND);
            }
        });

        button1.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) { scene.setCursor(Cursor.DEFAULT); }
        });

        button2.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) { scene.setCursor(Cursor.DEFAULT); }
        });

        button1.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button1.setLayoutX((mouseEvent.getSceneX() - buttonCoords_1[0]));
                button1.setLayoutY((mouseEvent.getSceneY() - buttonCoords_1[1]));

                if((mouseEvent.getSceneX() - button2.getHeight() - buttonCoords_1[0] < 0)
                        && (mouseEvent.getSceneY() - button2.getWidth() - buttonCoords_1[1] < 0)) {

                    System.out.println(
                            "Square = " + (mouseEvent.getSceneX() - button2.getHeight() - buttonCoords_1[0])
                                    * (mouseEvent.getSceneY() - button2.getWidth() - buttonCoords_1[1])
                    );

                    // button1.setStyle("-fx-background-color: Red");
                }

            }
        });

        button2.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button2.setLayoutX((mouseEvent.getSceneX() - buttonCoords_2[0]));
                button2.setLayoutY((mouseEvent.getSceneY() - buttonCoords_2[1]));

                if((mouseEvent.getSceneX() - button2.getHeight() - buttonCoords_2[0] < 0)
                        && (mouseEvent.getSceneY() - button2.getWidth() - buttonCoords_2[1] < 0)) {

                    System.out.println(
                            "Square = " + (mouseEvent.getSceneX() - button2.getHeight() - buttonCoords_2[0])
                                    * (mouseEvent.getSceneY() - button2.getWidth() - buttonCoords_2[1])
                    );

                    // button1.setStyle("-fx-background-color: Red");
                }

            }
        });

        button2.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Mouse 2 clicked");
                System.out.println("2 X: " + mouseEvent.getSceneX());
                System.out.println("2 Y: " + mouseEvent.getSceneY());

                if((mouseEvent.getSceneX() - button2.getHeight() < 0)
                        && (mouseEvent.getSceneY() - button2.getWidth() < 0)) {

                    System.out.println(
                            (mouseEvent.getSceneX() - button2.getHeight())
                                    * (mouseEvent.getSceneY() - button2.getWidth())
                    );

                }

                buttonCoords_2[0] = mouseEvent.getX();
                buttonCoords_2[1] = mouseEvent.getY();
                scene.setCursor(Cursor.CLOSED_HAND);
            }
        });

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}