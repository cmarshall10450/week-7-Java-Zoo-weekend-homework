package animals;

public abstract class Animal {

  private String name;
  private int value;

  public Animal(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }
}
