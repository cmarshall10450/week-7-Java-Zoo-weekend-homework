package zoo;

import animals.Animal;
import animals.Elephant;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ZooTest {

  Zoo zoo;

  @Before
  public void before() {
    zoo = new Zoo();
  }

  @Test
  public void testCanGetFunds() {
    int actual = zoo.getFunds();
    assertEquals(100000, actual);
  }

  @Test
  public void testCanGetTicketPrice() {
    int actual = zoo.getTicketPrice();
    assertEquals(10, actual);
  }

  @Test
  public void testCanCreateNewEnclosure() {
    zoo.createEnclosure("Elephants");
    assertNotNull(zoo.getEnclosure("Elephants"));
  }

  @Test
  public void testCanCreateNewEnclosureWithAnimals() {
    Elephant elephant = new Elephant("Shep", 1000);
    zoo.createEnclosureWithAnimals("Elephants", elephant);

    assertNotNull(zoo.getEnclosure("Elephants"));
  }

  @Test
  public void testCanCreateNewEnclosureWithArrayListOfAnimals() {
    String name = "Elephants";

    Elephant elephant = new Elephant("Shep", 1000);
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(elephant);

    zoo.createEnclosureWithAnimals(name, animals);

    assertNotNull(zoo.getEnclosure(name));
  }

  @Test
  public void testCanRemoveEnclosure() {
    String name = "Elephants";
    zoo.createEnclosure(name);
    zoo.removeEnclosure(name);

    assertNull(zoo.getEnclosure(name));
  }

  @Test
  public void testCanGetEnclosure() {
    String name = "Elephants";
    zoo.createEnclosure(name);
    assertNotNull(zoo.getEnclosure(name));
  }

  @Test
  public void testCanGetTotalNumberOfAnimals() {
    Elephant elephant = new Elephant("Shep", 1000);
    zoo.createEnclosureWithAnimals("Elephants", elephant);

    int actual = zoo.getTotalNumberOfAnimals();
    assertEquals(1, actual);
  }

  @Test
  public void testCanSellAnimal() {
    Elephant elephant = new Elephant("Shep", 1000);
    zoo.createEnclosureWithAnimals("Elephants", elephant);

    zoo.sellAnimal(elephant);
    assertEquals(101000, zoo.getFunds());
  }

  @Test
  public void testCanAddVisitor() {
    Visitor visitor = new Visitor();
    zoo.addVisitor(visitor);

    int actual = zoo.getVisitors().size();
    assertEquals(1, actual);
  }

  @Test
  public void testCanRemoveVisitor() {
    Visitor visitor = new Visitor();
    zoo.addVisitor(visitor);
    zoo.removeVisitor(visitor);

    int actual = zoo.getVisitors().size();
    assertEquals(0, actual);
  }

}
