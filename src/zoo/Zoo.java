package zoo;

import animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

  private HashMap<String, Enclosure<Animal>> enclosures;

  public Zoo() {
    this.enclosures = new HashMap<>();
  }

  public void createEnclosure(String name) {
    this.enclosures.put(name, new Enclosure<>());
  }

  public void createEnclosureWithAnimals(String name, Animal... animals) {
    this.enclosures.put(name, new Enclosure<>(animals));
  }

  public void createEnclosureWithAnimals(String name, ArrayList<Animal> animals) {
    this.enclosures.put(name, new Enclosure<>(animals));
  }

  public void removeEnclosure(String name) {
    this.enclosures.remove(name);
  }

  public Enclosure<Animal> getEnclosure(String name) {
    return this.enclosures.get(name);
  }

  public int getTotalNumberOfAnimals() {
    int total = 0;
    for (Enclosure<Animal> enclosure : enclosures.values()) {
      total += enclosure.getNumAnimals();
    }

    return total;
  }
}
