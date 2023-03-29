package otus.tests.fakes;

import otus.game.Dice;

public class DiceImplStubForSecondTest implements Dice {
    private boolean isFirstInputCall = true;
    @Override
    public int roll() {
        if (isFirstInputCall) {
            isFirstInputCall = false;
            return 6;
        } else {
            return 1;
        }
    }
}
