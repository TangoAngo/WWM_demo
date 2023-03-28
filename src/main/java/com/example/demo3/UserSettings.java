package com.example.demo3;

import java.io.Serializable;

public class UserSettings implements Serializable {

    String Username;
    String Password;
    Integer TopScore;

    public UserSettings(String username, String password, Integer topscore) {
        Username = username;
        Password = password;
        TopScore = topscore;
    }
}
