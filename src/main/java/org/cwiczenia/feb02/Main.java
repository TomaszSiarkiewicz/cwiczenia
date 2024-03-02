package org.cwiczenia.feb02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        bmi();
        dodawanieOdejmowanieDzielenie();
        tablica();
        czyParzysta();
        tablica();
        oceny();
        palindrom();
    }

    private static void palindrom() {
        String expresion = "alaqla";
        String modExpresion = expresion.toLowerCase().replaceAll(" ", "");

        boolean palindrom = true;
        for (int i = 0; i < modExpresion.length() / 2; i++) {
            if (modExpresion.charAt(i) != modExpresion.charAt(modExpresion.length() - 1 - i)) {
                System.out.println(expresion + " is not palindrome");
                palindrom = false;
                break;
            }
        }
        if (palindrom) {
            System.out.println(expresion + " is palindrome");
        }
    }

    private static void oceny() {
        int[] grades = {3, 4, 5};
        double avg = Arrays.stream(grades).average().getAsDouble();
        System.out.println("Avg: " + avg);
        if (avg > 5) {
            System.out.println("Grade " + "A");
        } else if (avg > 4) {
            System.out.println("Grade " + "B");
        } else {
            System.out.println("Grade " + "C");
        }
    }

    private static void czyParzysta() {
        int a = 5;
        if (a % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }
    }

    private static void tablica() {
        int[] ints = {2, 3, 4, 5, 6};
        System.out.println(Arrays.stream(ints).average().getAsDouble());
    }

    private static void dodawanieOdejmowanieDzielenie() {
        double a = 3.4;
        double b = 2.4;
        System.out.println(a / b);

        int s = 4;
        int d = 4;
        System.out.println(s - d);

        int x = 4;
        int z = 3;
        System.out.println(x + z);
    }

    private static void bmi() {
        double weight = 88;
        double height = 1.8;

        System.out.println(weight / (height * height));
    }
}
