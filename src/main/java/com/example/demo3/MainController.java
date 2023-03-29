package com.example.demo3;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.*;
import java.util.Random;

public class MainController {

    static int score;
    static int lastScore;
    static int topScore;
    int x = 0;
    static boolean jokerEnabled = true;
    @FXML
    Label labelQuestion;
    @FXML
    Label lblScore;
    @FXML
    Label lblJokerStatus;
    @FXML
    Label lblAnswerStatus;
    @FXML
    Label lblTopscore;
    @FXML
    Label lblLastscore;
    @FXML
    TextField textFieldUserName;
    @FXML
    PasswordField passwordFieldPassword;
    @FXML
    Button btnStart;
    @FXML
    Button btnReady;
    @FXML
    Button btnNext;
    @FXML
    Button btnBack;
    @FXML
    Button btnJokerFifty;
    @FXML
    Button btnJokerStatus;
    @FXML
    Button btnA;
    @FXML
    Button btnB;
    @FXML
    Button btnC;
    @FXML
    Button btnD;

    public void reopenMenu() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Menu.fxml"));
        Scene MenuScene = null;
        try {
            MenuScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stageTheButtonBelongs = (Stage) btnBack.getScene().getWindow();
        stageTheButtonBelongs.setTitle("Menu");
        stageTheButtonBelongs.setScene(MenuScene);
        stageTheButtonBelongs.show();
    }

    public void reopenMenuSettings() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Menu.fxml"));
        Scene MenuScene = null;
        try {
            MenuScene = new Scene(fxmlLoader.load(), 500, 300);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stageTheButtonBelongs = (Stage) btnJokerStatus.getScene().getWindow();
        stageTheButtonBelongs.setTitle("Menu");
        stageTheButtonBelongs.setScene(MenuScene);
        stageTheButtonBelongs.show();
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

    public void onButtonJokerStatusClick() {
        if (jokerEnabled) {
            jokerEnabled = false;
            lblJokerStatus.setText("Disabled");
        }
        else {
            jokerEnabled = true;
            lblJokerStatus.setText("Enabled");
        }
    }

    public void onReadyButtonClick() {
        btnA.setVisible(true);
        btnB.setVisible(true);
        btnC.setVisible(true);
        btnD.setVisible(true);
        labelQuestion.setVisible(true);
        lblAnswerStatus.setVisible(true);
        btnReady.setVisible(false);
        loadQuestion_1();
        score = 0;
        lblScore.setText("Score: " + score);
        if (!jokerEnabled) {
            btnJokerFifty.setVisible(false);
        }
    }

    public void loadQuestion_1() {
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            labelQuestion.setText(Question_1_1.Question);
            btnA.setText(Question_1_1.Answer_1);
            btnB.setText(Question_1_1.Answer_2);
            btnC.setText(Question_1_1.Answer_3);
            btnD.setText(Question_1_1.Answer_4);
        } else if (x == 1) {
            labelQuestion.setText(Question_1_2.Question);
            btnA.setText(Question_1_2.Answer_1);
            btnB.setText(Question_1_2.Answer_2);
            btnC.setText(Question_1_2.Answer_3);
            btnD.setText(Question_1_2.Answer_4);
        } else if (x == 2) {
            labelQuestion.setText(Question_1_3.Question);
            btnA.setText(Question_1_3.Answer_1);
            btnB.setText(Question_1_3.Answer_2);
            btnC.setText(Question_1_3.Answer_3);
            btnD.setText(Question_1_3.Answer_4);
        } else if (x == 3) {
            labelQuestion.setText(Question_1_4.Question);
            btnA.setText(Question_1_4.Answer_1);
            btnB.setText(Question_1_4.Answer_2);
            btnC.setText(Question_1_4.Answer_3);
            btnD.setText(Question_1_4.Answer_4);
        }
    }

