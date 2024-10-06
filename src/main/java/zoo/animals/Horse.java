package zoo.animals;

import zoo.Animal;
import zoo.Food;
import zoo.Herbivore;
import zoo.Terrestrial;

public class Horse extends Animal implements Herbivore, Terrestrial {

  @Override
  public void eat(Food food) {
    if (food == Food.GRASS) {
      System.out.println("Лошадь ест " + food);
    } else {
      System.out.println("Лошадь не ест это");
    }
  }

  @Override
  public void walk() {
    System.out.println("Лошадь идет");
  }
}
