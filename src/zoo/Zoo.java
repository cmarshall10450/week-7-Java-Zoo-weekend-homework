package zoo;

import animals.Animal;

import java.util.ArrayList;
import java.util.HashMap;

public class Zoo {

  private HashMap<String, Enclosure<Animal>> enclosures;
  private ArrayList<Visitor> visitors;

  private int funds = 100000;
  private int ticketPrice = 10;

  public Zoo() {
    this.enclosures = new HashMap<>();
    this.visitors = new ArrayList<>();
  }

  public int getFunds() {
    return funds;
  }

  public int getTicketPrice() {
    return ticketPrice;
  }

  public ArrayList<Visitor> getVisitors() {
    return visitors;
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

  public int getTotalCashValueOfAnimals() {
    int total = 0;
    for (Enclosure<Animal> enclosure : enclosures.values()) {
      for (Animal animal : enclosure.getAnimals()) {
        total += animal.getValue();
      }
    }

    return total;
  }

  public void sellAnimal(Animal animal) {
    for (Enclosure<Animal> enclosure : enclosures.values()) {
      if (enclosure.getAnimals().contains(animal)) {
        enclosure.removeAnimal(animal);
        this.funds += animal.getValue();
      }
    }
  }

  public void addVisitor(Visitor visitor) {
    this.funds += ticketPrice;
    this.visitors.add(visitor);
  }

  public void removeVisitor(Visitor visitor) {
    this.funds -= ticketPrice;
    this.visitors.remove(visitor);
  }
}
