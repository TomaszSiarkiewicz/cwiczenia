package org.cwiczenia.feb03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
1.1) Napisz funkcję, która przyjmuje tablicę i liczbę do znalezienia,
    a następnie zwraca indeks tej liczby w tablicy (lub -1, jeśli nie znaleziono).
1.2) Napisz funkcję, która przyjmuje zakres liczb i zwraca tablicę liczb pierwszych w tym zakresie.
1.3) Napisz funkcję, która przyjmuje tablicę i liczbę, a następnie zlicza ile razy
    ta liczba występuje w tablicy.
1.4) Napisz funkcję rekurencyjną, która oblicza sumę liczby całkowitej,
    dodając do niej wszystkie liczby od 1 do tej liczby.
Link: https://pl.wikipedia.org/wiki/Rekurencja
 */
public class Main {
    static Integer[] tablica = new Integer[]{1, 3, 4, 5, 4, 33, 34};

    public static void main(String[] args) {

        //  1.1
        System.out.println("----------------------------- Index of -----------------------------");
        System.out.println("Requested index: " + getIndex(tablica, 3));

        //  1.2
        System.out.println("----------------------------- Primes -----------------------------");
        int start = 4;
        int end = 11;
        System.out.println("Primes in given range: " + start + "-" + end);
        Integer[] primes = primes(start, end);
        Arrays.stream(primes).forEach(System.out::println);

        //  1.3
        System.out.println("----------------------------- Occurrences -----------------------------");
        Integer[] integers = new Integer[]{3, 4, 6, 7, 4, 3, 4, 6, 4, 3, 33, 5, 6, 7, 8};
        int num = 3;
        System.out.println("Occurrences of " + num + " in array:" + occurrences(integers, num));

        //  1.4
        System.out.println("----------------------------- Recurrence -----------------------------");
        System.out.println("Sum: " + recurrence(1));
        System.out.println("Sum: " + recurrence(2));
        System.out.println("Sum: " + recurrence(3));
        System.out.println("Sum: " + recurrence(10));
    }

    private static int recurrence(int top) {
        return count(top, 0);
    }
    private static int count(int num, int sum){
        if (num <= 1) return sum + 1;
        return count(num - 1, sum + num);
    }

    private static int occurrences(Integer[] integers, int num) {
        AtomicInteger occurrences = new AtomicInteger();
        Arrays.stream(integers).forEach(integer -> {
            if (integer == num) occurrences.incrementAndGet();
        });
        return occurrences.get();
    }

    private static Integer[] primes(int begin, int end) {

        List<Integer> primes = new ArrayList<>();

        for (int current = begin; current <= end; current++) {
            if (isPrime(current)) primes.add(current);
        }
        return primes.toArray(new Integer[primes.size()]);
    }

    private static boolean isPrime(int current) {
        if (current <= 1)
            return false;

        for (int i = 2; i < current; i++)
            if (current % i == 0)
                return false;
        return true;
    }

    private static Integer getIndex(Integer[] tablica, int i) {
        for (int j = 0; j < tablica.length; j++) {
            if (tablica[j] == i) {
                return j;
            }
        }
        return -1;
    }
}