    public void loadQuestion_2() {
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            labelQuestion.setText(Question_2_1.Question);
            btnA.setText(Question_2_1.Answer_1);
            btnB.setText(Question_2_1.Answer_2);
            btnC.setText(Question_2_1.Answer_3);
            btnD.setText(Question_2_1.Answer_4);
        } else if (x == 1) {
            labelQuestion.setText(Question_2_2.Question);
            btnA.setText(Question_2_2.Answer_1);
            btnB.setText(Question_2_2.Answer_2);
            btnC.setText(Question_2_2.Answer_3);
            btnD.setText(Question_2_2.Answer_4);
        } else if (x == 2) {
            labelQuestion.setText(Question_2_3.Question);
            btnA.setText(Question_2_3.Answer_1);
            btnB.setText(Question_2_3.Answer_2);
            btnC.setText(Question_2_3.Answer_3);
            btnD.setText(Question_2_3.Answer_4);
        } else if (x == 3) {
            labelQuestion.setText(Question_2_4.Question);
            btnA.setText(Question_2_4.Answer_1);
            btnB.setText(Question_2_4.Answer_2);
            btnC.setText(Question_2_4.Answer_3);
            btnD.setText(Question_2_4.Answer_4);
        }
    }

    public void loadQuestion_3() {
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            labelQuestion.setText(Question_3_1.Question);
            btnA.setText(Question_3_1.Answer_1);
            btnB.setText(Question_3_1.Answer_2);
            btnC.setText(Question_3_1.Answer_3);
            btnD.setText(Question_3_1.Answer_4);
        } else if (x == 1) {
            labelQuestion.setText(Question_3_2.Question);
            btnA.setText(Question_3_2.Answer_1);
            btnB.setText(Question_3_2.Answer_2);
            btnC.setText(Question_3_2.Answer_3);
            btnD.setText(Question_3_2.Answer_4);
        } else if (x == 2) {
            labelQuestion.setText(Question_3_3.Question);
            btnA.setText(Question_3_3.Answer_1);
            btnB.setText(Question_3_3.Answer_2);
            btnC.setText(Question_3_3.Answer_3);
            btnD.setText(Question_3_3.Answer_4);
        } else if (x == 3) {
            labelQuestion.setText(Question_3_4.Question);
            btnA.setText(Question_3_4.Answer_1);
            btnB.setText(Question_3_4.Answer_2);
            btnC.setText(Question_3_4.Answer_3);
            btnD.setText(Question_3_4.Answer_4);
        }
    }

    Question Question_1_1 = new Question("Was ist die Hauptstadt von Deutschland?", "Berlin", "München", "Frankfurt am Main", "Bonn");
    Question Question_1_2 = new Question("Wie viele Beine hat eine Spinne?", "16", "10", "8", "6");
    Question Question_1_3 = new Question("Was ist der längste Fluss der Welt?", "Amazonas", "Nil", "Rhein", "Niger");
    Question Question_1_4 = new Question("Was ist die meist gesprochene Sprache in Indien?", "Hindi", "Urdu", "Punjabi", "Bengali");

    Question Question_2_1 = new Question("Wer war der erste deutsche Bundeskanzler?", "Angela Merkel", "Konrad Adenauer", "Theodor Heuss", "Helmut Kohl");
    Question Question_2_2 = new Question("Wie lange ging der 2. Weltkrieg?", "6 Jahre und 1 Tag", "5 Jahre und 340 Tage", "6 Jahre und 123 Tage", "4 Jahre");
    Question Question_2_3 = new Question("Wie viele Tasten hat ein Klavier?", "74", "86", "82", "88");
    Question Question_2_4 = new Question("Von wem wird der Bundespräsident gewählt?", "Vom Europäischen Parlament", "Vom Bundeskanzler", "Vom Bundestag", "Von der Bundesversammlung");

    Question Question_3_1 = new Question("Aus welchem Land kommt die Band AC/DC?", "Neuseeland", "USA", "Australien", "England");
    Question Question_3_2 = new Question("Wo befindet sich der Gletscher mit dem Namen Eyjafjallajökull?", "Grönland", "Norwegen", "Island", "Russland");
    Question Question_3_3 = new Question("Was ist ein Sonett?", "Eine Form des Gedichts", "Eine Art Waffe", "Ein Messgerät", "Ein Bauteil einer Radaranlage");
    Question Question_3_4 = new Question("Von wem stammt der berühmte Satz „Ich denke, also bin ich“?", "John Fitzgerald Kennedy", "George Walker Bush", "René Descartes", "Julius Caesar");

    public void onButtonAClick() {
        if (labelQuestion.getText().equals(Question_1_1.Question) || labelQuestion.getText().equals(Question_1_4.Question) || labelQuestion.getText().equals(Question_2_2.Question) || labelQuestion.getText().equals(Question_3_3.Question)) {
            lblAnswerStatus.setText("Correct");
            score ++;
            lblScore.setText("Score: " + score);
            btnNext.setVisible(true);
            btnB.setVisible(false);
            btnC.setVisible(false);
            btnD.setVisible(false);
        }
        else {
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
            btnB.setVisible(false);
            btnC.setVisible(false);
            btnD.setVisible(false);
        }
    }

    public void onButtonBClick() {
        if (labelQuestion.getText().equals(Question_2_1.Question) || labelQuestion.getText().equals(Question_1_3.Question)) {
            lblAnswerStatus.setText("Correct");
            score ++;
            lblScore.setText("Score: " + score);
            btnNext.setVisible(true);
            btnA.setVisible(false);
            btnC.setVisible(false);
            btnD.setVisible(false);
        }
        else {
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
            btnA.setVisible(false);
            btnC.setVisible(false);
            btnD.setVisible(false);
        }
    }

    public void onButtonCClick() {
        if (labelQuestion.getText().equals(Question_1_2.Question) || labelQuestion.getText().equals(Question_3_1.Question) || labelQuestion.getText().equals(Question_3_2.Question) || labelQuestion.getText().equals(Question_3_4.Question)) {
            lblAnswerStatus.setText("Correct");
            score ++;
            lblScore.setText("Score: " + score);
            btnNext.setVisible(true);
            btnA.setVisible(false);
            btnB.setVisible(false);
            btnD.setVisible(false);
        }
        else {
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
            btnA.setVisible(false);
            btnB.setVisible(false);
            btnD.setVisible(false);
        }
    }

    public void onButtonDClick() {
        if (labelQuestion.getText().equals(Question_2_3.Question) || labelQuestion.getText().equals(Question_2_4.Question)) {
            lblAnswerStatus.setText("Correct");
            score ++;
            lblScore.setText("Score: " + score);
            btnNext.setVisible(true);
            btnA.setVisible(false);
            btnB.setVisible(false);
            btnC.setVisible(false);
        }
        else {
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
            btnA.setVisible(false);
            btnB.setVisible(false);
            btnC.setVisible(false);
        }
    }


    public void onButtonNextClick() {
        btnA.setVisible(true);
        btnB.setVisible(true);
        btnC.setVisible(true);
        btnD.setVisible(true);
        if (labelQuestion.getText().equals(Question_1_1.Question) || labelQuestion.getText().equals(Question_1_2.Question) || labelQuestion.getText().equals(Question_1_3.Question) || labelQuestion.getText().equals(Question_1_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_2();
        } else if (labelQuestion.getText().equals(Question_2_1.Question) || labelQuestion.getText().equals(Question_2_2.Question) || labelQuestion.getText().equals(Question_2_3.Question) || labelQuestion.getText().equals(Question_2_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_3();
        } else if (labelQuestion.getText().equals(Question_3_1.Question) || labelQuestion.getText().equals(Question_3_2.Question) || labelQuestion.getText().equals(Question_3_3.Question) || labelQuestion.getText().equals(Question_3_4.Question)) {
            reopenMenu();
        }
    }

    public void onButtonBackClick() {
        reopenMenu();
    }

    public void onButtonJokerFiftyClick() {
        if (labelQuestion.getText().equals(Question_1_1.Question) || labelQuestion.getText().equals(Question_1_4.Question) || labelQuestion.getText().equals(Question_2_2.Question) || labelQuestion.getText().equals(Question_3_3.Question)) {
            int a;
            Random random = new Random();
            a = random.nextInt(3);
            if (a == 0) {
                btnB.setVisible(false);
                btnC.setVisible(false);
            } else if (a == 1) {
                btnB.setVisible(false);
                btnD.setVisible(false);
            } else if (a == 2) {
                btnC.setVisible(false);
                btnD.setVisible(false);
            }
            btnJokerFifty.setVisible(false);
        } else if (labelQuestion.getText().equals(Question_2_1.Question) || labelQuestion.getText().equals(Question_1_3.Question)) {
            int b;
            Random random = new Random();
            b = random.nextInt(3);
            if (b == 0) {
                btnA.setVisible(false);
                btnC.setVisible(false);
            } else if (b == 1) {
                btnA.setVisible(false);
                btnD.setVisible(false);
            } else if (b == 2) {
                btnC.setVisible(false);
                btnD.setVisible(false);
            }
            btnJokerFifty.setVisible(false);
        } else if (labelQuestion.getText().equals(Question_1_2.Question) || labelQuestion.getText().equals(Question_3_1.Question) || labelQuestion.getText().equals(Question_3_2.Question) || labelQuestion.getText().equals(Question_3_4.Question)) {
            int c;
            Random random = new Random();
            c = random.nextInt(3);
            if (c == 0) {
                btnA.setVisible(false);
                btnB.setVisible(false);
            } else if (c == 1) {
                btnA.setVisible(false);
                btnD.setVisible(false);
            } else if (c == 2) {
                btnB.setVisible(false);
                btnD.setVisible(false);
            }
            btnJokerFifty.setVisible(false);
        } else if (labelQuestion.getText().equals(Question_2_3.Question) || labelQuestion.getText().equals(Question_2_4.Question)) {
            int d;
            Random random = new Random();
            d = random.nextInt(3);
            if (d == 0) {
                btnA.setVisible(false);
                btnB.setVisible(false);
            } else if (d == 1) {
                btnA.setVisible(false);
                btnC.setVisible(false);
            } else if (d == 2) {
                btnB.setVisible(false);
                btnC.setVisible(false);
            }
            btnJokerFifty.setVisible(false);
        }
    }

    public void getLastscore() {
        lastScore = score;
        System.out.println(lastScore + " " + score);
    }

    public void getTopscore() {
        if (score > topScore) {
            topScore = score;
        }
    }

    public void onButtonReloadClick() {
        deserializeUserSettings();
        getLastscore();
        getTopscore();
        lblLastscore.setText("Last Score: " + lastScore);
        lblTopscore.setText("Top Score: " + topScore);
    }

    public void onButtonSettingsBackClick() {
        reopenMenuSettings();
    }

    static UserSettings FelixSettings = new UserSettings("Felix", "1234", topScore);

    public static void serializeUserSettings() {
        if (FelixSettings.TopScore < topScore) {
            FelixSettings.TopScore = topScore;
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("C:/Users/Felix/IdeaProjects/demo3/UserSettings/usersettings.ser");
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
            FileInputStream fileIn = new FileInputStream("C:/Users/Felix/IdeaProjects/demo3/UserSettings/usersettings.ser");
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

        System.out.println("Deserialization Users...");
        System.out.println("Name: " + FelixSettings.Username);
        System.out.println("Top Score: " + FelixSettings.TopScore);
        topScore = FelixSettings.TopScore;
    }

    public void onButtonCloseClick() {
        serializeUserSettings();
        Platform.exit();
    }
}