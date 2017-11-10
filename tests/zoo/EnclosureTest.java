package zoo;

import animals.Elephant;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EnclosureTest {

  @Test
  public void testEnclosureCanStartWithEmptyList() {
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>();

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(0, actual);
  }

  @Test
  public void testEnclosureCanBeCreatedWithAnArrayListOfAnimals() {
    Elephant elephant = new Elephant("Shep", 1000);
    ArrayList<Elephant> animalsList = new ArrayList<>();
    animalsList.add(elephant);

    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(animalsList);

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(1, actual);
  }

  @Test
  public void testEnclosureCanBeCreatedWithParamsOfAnimals() {
    Elephant elephant = new Elephant("Shep", 1000);
    Enclosure<Elephant> elephantEnclosure = new Enclosure<>(elephant);

    int actual = elephantEnclosure.getAnimals().size();
    assertEquals(1, actual);
  }

}
