package edible;

import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;
import myInterface.Animal;
import myInterface.Tiger;

public class Test {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSoud());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
