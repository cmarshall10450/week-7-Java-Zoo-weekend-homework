package animals;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 10/11/2017.
 */
public class LionTest {

  @Test
  public void testCanCreateLion() {
    Lion lion = new Lion("Snoop", 1000);
    assertNotNull(lion);
  }

}