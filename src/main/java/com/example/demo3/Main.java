package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Menu.fxml"));
        Scene MenuScene = null;
        try {
            MenuScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        primaryStage.setTitle("Menu");
        primaryStage.setScene(MenuScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}