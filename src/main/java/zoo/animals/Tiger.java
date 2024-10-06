package zoo.animals;

import zoo.Animal;
import zoo.Carnivore;
import zoo.Food;
import zoo.Terrestrial;

public class Tiger extends Animal implements Carnivore, Terrestrial {

  @Override
  public void eat(Food food) {
    if (food == Food.BEEF) {
      System.out.println("Тигр ест " + food);
    } else {
      System.out.println("Тигр не ест это мясо");
    }
  }

  @Override
  public void walk() {
    System.out.println("Тигр идет");
  }
}
