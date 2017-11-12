package zoo;

import animals.Elephant;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EnclosureTest {

  Elephant elephant;

  @Before
  public void before() {
    elephant = new Elephant("Shep", 1000);
  }

  @Test
  public void testEnclosureCanStartWithEmptyList() {
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>();

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(0, actual);
  }

  @Test
  public void testEnclosureCanBeCreatedWithAnArrayListOfAnimals() {
    ArrayList<Elephant> animalsList = new ArrayList<>();
    animalsList.add(elephant);

    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(animalsList);

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(1, actual);
  }

  @Test
  public void testEnclosureCanBeCreatedWithParamsOfAnimals() {
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(elephant);

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(1, actual);
  }

  @Test
  public void testCanAddAnimalToEnclosure() {
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>();
    elephantEnclosure.addAnimal(elephant);

    boolean condition = elephantEnclosure.getAnimals().contains(elephant);
    assertTrue(condition);
  }

  @Test
  public void testCanRemoveAnimalFromEnclosure() {
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(elephant);
    elephantEnclosure.removeAnimal(elephant);

    boolean condition = elephantEnclosure.getAnimals().contains(elephant);
    assertFalse(condition);
  }

  @Test
  public void testCanGetAnimalByName(){
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(elephant);
    Elephant foundElephant = elephantEnclosure.getAnimalByName("Shep");

    assertEquals(elephant, foundElephant);
  }

}
