package com.example.demo3;

import java.io.Serializable;

public class UserSettings implements Serializable {

    String Username;
    String Password;

    public UserSettings(String username, String password) {
        Username = username;
        Password = password;
    }
}
