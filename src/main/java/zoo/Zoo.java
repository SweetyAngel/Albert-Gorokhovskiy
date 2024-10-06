package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

  private final List<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void feedAnimals(Food food) {
    for (Animal animal : animals) {
      if (animal instanceof Herbivore) {
        ((Herbivore) animal).eat(food);
      } else if (animal instanceof Carnivore) {
        ((Carnivore) animal).eat(food);
      }
    }
  }

  public void makeAnimalsMove() {
    for (Animal animal : animals) {
      if (animal instanceof Terrestrial) {
        ((Terrestrial) animal).walk();
      } else if (animal instanceof Aquatic) {
        ((Aquatic) animal).swim();
      } else if (animal instanceof Flying) {
        ((Flying) animal).fly();
      }
    }
  }
}
