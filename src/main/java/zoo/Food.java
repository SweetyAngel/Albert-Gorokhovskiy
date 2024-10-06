package zoo;

public enum Food {
  GRASS("траву"),
  BEEF("говядину"),
  FISH("рыбу");

  private final String name;

  Food(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
