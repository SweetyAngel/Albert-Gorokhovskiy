// Интерфейсы для поведения животных
interface Herbivore {

  void eat(Grass food);
}

interface Carnivore {

  void eat(Meat food);
}

interface Terrestrial {

  void walk();
}

interface Aquatic {

  void swim();
}

interface Flying {

  void fly();
}

// Классы для типов еды
class Grass {

  @Override
  public String toString() {
    return "траву";
  }
}

class Meat {

  @Override
  public String toString() {
    return "мясо";
  }
}

class Beef extends Meat {

  @Override
  public String toString() {
    return "говядину";
  }
}

class Fish extends Meat {

  @Override
  public String toString() {
    return "рыбу";
  }
}

// Классы для конкретных видов животных
class Horse implements Herbivore, Terrestrial {

  @Override
  public void eat(Grass food) {
    System.out.println("Лошадь ест " + food);
  }

  @Override
  public void walk() {
    System.out.println("Лошадь идет");
  }
}

class Tiger implements Carnivore, Terrestrial {

  @Override
  public void eat(Meat food) {
    if (food instanceof Beef) {
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

class Dolphin implements Carnivore, Aquatic {

  @Override
  public void eat(Meat food) {
    if (food instanceof Fish) {
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

class Eagle implements Carnivore, Flying {

  @Override
  public void eat(Meat food) {
    System.out.println("Орел ест " + food);
  }

  @Override
  public void fly() {
    System.out.println("Орел летит");
  }
}

class Camel implements Herbivore, Terrestrial {

  @Override
  public void eat(Grass food) {
    System.out.println("Верблюд ест " + food);
  }

  @Override
  public void walk() {
    System.out.println("Верблюд идет");
  }
}

// Пример использования
public class Main {

  public static void main(String[] args) {
    Horse horse = new Horse();
    horse.walk();
    horse.eat(new Grass());

    Tiger tiger = new Tiger();
    tiger.walk();
    tiger.eat(new Beef());
    tiger.eat(new Fish()); // Тигр не ест рыбу

    Dolphin dolphin = new Dolphin();
    dolphin.swim();
    dolphin.eat(new Fish());
    dolphin.eat(new Beef()); // Дельфин не ест говядину

    Eagle eagle = new Eagle();
    eagle.fly();
    eagle.eat(new Beef());
    eagle.eat(new Fish());

    Camel camel = new Camel();
    camel.walk();
    camel.eat(new Grass());
  }
}