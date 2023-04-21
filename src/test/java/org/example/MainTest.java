package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
     @Test
     void stringHasGoodLength (){
         //given
         String sWrong = "asdf";
         String sGood = "password";
         String sLonger = "asdfghjkqwert";
         //when
         boolean actWrong = Main.stringHasGoodLength(sWrong);
         boolean actGood = Main.stringHasGoodLength(sGood);
         boolean actLonger= Main.stringHasGoodLength(sLonger);
         //then
         assertFalse(actWrong);
         assertTrue(actGood);
         assertTrue(actLonger);

     }

    @Test
    void stringHasNumbers (){
        //given
        String sWrong = "password";
        String sGood = "asdf1234";
        String sGood2 = "1234asdf";
        String sOnly = "12345678";
        String sMix = "1a2s3d4f";
        //when
        boolean actWrong = Main.stringHasNumbers(sWrong);
        boolean actGood = Main.stringHasNumbers(sGood);
        boolean actGood2 = Main.stringHasNumbers(sGood2);
        boolean actOnly = Main.stringHasNumbers(sOnly);
        boolean actMix = Main.stringHasNumbers(sMix);
        //then
        assertFalse(actWrong);
        assertTrue(actGood);
        assertTrue(actGood2);
        assertTrue(actOnly);
        assertTrue(actMix);

    }

    @Test
    void stringHasSmallLetters () {
         //given
        String sSmall = "password";
        String sBig = "PASSWORD";
        String sMix = "PaSsWoRd";
        String sMix2 = "pAsSwOrD";
        String sNone = "12345678";
        //when
        boolean actSmall = Main.stringHasSmallLetters(sSmall);
        boolean actBig = Main.stringHasSmallLetters(sBig);
        boolean actMix = Main.stringHasSmallLetters(sMix);
        boolean actMix2 = Main.stringHasSmallLetters(sMix2);
        boolean actNone = Main.stringHasSmallLetters(sNone);
        //then
        assertTrue(actSmall);
        assertTrue(actMix);
        assertTrue(actMix2);
        assertFalse(actBig);
        assertFalse(actNone);
    }

    @Test
    void stringHasBigLetters () {
        //given
        String sSmall = "password";
        String sBig = "PASSWORD";
        String sMix = "PASSword";
        String sNone = "12345678";
        //when
        boolean actSmall = Main.stringHasBigLetters(sSmall);
        boolean actBig = Main.stringHasBigLetters(sBig);
        boolean actMix = Main.stringHasBigLetters(sMix);
        boolean actNone = Main.stringHasBigLetters(sNone);
        //then
        assertFalse(actSmall);
        assertTrue(actMix);
        assertTrue(actBig);
        assertFalse(actNone);
    }
    @Test
    void stringHasSmallAndBigLetters () {
         //given
        String sRight = "PaSsWoRd";
        String sRight2 = "pAsSwOrD";
        String sSmall = "password";
        String sBig = "PASSWORD";

        String sRightWithNumbers = "1A2b3c4D";
        String sRightWithNumbers2 = "a1A2b3c4D";
        String sSmallWithNumbers = "1234asdf";
        String sBigWithNumbers = "1234ASDF";

        String sNone = "12345678";
        //when
        boolean actRight = Main.stringHasBigAndSmallLetters(sRight);
        boolean actRight2 = Main.stringHasBigAndSmallLetters(sRight2);
        boolean actSmall = Main.stringHasBigAndSmallLetters(sSmall);
        boolean actBig = Main.stringHasBigAndSmallLetters(sBig);

        boolean actRightWithNumbers = Main.stringHasBigAndSmallLetters(sRightWithNumbers);
        boolean actRightWithNumbers2 = Main.stringHasBigAndSmallLetters(sRightWithNumbers2);
        boolean actSmallWithNumbers = Main.stringHasBigAndSmallLetters(sSmallWithNumbers);
        boolean actBigWithNumbers = Main.stringHasBigAndSmallLetters(sBigWithNumbers);
        boolean actNone = Main.stringHasBigAndSmallLetters(sNone);
        //then
        assertTrue(actRight);
        assertTrue(actRight2);
        assertTrue(actRightWithNumbers);
        assertTrue(actRightWithNumbers2);
        assertFalse(actSmall);
        assertFalse(actBig);
        assertFalse(actSmallWithNumbers);
        assertFalse(actBigWithNumbers);
        assertFalse(actNone);
    }
    //Final Method
    @Test
    void stringIsGoodPassword_goodLength() {
         //given
        String sBad = "four";
        String sRight = "Pass1585";
        String sGood = "pas1690Longer";
        //when
        boolean actBad = Main.stringIsGoodPassword(sBad);
        boolean actRight = Main.stringIsGoodPassword(sRight);
        boolean actGood = Main.stringIsGoodPassword(sGood);
        //then
        assertFalse(actBad);
        assertTrue(actRight);
        assertTrue(actGood);

    }

    @Test
    void stringHasNoEasyPattern(){
         //given
        String sPassword = "Password";
        String sOneTwoTree = "123";
        String sFourFive = "456";
        String sSevenEight = "789";

        String sGood = "w1abhu79";

        //when
        boolean actPW = Main.stringHasNoEasyPattern(sPassword);
        boolean act123 = Main.stringHasNoEasyPattern(sOneTwoTree);
        boolean act456 = Main.stringHasNoEasyPattern(sFourFive);
        boolean act789 = Main.stringHasNoEasyPattern(sSevenEight);
        boolean actGood = Main.stringHasNoEasyPattern(sGood);

        //then
        assertFalse(actPW);
        assertFalse(act123);
        assertFalse(act456);
        assertFalse(act789);
        assertTrue(actGood);

    }
    @Test
    void stringIsGoodPassword_GoodLetters() {
         //given
        String sSmall = "password";
        String sBig = "PASSWORD";

        String sMix = "pAsSwOrD";
        String sMix2 = "PaSsWoRd";

        String sNumbers = "1q2W3e4R";
        String sNumbers2 = "q1W2e3R4";

        String sNone = "12345678";
        //when
        boolean actSmall = Main.stringIsGoodPassword(sSmall);
        boolean actBig = Main.stringIsGoodPassword(sBig);

        boolean actMix = Main.stringIsGoodPassword(sMix);
        boolean actMix2 = Main.stringIsGoodPassword(sMix2);

        boolean actNumbers = Main.stringIsGoodPassword(sNumbers);
        boolean actNumbers2 = Main.stringIsGoodPassword(sNumbers2);

        boolean actNone = Main.stringIsGoodPassword(sNone);
        //then
        assertFalse(actSmall);
        assertFalse(actBig);

        assertFalse(actMix);
        assertFalse(actMix2);

        assertTrue(actNumbers);
        assertTrue(actNumbers2);

        assertFalse(actNone);

     }
    @Test
    void EasyPasswordListTest () {
        //given
        String[] sEasyPW = {"123456"
                ,"123456789"
                ,"12345"
                ,"qwerty"
                ,"password"
                ,"12345678"
                ,"111111"
                ,"123123"
                ,"1234567890"
                ,"1234567"
                ,"qwerty123"
                ,"000000"
                ,"1q2w3e"
                ,"aa12345678"
                ,"abc123"
                ,"password1"
                ,"1234"
                ,"qwertyuiop"
                ,"123321"
                ,"password123"};
        //when
        int nPattern = sEasyPW.length;
        boolean[] actual = new boolean[nPattern];
        for (int i = 0; i < nPattern; i++) {
            actual[i] = Main.stringIsGoodPassword(sEasyPW[i]);
        }
        //then
        for (int i = 0; i < nPattern; i++) {
            assertFalse(actual[i]);
        }

    }
}