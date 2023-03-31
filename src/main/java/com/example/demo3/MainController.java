package com.example.demo3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
            //lblTopScoreNumber.textProperty().bind(new SimpleIntegerProperty(FelixSettings.TopScore).asString());
            lblTopScoreNumber.setText(String.valueOf(FelixSettings.TopScore));
        }
        lastScore = Score;
        lblLastScoreNumber.setText(String.valueOf(lastScore));
        jokerEnabled = SettingsController.Joker;
    }

    public void onStartButtonClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Game.fxml"));
        Scene GameScene = null;
        try {
            GameScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stageTheButtonBelongs = (Stage) btnStart.getScene().getWindow();
        stageTheButtonBelongs.setTitle("Game");
        stageTheButtonBelongs.setScene(GameScene);
        stageTheButtonBelongs.show();
    }

    public void onButtonSettingsClick() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Settings.fxml"));
        Scene SettingsScene = null;
        try {
            SettingsScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stageTheButtonBelongs = (Stage) btnStart.getScene().getWindow();
        stageTheButtonBelongs.setTitle("Settings");
        stageTheButtonBelongs.setScene(SettingsScene);
        stageTheButtonBelongs.show();
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
}