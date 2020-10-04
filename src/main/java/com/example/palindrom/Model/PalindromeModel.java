package com.example.palindrom.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PalindromeModel {
    @Id
    @GeneratedValue
    private int id;
    private String palindromeString;

    public PalindromeModel(){}
    public PalindromeModel(String palindromeString){
        this.palindromeString = palindromeString;

    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getPalindromeString() {
        return palindromeString;
    }

    public void setPalindromeString(String palindromeString) {
        this.palindromeString = palindromeString;
    }
}

