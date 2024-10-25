package zoo.animals;

import zoo.Animal;
import zoo.Carnivore;
import zoo.Flying;
import zoo.Food;

public class Eagle extends Animal implements Carnivore, Flying {

  @Override
  public void eat(Food food) {
    System.out.println("Орел ест " + food);
  }

  @Override
  public void fly() {
    System.out.println("Орел летит");
  }
}
