package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру: 1 для выбора рублей; 2 для выбора долларов");
        int choice = scanner.nextInt();
        Currency currency = Currency.RUBLE;
        switch (choice) {
            case 1:
                currency = Currency.RUBLE;
                break;
            case 2:
                currency = Currency.DOLLAR;
                break;
        }
        System.out.println("Введите число от 0 до 1000");
        for (int i = 0; i <=100; i++) {
            int n = scanner.nextInt();
            if (validateOnFails(n) == false) {
                System.out.println("Ваше значение не сходится с заданным условием");
                break;
            }
            Money money = new Money(n);
            money.output(currency);
        }

    }
    private static boolean validateOnFails(int n) {
        Validator validator = new GreaterThenValidator();
        Validator validator1 = new LessThenValidator();
        return validator.check(n) && validator1.check(n);
    }
}

