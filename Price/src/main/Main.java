package main;

import main.RubleCurrency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 1000");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <=100; i++) {
            int n = scanner.nextInt();
            Currency currency = new RubleCurrency(n);
            currency.toWords();
            currency.output();
        }
    }

}

