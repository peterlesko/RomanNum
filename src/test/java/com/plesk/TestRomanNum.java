package com.plesk;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRomanNum {
    RomanNum romanNum;
    String[] units;
    String[] tens;
    String[] hundreds;
    String[] thousands;

    @BeforeEach
    void init() {
        romanNum = new RomanNum();
        units = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        tens = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        hundreds = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        thousands = new String[]{"M", "MM", "MMM", "MMMM"};
    }

    @Ignore
    @Test
    @DisplayName("Testing conversion of all numbers from 10 to 99")
    void testConvertAllNoToRomanNumeral() {
        //assertEquals("XVII", romanNum.calculate_10to99(17));
//        assertEquals("I", romanNum.calculate(1));
//        assertEquals("VI", romanNum.calculate(6));
//        assertEquals("XVII", romanNum.calculate(17));
//        assertEquals("L", romanNum.calculate(50));
//        assertEquals("LX", romanNum.calculate(60));
//        assertEquals("LXXXII", romanNum.calculate(82));
//        assertEquals("CLXXIX", romanNum.calculate(179));
//        assertEquals("MMDCCXXXV", romanNum.calculate(2735));
    }

    @Test
    @DisplayName("Testing conversion from 1 to 9")
    void testConvertToNumerals_1to9() {
//        assertEquals("I", romanNum.calculate(1));
//        assertEquals("I", romanNum.calculate(1));
//        assertEquals("II", romanNum.calculate(2));
//        assertEquals("III", romanNum.calculate(3));
        for (int i = 1; i <= 9; i++) {
            assertEquals(units[i - 1], romanNum.calculate(i), "Number to Roman numerals is converted incorrectly");
        }
    }

    @Test
    @DisplayName("Testing conversion of 10 based numbers from 10 to 90")
    void testConvertToRomanNumeral_10to90() {
//        assertEquals("X", romanNum.calculate(10));
//        assertEquals("L", romanNum.calculate(50));
//        assertEquals("LXX", romanNum.calculate(70));
//        assertEquals("XC", romanNum.calculate(90));
        int countTens = 10;
        for (int i = 1; i <= 9; i++) {
            for(int y = 0; y <= 9; y++){
                System.out.println(countTens + y);
                assertEquals(tens[i - 1], romanNum.calculate(countTens + y), "Number to Roman numerals is converted incorrectly");
            }
            countTens += 10;
        }
    }

    @Test
    @DisplayName("Testing conversion of hundred based numbers from 100 to 900")
    void testConvertToRomanNumeral_100to900() {
//        assertEquals("C", romanNum.calculate(100));
//        assertEquals("CD", romanNum.calculate(400));
//        assertEquals("DCCC", romanNum.calculate(800));
//        assertEquals("CM", romanNum.calculate(900));
        int count = 100;
        for (int i = 1; i <= 9; i++) {
            assertEquals(hundreds[i - 1], romanNum.calculate(count), "Number to Roman numerals is converted incorrectly");
            count += 100;
        }
    }

    @Test
    @DisplayName("Testing conversion of thousand based numbers from 1000 to 4000")
    void testConvertToRomanNumeral_1000to4000() {
//        assertEquals("M", romanNum.calculate(1000));
//        assertEquals("MM", romanNum.calculate(2000));
//        assertEquals("MMM", romanNum.calculate(3000));
//        assertEquals("MMMM", romanNum.calculate(4000));
        int count = 1000;
        for (int i = 1; i <= 3; i++) {
            assertEquals(thousands[i - 1], romanNum.calculate(count), "Number to Roman numerals is converted incorrectly");
            count += 1000;
        }
    }
}


/*
    Given a positive integer number (eg 42) determine
    its Roman numeral representation as a String (eg "XLII").

        You cannot write numerals like IM for 999.
        Wikipedia states "Modern Roman numerals are written by
        expressing each arabic digit separately, starting with the
        leftmost digit, and skipping any digit with a value of zero."
        For example:

        1990 -> "MCMXC"  (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
        2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
        99 -> "XCIX"   (90 -> "XC" + 9 -> "IX")
        47 -> "XLVII"  (40 -> "XL" + 7 -> "VII")

        The 'digits' are as follows:

        1 ->    "I" | 10 ->    "X" | 100 ->    "C" | 1000 ->    "M"
        2 ->   "II" | 20 ->   "XX" | 200 ->   "CC" | 2000 ->   "MM"
        3 ->  "III" | 30 ->  "XXX" | 300 ->  "CCC" | 3000 ->  "MMM"
        4 ->   "IV" | 40 ->   "XL" | 400 ->   "CD" | 4000 -> "MMMM"
        5 ->    "V" | 50 ->    "L" | 500 ->    "D" |
        6 ->   "VI" | 60 ->   "LX" | 600 ->   "DC" |
        7 ->  "VII" | 70 ->  "LXX" | 700 ->  "DCC" |
        8 -> "VIII" | 80 -> "LXXX" | 800 -> "DCCC" |
        9 ->   "IX" | 90 ->   "XC" | 900 ->   "CM" |
*/
