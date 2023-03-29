package otus.tests;

import otus.assertions.Assertions;
import otus.game.*;
import otus.tests.fakes.DiceImplStub;
import otus.tests.fakes.DiceImplStubForSecondTest;
import otus.tests.fakes.GameWinnerPrinterDummy;
import otus.tests.fakes.GameWinnerPrinterMock;

public class GameTest {
    private final Dice dice = new DiceImplStub();

    public void testGameWithEqualValue() {
        String scenario = "Тест игры с 2 одинаковыми значениями кубиков";
        try {
            Throwable actual = null;
                try {
                    Game game = new Game(dice, new GameWinnerPrinterDummy());
                    game.playGame(new Player("Игорь"), new Player("Вася"));
                } catch (Throwable e) {
                    actual = e;
                }
             if (actual == null) {
                 throw new Throwable("Победителя нет, если значения кубиков одинаковы");
             } else {
                 System.out.println("passed: " + scenario);
             }
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameForTheRightWinner() {
        String scenario = "Тест работы вывода правильного победителя";
        try {
            Player expectedWinner = new Player("Игорь");
            Game game = new Game(new DiceImplStubForSecondTest(), new GameWinnerPrinterMock());
            game.playGame(expectedWinner, new Player("Вася"));
            System.out.println("passed: " + scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }



}
