package tests;

import main.RubleCurrency;

import java.util.Currency;
import java.util.Scanner;

public class RubleCurrencyTest {
    int n;
    public void checkingForANegativeValue() {
        String scenario = "Проверка на отрицательное значения";
        try {
            n = -9;
            RubleCurrency rubleCurrency = new RubleCurrency(n);
            rubleCurrency.output();
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void wordInputCheck() {
        String scenario = "Проверка на ввод числа больше тысячи";
        try {
            n = 1001;
            RubleCurrency rubleCurrency = new RubleCurrency(n);
            rubleCurrency.output();
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void nullInputCheck() {
        String scenario = "Проверка на ввод числа больше тысячи";
        try {
            n = 0;
            RubleCurrency rubleCurrency = new RubleCurrency(n);
            rubleCurrency.output();
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
