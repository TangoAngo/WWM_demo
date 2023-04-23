package com.example.demo3;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    //Integers in Game
    static int Score;

    //Buttons in Game.fxml
    @FXML
    Button btnNext;
    @FXML
    Button btnBack;
    @FXML
    Button btnJokerFifty;
    @FXML
    Button btnJokerTelephone;
    @FXML
    Button btnJokerAudience;
    @FXML
    Button btnA;
    @FXML
    Button btnB;
    @FXML
    Button btnC;
    @FXML
    Button btnD;

    //Labels in Game.fxml
    @FXML
    Label lblScore;
    @FXML
    Label lblQuestion;
    @FXML
    Label lblAnswerStatus;
    @FXML
    Label lblJokerTelephone;
    @FXML
    Label lblAudienceA;
    @FXML
    Label lblAudienceB;
    @FXML
    Label lblAudienceC;
    @FXML
    Label lblAudienceD;

    @FXML
    AnchorPane apnAudience;

    @FXML
    ProgressBar pbrAudienceA;
    @FXML
    ProgressBar pbrAudienceB;
    @FXML
    ProgressBar pbrAudienceC;
    @FXML
    ProgressBar pbrAudienceD;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ButtonStyles();
        Score = 0;
        loadQuestion_1();
        if (!SettingsController.Joker) {
            btnJokerFifty.setVisible(false);
            btnJokerTelephone.setVisible(false);
            btnJokerAudience.setVisible(false);
        }
    }

    public void ButtonStyles() {
        btnA.setId("btnAnswers");
        btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnB.setId("btnAnswers");
        btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnC.setId("btnAnswers");
        btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnD.setId("btnAnswers");
        btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnJokerFifty.setId("btnJokerFifty");
        btnJokerFifty.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnJokerAudience.setId("btnJokerAudience");
        btnJokerAudience.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnJokerTelephone.setId("btnJokerTelephone");
        btnJokerTelephone.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
    }

    //Question Question_6_1 = new Question("", "", "", "", "");
    //Question Question_6_2 = new Question("", "", "", "", "");
    //Question Question_6_3 = new Question("", "", "", "", "");
    //Question Question_6_4 = new Question("", "", "", "", "");

    Question Question_1_1 = new Question("Was ist die Hauptstadt von Deutschland?", "Berlin", "München", "Frankfurt am Main", "Bonn");
    Question Question_1_2 = new Question("Wie viele Beine hat eine Spinne?", "8", "10", "16", "6");
    Question Question_1_3 = new Question("Was ist der längste Fluss der Welt?", "Nil", "Amazonas", "Rhein", "Niger");
    Question Question_1_4 = new Question("Was ist die meist gesprochene Sprache in Indien?", "Hindi", "Urdu", "Punjabi", "Bengali");

    Question Question_2_1 = new Question("Wer war der erste deutsche Bundeskanzler?", "Konrad Adenauer", "Angela Merkel", "Theodor Heuss", "Helmut Kohl");
    Question Question_2_2 = new Question("Wie lange ging der 2. Weltkrieg?", "6 Jahre und 1 Tag", "5 Jahre und 340 Tage", "6 Jahre und 123 Tage", "4 Jahre");
    Question Question_2_3 = new Question("Wie viele Tasten hat ein Klavier?", "88", "86", "82", "74");
    Question Question_2_4 = new Question("Von wem wird der Bundespräsident gewählt?", "Von der Bundesversammlung", "Vom Bundeskanzler", "Vom Bundestag", "Vom Europäischen Parlament");

    Question Question_3_1 = new Question("Aus welchem Land kommt die Band AC/DC?", "Australien", "USA", "Neuseeland", "England");
    Question Question_3_2 = new Question("Wo befindet sich der Gletscher mit dem Namen Eyjafjallajökull?", "Island", "Norwegen", "Grönland", "Russland");
    Question Question_3_3 = new Question("Was ist ein Sonett?", "Eine Form des Gedichts", "Eine Art Waffe", "Ein Messgerät", "Ein Bauteil einer Radaranlage");
    Question Question_3_4 = new Question("Von wem stammt der berühmte Satz „Ich denke, also bin ich“?", "René Descartes", "George Walker Bush", "John Fitzgerald Kennedy", "Julius Caesar");

    Question Question_4_1 = new Question("Wie heißt die Hauptstadt von Schweden?", "Stockholm", "Oslo", "Kopenhagen", "Reykjavik");
    Question Question_4_2 = new Question("Welches Tier hat in einem bekannten Kinderlied die Gans gestohlen?", "Fuchs", "Hund", "Wolf", "Dachs");
    Question Question_4_3 = new Question("Wann wird der Tag der Deutschen Einheit gefeiert?", "3. Oktober", "2. November", "4. Juli", "6. September");
    Question Question_4_4 = new Question("Welche ist die Hauptstadt Australiens?", "Canberra", "Sydney", "Melbourne", "Perth");

    Question Question_5_1 = new Question("Wie heißt das flächenmäßig kleinste Bundesland?", "Bremen", "Bayern", "Saarland", "Hamburg");
    Question Question_5_2 = new Question("Welcher deutsche Herrscher trug den Beinamen 'der Große?'", "Friedrich II. von Preußen", "Friedrich I. von Preußen", "Friedrich III. von Sachsen", "Friedrich III. von Österreich");
    Question Question_5_3 = new Question("Wie nennt man einen Feinschmecker auch?", "Gourmet", "Gourmed", "Genießer", "Leckermäulchen");
    Question Question_5_4 = new Question("Welche Insel gehört nicht zu den balarischen Inseln?", "Gran Canaria", "Ibiza", "Formentera", "Cabrera");

    Question Question_6_1 = new Question("Welcher Berg ist der höchste der Welt?", "Mount Everest", "Zugspitze", "Mount Blanc", "Kilimandscharo");
    Question Question_6_2 = new Question("Wann wurde Queen Elisabeth II. gekrönt?", "1953", "1945", "1972", "1964");
    Question Question_6_3 = new Question("Wer war der erste Präsident der USA?", "George Washington", "Theodor Roosevelt", "Brent Peterson", "Bill CLinton");
    Question Question_6_4 = new Question("Wie hoch ist der Eifelturm?", "300m", "220m", "176m", "150m");

    public boolean Correct_A() {
        if (btnA.getText().equals(Question_1_1.Answer_1) || btnA.getText().equals(Question_1_2.Answer_1) || btnA.getText().equals(Question_1_3.Answer_1) || btnA.getText().equals(Question_1_4.Answer_1)) {
            return true;
        } else if (btnA.getText().equals(Question_2_1.Answer_1) || btnA.getText().equals(Question_2_2.Answer_1) || btnA.getText().equals(Question_2_3.Answer_1) || btnA.getText().equals(Question_2_4.Answer_1)) {
            return true;
        } else if (btnA.getText().equals(Question_3_1.Answer_1) || btnA.getText().equals(Question_3_2.Answer_1) || btnA.getText().equals(Question_3_3.Answer_1) || btnA.getText().equals(Question_3_4.Answer_1)) {
            return true;
        } else if (btnA.getText().equals(Question_4_1.Answer_1) || btnA.getText().equals(Question_4_2.Answer_1) || btnA.getText().equals(Question_4_3.Answer_1) || btnA.getText().equals(Question_4_4.Answer_1)) {
            return true;
        } else if (btnA.getText().equals(Question_5_1.Answer_1) || btnA.getText().equals(Question_5_2.Answer_1) || btnA.getText().equals(Question_5_3.Answer_1) || btnA.getText().equals(Question_5_4.Answer_1)) {
            return true;
        } else if (btnA.getText().equals(Question_6_1.Answer_1) || btnA.getText().equals(Question_6_2.Answer_1) || btnA.getText().equals(Question_6_3.Answer_1) || btnA.getText().equals(Question_6_4.Answer_1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Correct_B() {
        if (btnB.getText().equals(Question_1_1.Answer_1) || btnB.getText().equals(Question_1_2.Answer_1) || btnB.getText().equals(Question_1_3.Answer_1) || btnB.getText().equals(Question_1_4.Answer_1)) {
            return true;
        } else if (btnB.getText().equals(Question_2_1.Answer_1) || btnB.getText().equals(Question_2_2.Answer_1) || btnB.getText().equals(Question_2_3.Answer_1) || btnB.getText().equals(Question_2_4.Answer_1)) {
            return true;
        } else if (btnB.getText().equals(Question_3_1.Answer_1) || btnB.getText().equals(Question_3_2.Answer_1) || btnB.getText().equals(Question_3_3.Answer_1) || btnB.getText().equals(Question_3_4.Answer_1)) {
            return true;
        } else if (btnB.getText().equals(Question_4_1.Answer_1) || btnB.getText().equals(Question_4_2.Answer_1) || btnB.getText().equals(Question_4_3.Answer_1) || btnB.getText().equals(Question_4_4.Answer_1)) {
            return true;
        } else if (btnB.getText().equals(Question_5_1.Answer_1) || btnB.getText().equals(Question_5_2.Answer_1) || btnB.getText().equals(Question_5_3.Answer_1) || btnB.getText().equals(Question_5_4.Answer_1)) {
            return true;
        } else if (btnB.getText().equals(Question_6_1.Answer_1) || btnB.getText().equals(Question_6_2.Answer_1) || btnB.getText().equals(Question_6_3.Answer_1) || btnB.getText().equals(Question_6_4.Answer_1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Correct_C() {
        if (btnC.getText().equals(Question_1_1.Answer_1) || btnC.getText().equals(Question_1_2.Answer_1) || btnC.getText().equals(Question_1_3.Answer_1) || btnC.getText().equals(Question_1_4.Answer_1)) {
            return true;
        } else if (btnC.getText().equals(Question_2_1.Answer_1) || btnC.getText().equals(Question_2_2.Answer_1) || btnC.getText().equals(Question_2_3.Answer_1) || btnC.getText().equals(Question_2_4.Answer_1)) {
            return true;
        } else if (btnC.getText().equals(Question_3_1.Answer_1) || btnC.getText().equals(Question_3_2.Answer_1) || btnC.getText().equals(Question_3_3.Answer_1) || btnC.getText().equals(Question_3_4.Answer_1)) {
            return true;
        } else if (btnC.getText().equals(Question_4_1.Answer_1) || btnC.getText().equals(Question_4_2.Answer_1) || btnC.getText().equals(Question_4_3.Answer_1) || btnC.getText().equals(Question_4_4.Answer_1)) {
            return true;
        } else if (btnC.getText().equals(Question_5_1.Answer_1) || btnC.getText().equals(Question_5_2.Answer_1) || btnC.getText().equals(Question_5_3.Answer_1) || btnC.getText().equals(Question_5_4.Answer_1)) {
            return true;
        } else if (btnC.getText().equals(Question_6_1.Answer_1) || btnC.getText().equals(Question_6_2.Answer_1) || btnC.getText().equals(Question_6_3.Answer_1) || btnC.getText().equals(Question_6_4.Answer_1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Correct_D() {
        if (btnD.getText().equals(Question_1_1.Answer_1) || btnD.getText().equals(Question_1_2.Answer_1) || btnD.getText().equals(Question_1_3.Answer_1) || btnD.getText().equals(Question_1_4.Answer_1)) {
            return true;
        } else if (btnD.getText().equals(Question_2_1.Answer_1) || btnD.getText().equals(Question_2_2.Answer_1) || btnD.getText().equals(Question_2_3.Answer_1) || btnD.getText().equals(Question_2_4.Answer_1)) {
            return true;
        } else if (btnD.getText().equals(Question_3_1.Answer_1) || btnD.getText().equals(Question_3_2.Answer_1) || btnD.getText().equals(Question_3_3.Answer_1) || btnD.getText().equals(Question_3_4.Answer_1)) {
            return true;
        } else if (btnD.getText().equals(Question_4_1.Answer_1) || btnD.getText().equals(Question_4_2.Answer_1) || btnD.getText().equals(Question_4_3.Answer_1) || btnD.getText().equals(Question_4_4.Answer_1)) {
            return true;
        } else if (btnD.getText().equals(Question_5_1.Answer_1) || btnD.getText().equals(Question_5_2.Answer_1) || btnD.getText().equals(Question_5_3.Answer_1) || btnD.getText().equals(Question_5_4.Answer_1)) {
            return true;
        } else if (btnD.getText().equals(Question_6_1.Answer_1) || btnD.getText().equals(Question_6_2.Answer_1) || btnD.getText().equals(Question_6_3.Answer_1) || btnD.getText().equals(Question_6_4.Answer_1)) {
            return true;
        } else {
            return false;
        }
    }

    public void loadQuestion_1() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_1_1.Question);
            if (y == 0) {
                btnA.setText(Question_1_1.Answer_1);
                btnB.setText(Question_1_1.Answer_2);
                btnC.setText(Question_1_1.Answer_3);
                btnD.setText(Question_1_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_1_1.Answer_1);
                btnC.setText(Question_1_1.Answer_2);
                btnD.setText(Question_1_1.Answer_3);
                btnA.setText(Question_1_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_1_1.Answer_1);
                btnD.setText(Question_1_1.Answer_2);
                btnA.setText(Question_1_1.Answer_3);
                btnB.setText(Question_1_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_1_1.Answer_1);
                btnA.setText(Question_1_1.Answer_2);
                btnB.setText(Question_1_1.Answer_3);
                btnC.setText(Question_1_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_1_2.Question);
            if (y == 0) {
                btnA.setText(Question_1_2.Answer_1);
                btnB.setText(Question_1_2.Answer_2);
                btnC.setText(Question_1_2.Answer_3);
                btnD.setText(Question_1_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_1_2.Answer_1);
                btnC.setText(Question_1_2.Answer_2);
                btnD.setText(Question_1_2.Answer_3);
                btnA.setText(Question_1_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_1_2.Answer_1);
                btnD.setText(Question_1_2.Answer_2);
                btnA.setText(Question_1_2.Answer_3);
                btnB.setText(Question_1_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_1_2.Answer_1);
                btnA.setText(Question_1_2.Answer_2);
                btnB.setText(Question_1_2.Answer_3);
                btnC.setText(Question_1_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_1_3.Question);
            if (y == 0) {
                btnA.setText(Question_1_3.Answer_1);
                btnB.setText(Question_1_3.Answer_2);
                btnC.setText(Question_1_3.Answer_3);
                btnD.setText(Question_1_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_1_3.Answer_1);
                btnC.setText(Question_1_3.Answer_2);
                btnD.setText(Question_1_3.Answer_3);
                btnA.setText(Question_1_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_1_3.Answer_1);
                btnD.setText(Question_1_3.Answer_2);
                btnA.setText(Question_1_3.Answer_3);
                btnB.setText(Question_1_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_1_3.Answer_1);
                btnA.setText(Question_1_3.Answer_2);
                btnB.setText(Question_1_3.Answer_3);
                btnC.setText(Question_1_3.Answer_4);
            }
        } else if (x == 3) {
            lblQuestion.setText(Question_1_4.Question);
            if (y == 0) {
                btnA.setText(Question_1_4.Answer_1);
                btnB.setText(Question_1_4.Answer_2);
                btnC.setText(Question_1_4.Answer_3);
                btnD.setText(Question_1_4.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_1_4.Answer_1);
                btnC.setText(Question_1_4.Answer_2);
                btnD.setText(Question_1_4.Answer_3);
                btnA.setText(Question_1_4.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_1_4.Answer_1);
                btnD.setText(Question_1_4.Answer_2);
                btnA.setText(Question_1_4.Answer_3);
                btnB.setText(Question_1_4.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_1_4.Answer_1);
                btnA.setText(Question_1_4.Answer_2);
                btnB.setText(Question_1_4.Answer_3);
                btnC.setText(Question_1_4.Answer_4);
            }
        }
    }

    public void loadQuestion_2() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_2_1.Question);
            if (y == 0) {
                btnA.setText(Question_2_1.Answer_1);
                btnB.setText(Question_2_1.Answer_2);
                btnC.setText(Question_2_1.Answer_3);
                btnD.setText(Question_2_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_2_1.Answer_1);
                btnC.setText(Question_2_1.Answer_2);
                btnD.setText(Question_2_1.Answer_3);
                btnA.setText(Question_2_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_2_1.Answer_1);
                btnD.setText(Question_2_1.Answer_2);
                btnA.setText(Question_2_1.Answer_3);
                btnB.setText(Question_2_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_2_1.Answer_1);
                btnA.setText(Question_2_1.Answer_2);
                btnB.setText(Question_2_1.Answer_3);
                btnC.setText(Question_2_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_2_2.Question);
            if (y == 0) {
                btnA.setText(Question_2_2.Answer_1);
                btnB.setText(Question_2_2.Answer_2);
                btnC.setText(Question_2_2.Answer_3);
                btnD.setText(Question_2_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_2_2.Answer_1);
                btnC.setText(Question_2_2.Answer_2);
                btnD.setText(Question_2_2.Answer_3);
                btnA.setText(Question_2_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_2_2.Answer_1);
                btnD.setText(Question_2_2.Answer_2);
                btnA.setText(Question_2_2.Answer_3);
                btnB.setText(Question_2_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_2_2.Answer_1);
                btnA.setText(Question_2_2.Answer_2);
                btnB.setText(Question_2_2.Answer_3);
                btnC.setText(Question_2_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_2_3.Question);
            if (y == 0) {
                btnA.setText(Question_2_3.Answer_1);
                btnB.setText(Question_2_3.Answer_2);
                btnC.setText(Question_2_3.Answer_3);
                btnD.setText(Question_2_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_2_3.Answer_1);
                btnC.setText(Question_2_3.Answer_2);
                btnD.setText(Question_2_3.Answer_3);
                btnA.setText(Question_2_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_2_3.Answer_1);
                btnD.setText(Question_2_3.Answer_2);
                btnA.setText(Question_2_3.Answer_3);
                btnB.setText(Question_2_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_2_3.Answer_1);
                btnA.setText(Question_2_3.Answer_2);
                btnB.setText(Question_2_3.Answer_3);
                btnC.setText(Question_2_3.Answer_4);
            }
        } else if (x == 3) {
            lblQuestion.setText(Question_2_4.Question);
            if (y == 0) {
                btnA.setText(Question_2_4.Answer_1);
                btnB.setText(Question_2_4.Answer_2);
                btnC.setText(Question_2_4.Answer_3);
                btnD.setText(Question_2_4.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_2_4.Answer_1);
                btnC.setText(Question_2_4.Answer_2);
                btnD.setText(Question_2_4.Answer_3);
                btnA.setText(Question_2_4.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_2_4.Answer_1);
                btnD.setText(Question_2_4.Answer_2);
                btnA.setText(Question_2_4.Answer_3);
                btnB.setText(Question_2_4.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_2_4.Answer_1);
                btnA.setText(Question_2_4.Answer_2);
                btnB.setText(Question_2_4.Answer_3);
                btnC.setText(Question_2_4.Answer_4);
            }
        }
    }

    public void loadQuestion_3() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_3_1.Question);
            if (y == 0) {
                btnA.setText(Question_3_1.Answer_1);
                btnB.setText(Question_3_1.Answer_2);
                btnC.setText(Question_3_1.Answer_3);
                btnD.setText(Question_3_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_3_1.Answer_1);
                btnC.setText(Question_3_1.Answer_2);
                btnD.setText(Question_3_1.Answer_3);
                btnA.setText(Question_3_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_3_1.Answer_1);
                btnD.setText(Question_3_1.Answer_2);
                btnA.setText(Question_3_1.Answer_3);
                btnB.setText(Question_3_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_3_1.Answer_1);
                btnA.setText(Question_3_1.Answer_2);
                btnB.setText(Question_3_1.Answer_3);
                btnC.setText(Question_3_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_3_2.Question);
            if (y == 0) {
                btnA.setText(Question_3_2.Answer_1);
                btnB.setText(Question_3_2.Answer_2);
                btnC.setText(Question_3_2.Answer_3);
                btnD.setText(Question_3_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_3_2.Answer_1);
                btnC.setText(Question_3_2.Answer_2);
                btnD.setText(Question_3_2.Answer_3);
                btnA.setText(Question_3_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_3_2.Answer_1);
                btnD.setText(Question_3_2.Answer_2);
                btnA.setText(Question_3_2.Answer_3);
                btnB.setText(Question_3_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_3_2.Answer_1);
                btnA.setText(Question_3_2.Answer_2);
                btnB.setText(Question_3_2.Answer_3);
                btnC.setText(Question_3_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_3_3.Question);
            if (y == 0) {
                btnA.setText(Question_3_3.Answer_1);
                btnB.setText(Question_3_3.Answer_2);
                btnC.setText(Question_3_3.Answer_3);
                btnD.setText(Question_3_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_3_3.Answer_1);
                btnC.setText(Question_3_3.Answer_2);
                btnD.setText(Question_3_3.Answer_3);
                btnA.setText(Question_3_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_3_3.Answer_1);
                btnD.setText(Question_3_3.Answer_2);
                btnA.setText(Question_3_3.Answer_3);
                btnB.setText(Question_3_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_3_3.Answer_1);
                btnA.setText(Question_3_3.Answer_2);
                btnB.setText(Question_3_3.Answer_3);
                btnC.setText(Question_3_3.Answer_4);
            }
        } else if (x == 3) {
             lblQuestion.setText(Question_3_4.Question);
             if (y == 0) {
                 btnA.setText(Question_3_4.Answer_1);
                 btnB.setText(Question_3_4.Answer_2);
                 btnC.setText(Question_3_4.Answer_3);
                 btnD.setText(Question_3_4.Answer_4);
             } else if (y == 1) {
                 btnB.setText(Question_3_4.Answer_1);
                 btnC.setText(Question_3_4.Answer_2);
                 btnD.setText(Question_3_4.Answer_3);
                 btnA.setText(Question_3_4.Answer_4);
             } else if (y == 2) {
                 btnC.setText(Question_3_4.Answer_1);
                 btnD.setText(Question_3_4.Answer_2);
                 btnA.setText(Question_3_4.Answer_3);
                 btnB.setText(Question_3_4.Answer_4);
             } else if (y == 3) {
                 btnD.setText(Question_3_4.Answer_1);
                 btnA.setText(Question_3_4.Answer_2);
                 btnB.setText(Question_3_4.Answer_3);
                 btnC.setText(Question_3_4.Answer_4);
             }
        }
    }

    public void loadQuestion_4() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_4_1.Question);
            if (y == 0) {
                btnA.setText(Question_4_1.Answer_1);
                btnB.setText(Question_4_1.Answer_2);
                btnC.setText(Question_4_1.Answer_3);
                btnD.setText(Question_4_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_4_1.Answer_1);
                btnC.setText(Question_4_1.Answer_2);
                btnD.setText(Question_4_1.Answer_3);
                btnA.setText(Question_4_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_4_1.Answer_1);
                btnD.setText(Question_4_1.Answer_2);
                btnA.setText(Question_4_1.Answer_3);
                btnB.setText(Question_4_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_4_1.Answer_1);
                btnA.setText(Question_4_1.Answer_2);
                btnB.setText(Question_4_1.Answer_3);
                btnC.setText(Question_4_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_4_2.Question);
            if (y == 0) {
                btnA.setText(Question_4_2.Answer_1);
                btnB.setText(Question_4_2.Answer_2);
                btnC.setText(Question_4_2.Answer_3);
                btnD.setText(Question_4_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_4_2.Answer_1);
                btnC.setText(Question_4_2.Answer_2);
                btnD.setText(Question_4_2.Answer_3);
                btnA.setText(Question_4_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_4_2.Answer_1);
                btnD.setText(Question_4_2.Answer_2);
                btnA.setText(Question_4_2.Answer_3);
                btnB.setText(Question_4_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_4_2.Answer_1);
                btnA.setText(Question_4_2.Answer_2);
                btnB.setText(Question_4_2.Answer_3);
                btnC.setText(Question_4_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_4_3.Question);
            if (y == 0) {
                btnA.setText(Question_4_3.Answer_1);
                btnB.setText(Question_4_3.Answer_2);
                btnC.setText(Question_4_3.Answer_3);
                btnD.setText(Question_4_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_4_3.Answer_1);
                btnC.setText(Question_4_3.Answer_2);
                btnD.setText(Question_4_3.Answer_3);
                btnA.setText(Question_4_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_4_3.Answer_1);
                btnD.setText(Question_4_3.Answer_2);
                btnA.setText(Question_4_3.Answer_3);
                btnB.setText(Question_4_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_4_3.Answer_1);
                btnA.setText(Question_4_3.Answer_2);
                btnB.setText(Question_4_3.Answer_3);
                btnC.setText(Question_4_3.Answer_4);
            }
        } else if (x == 3) {
            lblQuestion.setText(Question_4_4.Question);
            if (y == 0) {
                btnA.setText(Question_4_4.Answer_1);
                btnB.setText(Question_4_4.Answer_2);
                btnC.setText(Question_4_4.Answer_3);
                btnD.setText(Question_4_4.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_4_4.Answer_1);
                btnC.setText(Question_4_4.Answer_2);
                btnD.setText(Question_4_4.Answer_3);
                btnA.setText(Question_4_4.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_4_4.Answer_1);
                btnD.setText(Question_4_4.Answer_2);
                btnA.setText(Question_4_4.Answer_3);
                btnB.setText(Question_4_4.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_4_4.Answer_1);
                btnA.setText(Question_4_4.Answer_2);
                btnB.setText(Question_4_4.Answer_3);
                btnC.setText(Question_4_4.Answer_4);
            }
        }
    }

    public void loadQuestion_5() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_5_1.Question);
            if (y == 0) {
                btnA.setText(Question_5_1.Answer_1);
                btnB.setText(Question_5_1.Answer_2);
                btnC.setText(Question_5_1.Answer_3);
                btnD.setText(Question_5_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_5_1.Answer_1);
                btnC.setText(Question_5_1.Answer_2);
                btnD.setText(Question_5_1.Answer_3);
                btnA.setText(Question_5_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_5_1.Answer_1);
                btnD.setText(Question_5_1.Answer_2);
                btnA.setText(Question_5_1.Answer_3);
                btnB.setText(Question_5_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_5_1.Answer_1);
                btnA.setText(Question_5_1.Answer_2);
                btnB.setText(Question_5_1.Answer_3);
                btnC.setText(Question_5_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_5_2.Question);
            if (y == 0) {
                btnA.setText(Question_5_2.Answer_1);
                btnB.setText(Question_5_2.Answer_2);
                btnC.setText(Question_5_2.Answer_3);
                btnD.setText(Question_5_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_5_2.Answer_1);
                btnC.setText(Question_5_2.Answer_2);
                btnD.setText(Question_5_2.Answer_3);
                btnA.setText(Question_5_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_5_2.Answer_1);
                btnD.setText(Question_5_2.Answer_2);
                btnA.setText(Question_5_2.Answer_3);
                btnB.setText(Question_5_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_5_2.Answer_1);
                btnA.setText(Question_5_2.Answer_2);
                btnB.setText(Question_5_2.Answer_3);
                btnC.setText(Question_5_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_5_3.Question);
            if (y == 0) {
                btnA.setText(Question_5_3.Answer_1);
                btnB.setText(Question_5_3.Answer_2);
                btnC.setText(Question_5_3.Answer_3);
                btnD.setText(Question_5_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_5_3.Answer_1);
                btnC.setText(Question_5_3.Answer_2);
                btnD.setText(Question_5_3.Answer_3);
                btnA.setText(Question_5_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_5_3.Answer_1);
                btnD.setText(Question_5_3.Answer_2);
                btnA.setText(Question_5_3.Answer_3);
                btnB.setText(Question_5_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_5_3.Answer_1);
                btnA.setText(Question_5_3.Answer_2);
                btnB.setText(Question_5_3.Answer_3);
                btnC.setText(Question_5_3.Answer_4);
            }
        } else if (x == 3) {
            lblQuestion.setText(Question_5_4.Question);
            if (y == 0) {
                btnA.setText(Question_5_4.Answer_1);
                btnB.setText(Question_5_4.Answer_2);
                btnC.setText(Question_5_4.Answer_3);
                btnD.setText(Question_5_4.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_5_4.Answer_1);
                btnC.setText(Question_5_4.Answer_2);
                btnD.setText(Question_5_4.Answer_3);
                btnA.setText(Question_5_4.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_5_4.Answer_1);
                btnD.setText(Question_5_4.Answer_2);
                btnA.setText(Question_5_4.Answer_3);
                btnB.setText(Question_5_4.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_5_4.Answer_1);
                btnA.setText(Question_5_4.Answer_2);
                btnB.setText(Question_5_4.Answer_3);
                btnC.setText(Question_5_4.Answer_4);
            }
        }
    }

    public void loadQuestion_6() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        int y;
        Random rand = new Random();
        y = rand.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_6_1.Question);
            if (y == 0) {
                btnA.setText(Question_6_1.Answer_1);
                btnB.setText(Question_6_1.Answer_2);
                btnC.setText(Question_6_1.Answer_3);
                btnD.setText(Question_6_1.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_6_1.Answer_1);
                btnC.setText(Question_6_1.Answer_2);
                btnD.setText(Question_6_1.Answer_3);
                btnA.setText(Question_6_1.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_6_1.Answer_1);
                btnD.setText(Question_6_1.Answer_2);
                btnA.setText(Question_6_1.Answer_3);
                btnB.setText(Question_6_1.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_6_1.Answer_1);
                btnA.setText(Question_6_1.Answer_2);
                btnB.setText(Question_6_1.Answer_3);
                btnC.setText(Question_6_1.Answer_4);
            }
        } else if (x == 1) {
            lblQuestion.setText(Question_6_2.Question);
            if (y == 0) {
                btnA.setText(Question_6_2.Answer_1);
                btnB.setText(Question_6_2.Answer_2);
                btnC.setText(Question_6_2.Answer_3);
                btnD.setText(Question_6_2.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_6_2.Answer_1);
                btnC.setText(Question_6_2.Answer_2);
                btnD.setText(Question_6_2.Answer_3);
                btnA.setText(Question_6_2.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_6_2.Answer_1);
                btnD.setText(Question_6_2.Answer_2);
                btnA.setText(Question_6_2.Answer_3);
                btnB.setText(Question_6_2.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_6_2.Answer_1);
                btnA.setText(Question_6_2.Answer_2);
                btnB.setText(Question_6_2.Answer_3);
                btnC.setText(Question_6_2.Answer_4);
            }
        } else if (x == 2) {
            lblQuestion.setText(Question_6_3.Question);
            if (y == 0) {
                btnA.setText(Question_6_3.Answer_1);
                btnB.setText(Question_6_3.Answer_2);
                btnC.setText(Question_6_3.Answer_3);
                btnD.setText(Question_6_3.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_6_3.Answer_1);
                btnC.setText(Question_6_3.Answer_2);
                btnD.setText(Question_6_3.Answer_3);
                btnA.setText(Question_6_3.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_6_3.Answer_1);
                btnD.setText(Question_6_3.Answer_2);
                btnA.setText(Question_6_3.Answer_3);
                btnB.setText(Question_6_3.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_6_3.Answer_1);
                btnA.setText(Question_6_3.Answer_2);
                btnB.setText(Question_6_3.Answer_3);
                btnC.setText(Question_6_3.Answer_4);
            }
        } else if (x == 3) {
            lblQuestion.setText(Question_6_4.Question);
            if (y == 0) {
                btnA.setText(Question_6_4.Answer_1);
                btnB.setText(Question_6_4.Answer_2);
                btnC.setText(Question_6_4.Answer_3);
                btnD.setText(Question_6_4.Answer_4);
            } else if (y == 1) {
                btnB.setText(Question_6_4.Answer_1);
                btnC.setText(Question_6_4.Answer_2);
                btnD.setText(Question_6_4.Answer_3);
                btnA.setText(Question_6_4.Answer_4);
            } else if (y == 2) {
                btnC.setText(Question_6_4.Answer_1);
                btnD.setText(Question_6_4.Answer_2);
                btnA.setText(Question_6_4.Answer_3);
                btnB.setText(Question_6_4.Answer_4);
            } else if (y == 3) {
                btnD.setText(Question_6_4.Answer_1);
                btnA.setText(Question_6_4.Answer_2);
                btnB.setText(Question_6_4.Answer_3);
                btnC.setText(Question_6_4.Answer_4);
            }
        }
    }

    public void onButtonAClick() {
        if (Correct_A()) {
            btnA.setId("btnAnswersCorrect");
            btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
            btnNext.setVisible(true);
        }
        else {
            btnA.setId("btnAnswersWrong");
            btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
        }
        if (Correct_B()) {
            btnB.setId("btnAnswersCorrect");
            btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_C()) {
            btnC.setId("btnAnswersCorrect");
            btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_D()) {
            btnD.setId("btnAnswersCorrect");
            btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        }
        btnB.setDisable(true);
        btnC.setDisable(true);
        btnD.setDisable(true);
    }

    public void onButtonBClick() {
        if (Correct_B()) {
            btnB.setId("btnAnswersCorrect");
            btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
            btnNext.setVisible(true);
        }
        else {
            btnB.setId("btnAnswersWrong");
            btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
        }
        if (Correct_A()) {
            btnA.setId("btnAnswersCorrect");
            btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_C()) {
            btnC.setId("btnAnswersCorrect");
            btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_D()) {
            btnD.setId("btnAnswersCorrect");
            btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        }
        btnA.setDisable(true);
        btnC.setDisable(true);
        btnD.setDisable(true);
    }

    public void onButtonCClick() {
        if (Correct_C()) {
            btnC.setId("btnAnswersCorrect");
            btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
            btnNext.setVisible(true);
        }
        else {
            btnC.setId("btnAnswersWrong");
            btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
        }
        if (Correct_A()) {
            btnA.setId("btnAnswersCorrect");
            btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_B()) {
            btnB.setId("btnAnswersCorrect");
            btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_D()) {
            btnD.setId("btnAnswersCorrect");
            btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        }
        btnA.setDisable(true);
        btnB.setDisable(true);
        btnD.setDisable(true);
    }

    public void onButtonDClick() {
        if (Correct_D()) {
            btnD.setId("btnAnswersCorrect");
            btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
            btnNext.setVisible(true);
        }
        else {
            btnD.setId("btnAnswersWrong");
            btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
            lblAnswerStatus.setText("Wrong");
            btnBack.setVisible(true);
        }
        if (Correct_A()) {
            btnA.setId("btnAnswersCorrect");
            btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_B()) {
            btnB.setId("btnAnswersCorrect");
            btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        } else if (Correct_C()) {
            btnC.setId("btnAnswersCorrect");
            btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        }
        btnA.setDisable(true);
        btnB.setDisable(true);
        btnC.setDisable(true);
    }

    public void onButtonJokerFiftyClick() {
        if (Correct_A()) {
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
        } else if (Correct_B()) {
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
        } else if (Correct_C()) {
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
        } else if (Correct_D()) {
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
        }
        btnJokerFifty.setVisible(false);
    }

    public void onButtonJokerTelephoneClick() {
        if (Correct_A()) {
            int a;
            Random random = new Random();
            a = random.nextInt(11);
            if (a == 0 || a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6) {
                lblJokerTelephone.setText("Ich glaube Antwort A ist richtig!");
            } else if (a == 7) {
                lblJokerTelephone.setText("Ich glaube Antwort B ist richtig!");
            } else if (a == 8) {
                lblJokerTelephone.setText("Ich glaube Antwort C ist richtig!");
            } else if (a == 9) {
                lblJokerTelephone.setText("Ich glaube Antwort D ist richtig!");
            }
        } else if (Correct_B()) {
            int b;
            Random random = new Random();
            b = random.nextInt(11);
            if (b == 0 || b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6) {
                lblJokerTelephone.setText("Ich glaube Antwort B ist richtig!");
            } else if (b == 7) {
                lblJokerTelephone.setText("Ich glaube Antwort A ist richtig!");
            } else if (b == 8) {
                lblJokerTelephone.setText("Ich glaube Antwort C ist richtig!");
            } else if (b == 9) {
                lblJokerTelephone.setText("Ich glaube Antwort D ist richtig!");
            }
        } else if (Correct_C()) {
            int c;
            Random random = new Random();
            c = random.nextInt(11);
            if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5 || c == 6) {
                lblJokerTelephone.setText("Ich glaube Antwort C ist richtig!");
            } else if (c == 7) {
                lblJokerTelephone.setText("Ich glaube Antwort A ist richtig!");
            } else if (c == 8) {
                lblJokerTelephone.setText("Ich glaube Antwort B ist richtig!");
            } else if (c == 9) {
                lblJokerTelephone.setText("Ich glaube Antwort D ist richtig!");
            }
        } else if (Correct_D()) {
            int d;
            Random random = new Random();
            d = random.nextInt(11);
            if (d == 0 || d == 1 || d == 2 || d == 3 || d == 4 || d == 5 || d == 6) {
                lblJokerTelephone.setText("Ich glaube Antwort D ist richtig!");
            } else if (d == 7) {
                lblJokerTelephone.setText("Ich glaube Antwort A ist richtig!");
            } else if (d == 8) {
                lblJokerTelephone.setText("Ich glaube Antwort B ist richtig!");
            } else if (d == 9) {
                lblJokerTelephone.setText("Ich glaube Antwort C ist richtig!");
            }
        }
        btnJokerTelephone.setVisible(false);
    }

    public void onButtonJokerAudienceClick() {
        apnAudience.setVisible(true);
        pbrAudienceA.setVisible(true);
        pbrAudienceB.setVisible(true);
        pbrAudienceC.setVisible(true);
        pbrAudienceD.setVisible(true);
        if (Correct_A()) {
            int a;
            Random random = new Random();
            a = random.nextInt(4);
            if (a == 0) {
                pbrAudienceA.setProgress(0.6);
                lblAudienceA.setText("60%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceB.setText("10%");
                pbrAudienceC.setProgress(0.2);
                lblAudienceC.setText("20%");
                pbrAudienceD.setProgress(0.1);
                lblAudienceD.setText("10%");
            } else if (a == 1) {
                pbrAudienceA.setProgress(0.3);
                lblAudienceA.setText("30%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceB.setText("10%");
                pbrAudienceC.setProgress(0.4);
                lblAudienceC.setText("40%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            } else if (a == 2) {
                pbrAudienceA.setProgress(0.4);
                lblAudienceA.setText("40%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceB.setText("10%");
                pbrAudienceC.setProgress(0.3);
                lblAudienceC.setText("30%");
                pbrAudienceD.setProgress(0.2);
                lblAudienceD.setText("20%");
            } else if (a == 3) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceC.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            }
        } else if (Correct_B()) {
            int b;
            Random random = new Random();
            b = random.nextInt(4);
            if (b == 0) {
                pbrAudienceA.setProgress(0.1);
                lblAudienceA.setText("10%");
                pbrAudienceB.setProgress(0.6);
                lblAudienceB.setText("60%");
                pbrAudienceC.setProgress(0.2);
                lblAudienceC.setText("20%");
                pbrAudienceD.setProgress(0.1);
                lblAudienceD.setText("10%");
            } else if (b == 1) {
                pbrAudienceA.setProgress(0.3);
                lblAudienceA.setText("30%");
                pbrAudienceB.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceC.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            } else if (b == 2) {
                pbrAudienceA.setProgress(0.4);
                lblAudienceA.setText("40%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceB.setText("10%");
                pbrAudienceC.setProgress(0.3);
                lblAudienceC.setText("30%");
                pbrAudienceD.setProgress(0.2);
                lblAudienceD.setText("20%");
            } else if (b == 3) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceC.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            }
        } else if (Correct_C()) {
            int c;
            Random random = new Random();
            c = random.nextInt(4);
            if (c == 0) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.6);
                lblAudienceB.setText("60%");
                pbrAudienceD.setProgress(0.1);
                lblAudienceC.setText("10%");
            } else if (c == 1) {
                pbrAudienceA.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            } else if (c == 2) {
                pbrAudienceA.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceD.setProgress(0.2);
                lblAudienceA.setText("20%");
            } else if (c == 3) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceC.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceD.setProgress(0.1);
                lblAudienceC.setText("10%");
            }
        } else if (Correct_D()) {
            int d;
            Random random = new Random();
            d = random.nextInt(4);
            if (d == 0) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceD.setProgress(0.6);
                lblAudienceB.setText("60%");
            } else if (d == 1) {
                pbrAudienceA.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.4);
                lblAudienceB.setText("40%");
                pbrAudienceD.setProgress(0.3);
                lblAudienceD.setText("30%");
            } else if (d == 2) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceC.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceD.setProgress(0.4);
                lblAudienceB.setText("40%");
            } else if (d == 3) {
                pbrAudienceA.setProgress(0.2);
                lblAudienceA.setText("20%");
                pbrAudienceB.setProgress(0.3);
                lblAudienceD.setText("30%");
                pbrAudienceC.setProgress(0.1);
                lblAudienceC.setText("10%");
                pbrAudienceD.setProgress(0.4);
                lblAudienceB.setText("40%");
            }
        }
        PauseTransition pauseTransition = new PauseTransition(Duration.seconds(2));
        pauseTransition.setOnFinished(e -> {
            apnAudience.setVisible(false);
        });
        pauseTransition.play();
        btnJokerAudience.setVisible(false);
    }

    public void onButtonNextClick() {
        btnA.setVisible(true);
        btnB.setVisible(true);
        btnC.setVisible(true);
        btnD.setVisible(true);
        btnA.setDisable(false);
        btnB.setDisable(false);
        btnC.setDisable(false);
        btnD.setDisable(false);
        btnA.setId("btnAnswers");
        btnA.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnB.setId("btnAnswers");
        btnB.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnC.setId("btnAnswers");
        btnC.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        btnD.setId("btnAnswers");
        btnD.getStylesheets().add(getClass().getResource("ButtonStyles.css").toExternalForm());
        if (!lblJokerTelephone.getText().equals("")) {
            lblJokerTelephone.setVisible(false);
        }
        if (lblQuestion.getText().equals(Question_1_1.Question) || lblQuestion.getText().equals(Question_1_2.Question) || lblQuestion.getText().equals(Question_1_3.Question) || lblQuestion.getText().equals(Question_1_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_2();
        } else if (lblQuestion.getText().equals(Question_2_1.Question) || lblQuestion.getText().equals(Question_2_2.Question) || lblQuestion.getText().equals(Question_2_3.Question) || lblQuestion.getText().equals(Question_2_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_3();
        } else if (lblQuestion.getText().equals(Question_3_1.Question) || lblQuestion.getText().equals(Question_3_2.Question) || lblQuestion.getText().equals(Question_3_3.Question) || lblQuestion.getText().equals(Question_3_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_4();
        } else if (lblQuestion.getText().equals(Question_4_1.Question) || lblQuestion.getText().equals(Question_4_2.Question) || lblQuestion.getText().equals(Question_4_3.Question) || lblQuestion.getText().equals(Question_4_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_5();
        } else if (lblQuestion.getText().equals(Question_5_1.Question) || lblQuestion.getText().equals(Question_5_2.Question) || lblQuestion.getText().equals(Question_5_3.Question) || lblQuestion.getText().equals(Question_5_4.Question)) {
            btnBack.setVisible(false);
            btnNext.setVisible(false);
            lblAnswerStatus.setText("Select one answer");
            loadQuestion_6();
        } else if (lblQuestion.getText().equals(Question_6_1.Question) || lblQuestion.getText().equals(Question_6_2.Question) || lblQuestion.getText().equals(Question_6_3.Question) || lblQuestion.getText().equals(Question_6_4.Question)) {
            openMenu();
        }
    }

    public void onButtonBackClick() {
        openMenu();
    }

    public void openMenu() {
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
}