package zoo;

import animals.Elephant;
import org.junit.Before;
import org.junit.Test;

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

}
