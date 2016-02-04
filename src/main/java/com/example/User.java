package com.example;

import javax.print.DocFlavor;

/**
 * Created by mark on 16-2-4.
 */
public class User {
    private String name;
    private String gender;

    public User() {

    }

    public User(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
