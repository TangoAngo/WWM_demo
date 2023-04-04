package com.example.demo3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    //Integers in Main
    static int Score;
    static int lastScore;
    static int topScore;

    //Booleans in Main
    static boolean jokerEnabled;

    //UserSettings in Main
    static UserSettings FelixSettings = new UserSettings("Felix", "1234", topScore);

    //Buttons in Main.fxml
    @FXML
    Button btnStart;
    @FXML
    Button btnSettings;
    @FXML
    Button btnClose;

    //Labels in Main.fxml
    @FXML
    Label lblTopscore;
    @FXML
    Label lblTopScoreNumber;
    @FXML
    Label lblLastscore;
    @FXML
    Label lblLastScoreNumber;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deserializeUserSettings();
        Score = GameController.Score;
        if (Score > topScore) {
            topScore = Score;
            lblTopScoreNumber.setText(String.valueOf(topScore));
        } else {
            lblTopScoreNumber.setText(String.valueOf(FelixSettings.TopScore));
        }
        lastScore = Score;
        lblLastScoreNumber.setText(String.valueOf(lastScore));
        jokerEnabled = SettingsController.Joker;
        serializeUserSettings();
    }

    public void onStartButtonClick() {
        try {
            Parent root = FXMLLoader.load(GameController.class.getResource("Game.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Stage stage = (Stage) btnStart.getScene().getWindow();
            stage.setTitle("Wer wird Millionär?");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void onButtonStartEntered() {
        btnStart.setStyle("-fx-background-color: Orange");
    }

    public void onButtonStartExited() {
        btnStart.setStyle("-fx-background-color: Null");
    }

    public void onButtonSettingsClick() {
        try {
            Parent root = FXMLLoader.load(SettingsController.class.getResource("Settings.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            Stage stage = (Stage) btnStart.getScene().getWindow();
            stage.setTitle("Wer wird Millionär?");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void onButtonSettingsEntered() {
        btnSettings.setStyle("-fx-background-color: Orange");
    }

    public void onButtonSettingsExited() {
        btnSettings.setStyle("-fx-background-color: Null");
    }

    public static void serializeUserSettings() {
        if (FelixSettings.TopScore < topScore) {
            FelixSettings.TopScore = topScore;
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("./UserSettings/usersettings.ser");
            ObjectOutputStream out =  new ObjectOutputStream(fileOut);
            out.writeObject(FelixSettings);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void deserializeUserSettings() {
        FelixSettings = null;
        try {
            FileInputStream fileIn = new FileInputStream("./UserSettings/usersettings.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            FelixSettings = (UserSettings) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }
        topScore = FelixSettings.TopScore;
    }

    public void onButtonCloseClick() {
        serializeUserSettings();
        Platform.exit();
    }

    public void onButtonCloseEntered() {
        btnClose.setStyle("-fx-background-color: Orange");
    }

    public void onButtonCloseExited() {
        btnClose.setStyle("-fx-background-color: Null");
    }
}