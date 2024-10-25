package zoo;

import zoo.animals.*;

public class Main {

  public static void main(String[] args) {
    Zoo zoo = new Zoo();

    Horse horse = new Horse();
    Tiger tiger = new Tiger();
    Dolphin dolphin = new Dolphin();
    Eagle eagle = new Eagle();
    Camel camel = new Camel();

    zoo.addAnimal(horse);
    zoo.addAnimal(tiger);
    zoo.addAnimal(dolphin);
    zoo.addAnimal(eagle);
    zoo.addAnimal(camel);

    zoo.makeAnimalsMove();
    zoo.feedAnimals(Food.GRASS);
    zoo.feedAnimals(Food.BEEF);
    zoo.feedAnimals(Food.FISH);
  }
}
