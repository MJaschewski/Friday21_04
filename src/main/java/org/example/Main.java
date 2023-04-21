package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        String sPassword8 = "asdfghjk";

    }

    public static boolean stringHasGoodLength(String sPassword){
        if (sPassword.length() < 8){
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean stringHasNumbers(String sPassword){
        if(sPassword.matches("(.*)[1-9](.*)")){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean stringHasSmallLetters(String sPassword){
        if(sPassword.matches("(.*)[a-z](.*)")){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean stringHasBigLetters(String sPassword){
        if(sPassword.matches("(.*)[A-Z](.*)")){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean stringHasBigAndSmallLetters (String sPassword){
        if (stringHasBigLetters(sPassword) && stringHasSmallLetters(sPassword)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean stringIsGoodPassword (String sPassword){
        if(!stringHasGoodLength(sPassword)) {
            return false;
        } else if (!stringHasNumbers(sPassword)) {
            return false;
        } else if (!stringHasBigAndSmallLetters(sPassword)) {
            return false;
        } else {
            return true;
        }
    }

}