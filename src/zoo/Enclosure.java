package zoo;

import animals.Animal;

import java.util.ArrayList;

public class Enclosure<T extends Animal> {

  ArrayList<T> animals;

  public Enclosure(ArrayList<T> animals) {
    this.animals = animals;
  }

  public Enclosure() {
    this.animals = new ArrayList<>();
  }

  public ArrayList<T> getAnimals() {
    return animals;
  }


}
