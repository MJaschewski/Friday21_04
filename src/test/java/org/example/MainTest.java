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
        String sSmallWithNumbers = "1234asdf";
        String sBigWithNumbers = "1234ASDF";

        String sNone = "12345678";
        //when
        boolean actRight = Main.stringHasBigAndSmallLetters(sRight);
        boolean actRight2 = Main.stringHasBigAndSmallLetters(sRight2);
        boolean actSmall = Main.stringHasBigAndSmallLetters(sSmall);
        boolean actBig = Main.stringHasBigAndSmallLetters(sBig);

        boolean actRightWithNumbers = Main.stringHasBigAndSmallLetters(sRightWithNumbers);
        boolean actSmallWithNumbers = Main.stringHasBigAndSmallLetters(sSmallWithNumbers);
        boolean actBigWithNumbers = Main.stringHasBigAndSmallLetters(sBigWithNumbers);
        boolean actNone = Main.stringHasBigAndSmallLetters(sNone);
        //then
        assertTrue(actRight);
        assertTrue(actRight2);
        assertTrue(actRightWithNumbers);
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
        String sRight = "pass1234";
        String sGood = "pass1234Longer";
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

        assertTrue(actMix);
        assertTrue(actMix2);

        assertTrue(actNumbers);
        assertTrue(actNumbers2);

        assertFalse(actNone);

     }
}