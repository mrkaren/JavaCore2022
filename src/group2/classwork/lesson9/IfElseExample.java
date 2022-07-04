package group2.classwork.lesson9;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        int month = 4;

        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "Ձմեռ";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Գարուն";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Ամառ";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "Աշուն";
        } else {
            season = "Նման ամիս գոյություն չունի";
        }



    }

}
