package animals;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ElephantTest {

  @Test
  public void testCanCreateElephant() {
    Elephant elephant = new Elephant("Shep", 1000);
    assertNotNull(elephant);
  }

}