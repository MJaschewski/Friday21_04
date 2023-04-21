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

}