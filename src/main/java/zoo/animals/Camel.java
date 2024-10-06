package zoo.animals;

import zoo.Animal;
import zoo.Food;
import zoo.Herbivore;
import zoo.Terrestrial;

public class Camel extends Animal implements Herbivore, Terrestrial {

  @Override
  public void eat(Food food) {
    if (food == Food.GRASS) {
      System.out.println("Верблюд ест " + food);
    } else {
      System.out.println("Верблюд не ест это");
    }
  }

  @Override
  public void walk() {
    System.out.println("Верблюд идет");
  }
}
