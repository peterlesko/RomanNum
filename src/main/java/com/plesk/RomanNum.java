package com.plesk;

import java.util.Stack;

public class RomanNum {
    String[] units = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] thousands = new String[]{"M", "MM", "MMM", "MMMM"};

    public String calculate(int numberIn) {
        Stack<Integer> romanNumeralsStack = new Stack();
        String romanNumeral = "";
        int temp;
        int count = 1;

        while (numberIn > 0) {
            temp = numberIn % 10;
            //System.out.println(temp);
            romanNumeralsStack.push(temp * count);
            numberIn = numberIn / 10;
            count *= 10;
        }

        while (!romanNumeralsStack.empty()) {
            int temp2 = romanNumeralsStack.pop();
            //System.out.println(temp2);
            romanNumeral += calculateRomanNumeral(temp2);
        }

        System.out.println(romanNumeral);

        return romanNumeral;
    }

    public String calculateRomanNumeral(int number) {

        if (number > 0 && number <= 9) {
            return units[number - 1];

        } else if (number >= 10 && number <= 90) {
            return tens[(number / 10) - 1];

        } else if (number >= 100 && number <= 900) {
            return hundreds[(number / 100) - 1];

        } else if (number >= 1000 && number <= 4000) {
            return thousands[(number / 1000) - 1];
        }
        return "";
    }
}


//    public String calculate_10to99(int numberIn) {
//        Stack romanNumeralsStack = new Stack();
//        String romanNumeral = "";
//
//        while (numberIn > 0) {
//            System.out.println("8>>>>numberIn % 10:   " + numberIn % 10);
//            romanNumeralsStack.push(numberIn % 10);
//            System.out.println("9>>>numberIn = numberIn / 10:  " + numberIn / 10);
//            System.out.println(".........");
//            numberIn = numberIn / 10;
//        }
//
//        int temp;
//        while (!romanNumeralsStack.empty()) {
//            System.out.println("10>>>>>>>>>>>>>>>");
//            temp = (int) romanNumeralsStack.pop();
//            System.out.println(temp);
//            String value = calculateRomanNumeral((temp));
//            romanNumeral += value;
//            System.out.println("11>>>>" + romanNumeral);
//        }
//        System.out.println("12>>>>" + romanNumeral);
//        return romanNumeral;
//    }
//
//
//    public String calculateXXXX(int number) {
//
//        if (number >= 0 && number <= 9) {
//            return convertToRomanNumeral_1to9(number);
//        } else if (number >= 10 && number <= 90) {
//            return convertToRomanNumeral_10to90(number);
//        } else if (number >= 100 && number <= 900) {
//            return convertToRomanNumeral_100to900(number);
//        } else if (number >= 1000 && number <= 4000) {
//            return convertToRomanNumeral_1000to4000(number);
//        }
//        return "";
//    }
//
//
//    public String convertToRomanNumeral_1to9(int number) {
//        String[] units = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
//        return units[number - 1];
//    }
//
//    public String convertToRomanNumeral_10to90(int number) {
////        switch (number) {
////            case 10 :
////                return "X";
////            case 20 :
////                return "XX";
////            case 30 :
////                return "XXX";
////            case 40 :
////                return "XL";
////            case 50 :
////                return "L";
////            case 60 :
////                return "LX";
////            case 70 :
////                return "LXX";
////            case 80 :
////                return "LXXX";
////            case 90 :
////                return "XC";
////            default :
////                return "";
////    }
//        String[] tens = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
//        return tens[(number / 10) - 1];
//    }
//
//    public String convertToRomanNumeral_100to900(int number) {
////                switch (number) {
////            case 100 :
////                return "C";
////            case 200 :
////                return "CC";
////            case 300 :
////                return "CCC";
////            case 400 :
////                return "CD";
////            case 500 :
////                return "D";
////            case 600 :
////                return "DC";
////            case 700 :
////                return "DCC";
////            case 800 :
////                return "DCCC";
////            case 900 :
////                return "CM";
////            default :
////                return "";
////    }
//        String[] hundreds = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
//        return hundreds[(number / 100) - 1];
//    }
//
//    public String convertToRomanNumeral_1000to4000(int number) {
////        switch (number) {
////            case 1000:
////                return "M";
////            case 2000:
////                return "MM";
////            case 3000:
////                return "MMM";
////            case 4000:
////                return "MMMM";
////            default:
////                return "";
////        }
//        String[] thousands = new String[]{"M", "MM", "MMM", "MMMM"};
//        return thousands[(number / 1000) - 1];
//    }


//        switch (number) {
//            case 1:
//                return "I";
//            case 2:
//                return "II";
//            case 3:
//                return "III";
//            case 4:
//                return "IV";
//            case 5:
//                return "V";
//            case 6:
//                return "VI";
//            case 7:
//                return "VII";
//            case 8:
//                return "VIII";
//            case 9:
//                return "IX";
//            default:
//                return "LL";
//        }
//    }
//}

//        switch (number) {
//            case 1 :
//                return "I";
//            case 2 :
//                return "II";
//            case 3 :
//                return "III";
//            case 4 :
//                return "IV";
//            case 5 :
//                return "V";
//            case 6 :
//                return "VI";
//            case 7 :
//                return "VII";
//            case 8 :
//                return "VIII";
//            case 9 :
//                return "IX";
//            default :
//                return "LL";
//        }
//    }


//        if (number == 1) {
//            return "I";
//        }
//        else if (number == 2) {
//            return "II";
//        }
//        return "";
//   }

//        switch (number) {
//            case 1: System.out.println("I"); break;
//            case 2: System.out.println("II"); break;
//            //return "";
//           // default : return "";
//        }