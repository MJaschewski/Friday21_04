package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String sCurrent = "";
        Scanner scan = new Scanner(System.in);
        while (!sCurrent.contains("quit")) {
            System.out.println("Enter the next word. Enter 'quit' to quit.");
            sCurrent = scan.nextLine();
            if(!sCurrent.contains("quit")){
                System.out.println(stringIsGoodPassword(sCurrent));
            }
        }

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
    public static boolean stringHasNoEasyPattern(String sPassword){
        String[] sPattern = {"Password","123","456","789","qwert","rtzu","asd","abc","1q2w","4r5t"};
        for (int i = 0; i < 10; i++) {
            if(sPassword.matches("(.*)"+ i + i + i + i +"(.*)")){
                return false;
            }
        }
        for (int i = 0; i < sPattern.length; i++) {
            if (sPassword.matches("(.*)" + sPattern[i]+"(.*)")){
                return false;
            }

        }
        return true;
    }

    public static boolean stringIsGoodPassword (String sPassword){
        if(!stringHasGoodLength(sPassword)) {
            System.out.println("Password is to small. Please enter a password with 8 or more digits");
            return false;
        } else if (!stringHasNumbers(sPassword)) {
            System.out.println("Password has to include numbers");
            return false;
        } else if (!stringHasBigAndSmallLetters(sPassword)) {
            System.out.println("Password has to include small and big letters");
            return false;
        } else if (!stringHasNoEasyPattern(sPassword)) {
            System.out.println("Password has to exclude easy patterns");
            return false;
        } else {
            return true;
        }
    }

}