package ru.oshkin;

import java.util.Scanner;

public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        System.out.println("Введите длину последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length <= 0) {
            throw new UnsupportedOperationException("Длинна должна быть больше нуля");
        }

        showFibonacciSequence(length);
    }

    public static void showFibonacciSequence(int length) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 3; i < length; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
