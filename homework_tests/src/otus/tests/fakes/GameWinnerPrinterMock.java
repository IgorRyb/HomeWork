package otus.tests.fakes;

import otus.assertions.Assertions;
import otus.game.GameWinnerPrinter;
import otus.game.Player;

public class GameWinnerPrinterMock implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        String expectedWinner = "Игорь";
        String actualWinner = winner.getName();
        Assertions.assertEquals(expectedWinner, actualWinner);
    }

}
