package zoo.animals;

import zoo.Animal;
import zoo.Food;
import zoo.Carnivore;
import zoo.Aquatic;

public class Dolphin extends Animal implements Carnivore, Aquatic {

  @Override
  public void eat(Food food) {
    if (food == Food.FISH) {
      System.out.println("Дельфин ест " + food);
    } else {
      System.out.println("Дельфин не ест это мясо");
    }
  }

  @Override
  public void swim() {
    System.out.println("Дельфин плывет");
  }
}
