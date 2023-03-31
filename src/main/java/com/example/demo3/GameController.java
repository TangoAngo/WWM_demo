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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadQuestion_1();
        if (SettingsController.Joker == false) {
            btnJokerFifty.setVisible(false);
            btnJokerTelephone.setVisible(false);
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


    public void loadQuestion_1() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_1_1.Question);
            btnA.setText(Question_1_1.Answer_1);
            btnB.setText(Question_1_1.Answer_2);
            btnC.setText(Question_1_1.Answer_3);
            btnD.setText(Question_1_1.Answer_4);
        } else if (x == 1) {
            lblQuestion.setText(Question_1_2.Question);
            btnA.setText(Question_1_2.Answer_1);
            btnB.setText(Question_1_2.Answer_2);
            btnC.setText(Question_1_2.Answer_3);
            btnD.setText(Question_1_2.Answer_4);
        } else if (x == 2) {
            lblQuestion.setText(Question_1_3.Question);
            btnA.setText(Question_1_3.Answer_1);
            btnB.setText(Question_1_3.Answer_2);
            btnC.setText(Question_1_3.Answer_3);
            btnD.setText(Question_1_3.Answer_4);
        } else if (x == 3) {
            lblQuestion.setText(Question_1_4.Question);
            btnA.setText(Question_1_4.Answer_1);
            btnB.setText(Question_1_4.Answer_2);
            btnC.setText(Question_1_4.Answer_3);
            btnD.setText(Question_1_4.Answer_4);
        }
    }

    public void loadQuestion_2() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_2_1.Question);
            btnA.setText(Question_2_1.Answer_1);
            btnB.setText(Question_2_1.Answer_2);
            btnC.setText(Question_2_1.Answer_3);
            btnD.setText(Question_2_1.Answer_4);
        } else if (x == 1) {
            lblQuestion.setText(Question_2_2.Question);
            btnA.setText(Question_2_2.Answer_1);
            btnB.setText(Question_2_2.Answer_2);
            btnC.setText(Question_2_2.Answer_3);
            btnD.setText(Question_2_2.Answer_4);
        } else if (x == 2) {
            lblQuestion.setText(Question_2_3.Question);
            btnA.setText(Question_2_3.Answer_1);
            btnB.setText(Question_2_3.Answer_2);
            btnC.setText(Question_2_3.Answer_3);
            btnD.setText(Question_2_3.Answer_4);
        } else if (x == 3) {
            lblQuestion.setText(Question_2_4.Question);
            btnA.setText(Question_2_4.Answer_1);
            btnB.setText(Question_2_4.Answer_2);
            btnC.setText(Question_2_4.Answer_3);
            btnD.setText(Question_2_4.Answer_4);
        }
    }

    public void loadQuestion_3() {
        int x;
        Random random = new Random();
        x = random.nextInt(4);
        if (x == 0) {
            lblQuestion.setText(Question_3_1.Question);
            btnA.setText(Question_3_1.Answer_1);
            btnB.setText(Question_3_1.Answer_2);
            btnC.setText(Question_3_1.Answer_3);
            btnD.setText(Question_3_1.Answer_4);
        } else if (x == 1) {
            lblQuestion.setText(Question_3_2.Question);
            btnA.setText(Question_3_2.Answer_1);
            btnB.setText(Question_3_2.Answer_2);
            btnC.setText(Question_3_2.Answer_3);
            btnD.setText(Question_3_2.Answer_4);
        } else if (x == 2) {
            lblQuestion.setText(Question_3_3.Question);
            btnA.setText(Question_3_3.Answer_1);
            btnB.setText(Question_3_3.Answer_2);
            btnC.setText(Question_3_3.Answer_3);
            btnD.setText(Question_3_3.Answer_4);
        } else if (x == 3) {
            lblQuestion.setText(Question_3_4.Question);
            btnA.setText(Question_3_4.Answer_1);
            btnB.setText(Question_3_4.Answer_2);
            btnC.setText(Question_3_4.Answer_3);
            btnD.setText(Question_3_4.Answer_4);
        }
    }

    public void onButtonAClick() {
        if (lblQuestion.getText().equals(Question_1_1.Question) || lblQuestion.getText().equals(Question_1_4.Question) || lblQuestion.getText().equals(Question_2_2.Question) || lblQuestion.getText().equals(Question_3_3.Question)) {
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
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
        if (lblQuestion.getText().equals(Question_2_1.Question) || lblQuestion.getText().equals(Question_1_3.Question)) {
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
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
        if (lblQuestion.getText().equals(Question_1_2.Question) || lblQuestion.getText().equals(Question_3_1.Question) || lblQuestion.getText().equals(Question_3_2.Question) || lblQuestion.getText().equals(Question_3_4.Question)) {
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
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
        if (lblQuestion.getText().equals(Question_2_3.Question) || lblQuestion.getText().equals(Question_2_4.Question)) {
            lblAnswerStatus.setText("Correct");
            Score ++;
            lblScore.setText("Score: " + Score);
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

    public void onButtonJokerFiftyClick() {
        if (lblQuestion.getText().equals(Question_1_1.Question) || lblQuestion.getText().equals(Question_1_4.Question) || lblQuestion.getText().equals(Question_2_2.Question) || lblQuestion.getText().equals(Question_3_3.Question)) {
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
        } else if (lblQuestion.getText().equals(Question_2_1.Question) || lblQuestion.getText().equals(Question_1_3.Question)) {
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
        } else if (lblQuestion.getText().equals(Question_1_2.Question) || lblQuestion.getText().equals(Question_3_1.Question) || lblQuestion.getText().equals(Question_3_2.Question) || lblQuestion.getText().equals(Question_3_4.Question)) {
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
        } else if (lblQuestion.getText().equals(Question_2_3.Question) || lblQuestion.getText().equals(Question_2_4.Question)) {
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
        if (lblQuestion.getText().equals(Question_1_1.Question) || lblQuestion.getText().equals(Question_1_4.Question) || lblQuestion.getText().equals(Question_2_2.Question) || lblQuestion.getText().equals(Question_3_3.Question)) {
            int a;
            Random random = new Random();
            a = random.nextInt(11);
            if (a == 0 || a == 1 || a == 2 || a == 3 || a == 4 || a == 5 || a == 6) {
                lblJokerTelephone.setText("A");
            } else if (a == 7) {
                lblJokerTelephone.setText("B");
            } else if (a == 8) {
                lblJokerTelephone.setText("C");
            } else if (a == 9) {
                lblJokerTelephone.setText("D");
            }
        } else if (lblQuestion.getText().equals(Question_2_1.Question) || lblQuestion.getText().equals(Question_1_3.Question)) {
            int b;
            Random random = new Random();
            b = random.nextInt(11);
            if (b == 0 || b == 1 || b == 2 || b == 3 || b == 4 || b == 5 || b == 6) {
                lblJokerTelephone.setText("B");
            } else if (b == 7) {
                lblJokerTelephone.setText("A");
            } else if (b == 8) {
                lblJokerTelephone.setText("C");
            } else if (b == 9) {
                lblJokerTelephone.setText("D");
            }
        } else if (lblQuestion.getText().equals(Question_1_2.Question) || lblQuestion.getText().equals(Question_3_1.Question) || lblQuestion.getText().equals(Question_3_2.Question) || lblQuestion.getText().equals(Question_3_4.Question)) {
            int c;
            Random random = new Random();
            c = random.nextInt(11);
            if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5 || c == 6) {
                lblJokerTelephone.setText("C");
            } else if (c == 7) {
                lblJokerTelephone.setText("A");
            } else if (c == 8) {
                lblJokerTelephone.setText("B");
            } else if (c == 9) {
                lblJokerTelephone.setText("D");
            }
        } else if (lblQuestion.getText().equals(Question_2_3.Question) || lblQuestion.getText().equals(Question_2_4.Question)) {
            int d;
            Random random = new Random();
            d = random.nextInt(11);
            if (d == 0 || d == 1 || d == 2 || d == 3 || d == 4 || d == 5 || d == 6) {
                lblJokerTelephone.setText("D");
            } else if (d == 7) {
                lblJokerTelephone.setText("A");
            } else if (d == 8) {
                lblJokerTelephone.setText("B");
            } else if (d == 9) {
                lblJokerTelephone.setText("C");
            }
        }
        btnJokerTelephone.setVisible(false);
    }

    public void onButtonNextClick() {
        btnA.setVisible(true);
        btnB.setVisible(true);
        btnC.setVisible(true);
        btnD.setVisible(true);
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
        stageTheButtonBelongs.setTitle("Menu");
        stageTheButtonBelongs.setScene(MenuScene);
        stageTheButtonBelongs.show();
    }
}
