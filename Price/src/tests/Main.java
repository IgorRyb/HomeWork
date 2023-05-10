package tests;

import main.RubleCurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 1000");
        new RubleCurrencyTest().checkingForANegativeValue();
        new RubleCurrencyTest().wordInputCheck();
        new RubleCurrencyTest().nullInputCheck();
    }

}

