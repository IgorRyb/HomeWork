package otus.tests.fakes;

import otus.game.Dice;

public class DiceImplStub implements Dice {

    @Override
    public int roll() {
        return 6;
    }
}
