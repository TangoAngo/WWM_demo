package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene logInScene = new Scene(fxmlLoader.load(), 275, 300);
        primaryStage.setTitle("Log In");
        primaryStage.setScene(logInScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}