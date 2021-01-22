package edible;

import myInterface.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: cluck cluck";
    }

    @Override
    public String makeSoud() {
        return "could be fried";
    }
}
