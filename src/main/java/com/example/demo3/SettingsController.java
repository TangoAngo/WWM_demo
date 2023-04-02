package com.example.demo3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {

    //Booleans in Settings
    static boolean Joker;

    //Buttons in Settings.fxml
    @FXML
    Button btnJoker;
    @FXML
    Button btnBack;

    //Labels in Settings.fxml
    @FXML
    Label lblJoker;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (Joker == true) {
            lblJoker.setText("Enabled");
        } else if (Joker == false) {
            lblJoker.setText("Disabled");
        }
    }

    public void onButtonJokerClick() {
        if (Joker == true) {
            Joker = false;
            lblJoker.setText("Disabled");
        } else if (Joker == false) {
            Joker = true;
            lblJoker.setText("Enabled");
        }
    }

    public void onButtonJokerEntered() {
        btnJoker.setStyle("-fx-background-color: Orange");
    }

    public void onButtonJokerExited() {
        btnJoker.setStyle("-fx-background-color: Null");
    }

    public void onButtonBackClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Menu.fxml"));
        Scene MenuScene = null;
        try {
            MenuScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stageTheButtonBelongs = (Stage) btnBack.getScene().getWindow();
        stageTheButtonBelongs.setTitle("Wer wird Millionär?");
        stageTheButtonBelongs.setScene(MenuScene);
        stageTheButtonBelongs.show();
    }

    public void onButtonBackEntered() {
        btnBack.setStyle("-fx-background-color: Orange");
    }

    public void onButtonBackExited() {
        btnBack.setStyle("-fx-background-color: Null");
    }
}
