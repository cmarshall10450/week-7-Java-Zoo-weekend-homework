package zoo;

import animals.Elephant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ZooTest {

  Zoo zoo;

  @Before
  public void before() {
    zoo = new Zoo();
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

}
