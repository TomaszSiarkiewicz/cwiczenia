package org.cwiczenia.feb02;

public class DodawanieOdejmowanieDzielenie {
    public static void main(String[] args) {
        dodawanie();
        odejmowanie();
        dzielenie();
    }

    private static void dzielenie() {
        double a = 3.4;
        double b = 2.4;
        System.out.println(a / b);
    }

    private static void odejmowanie() {
        int a = 4;
        int b = 4;
        System.out.println(a - b);
    }

    private static void dodawanie(){
        int a = 4;
        int b = 3;
        System.out.println(a+b);
    }
}
