package otus.tests;

import otus.game.Dice;
import otus.game.DiceImpl;

import java.util.Random;

public class DiceImplTest {

    Dice dice = new DiceImpl();

    public void rollOutCheckAbroad() {
        String scenario = "Проверка на выход кубика за границу заявленного (1-6) ";
        try {
            for (int i=0; i < 10; i++){ // Проверяю 10 раз
                int b = dice.roll();
                if (b > 6) {
                    throw new AssertionError(String.format("Ожидалось Random().nextInt() < 6"));
                }
            }
            System.out.println("passed: " + scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }

    public void rollCheckingForNegativeValues() {
        String scenario = "Проверка выпадения кубика на отрицательное значения (1-6)";
        try {
            for (int i=0; i < 10; i++) {    // Проверяю 10 раз
                int b = dice.roll();
                if (b < 1) {
                    throw new AssertionError(String.format("Ожидалось Random().nextInt() > 0"));
                }
            }
            System.out.println("passed: " + scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
