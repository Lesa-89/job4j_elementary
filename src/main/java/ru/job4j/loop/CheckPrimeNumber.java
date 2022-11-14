package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }

    public static void main(String[] args) {
        System.out.println(check(1));
        System.out.println(check(2));
        System.out.println(check(3));
        System.out.println(check(4));
        System.out.println(check(5));
        System.out.println(check(6));
        System.out.println(check(7));
        System.out.println(check(8));
        System.out.println(check(9));
    }
}