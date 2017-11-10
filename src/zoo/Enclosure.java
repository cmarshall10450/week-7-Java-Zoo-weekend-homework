package zoo;

import animals.Animal;

import java.util.ArrayList;

public class Enclosure<T extends Animal> {

  private ArrayList<T> animals;

  public Enclosure(ArrayList<T> animals) {
    this.animals = animals;
  }

  public Enclosure(T... animals) {
    this.animals = new ArrayList<>();
    for (T animal : animals) {
      this.animals.add(animal);
    }
  }

  public Enclosure() {
    this.animals = new ArrayList<>();
  }

  public ArrayList<T> getAnimals() {
    return animals;
  }


  public void addAnimal(T animal) {
    this.animals.add(animal);
  }

  public void removeAnimal(T animal) {
    this.animals.remove(animal);
  }

  public int getNumAnimals() {
    return this.animals.size();
  }
}
