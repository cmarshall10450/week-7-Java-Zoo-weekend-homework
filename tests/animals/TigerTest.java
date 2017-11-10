package animals;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 10/11/2017.
 */
public class TigerTest {

  @Test
  public void testCanCreateTiger() {
    Tiger tiger = new Tiger("Tony", 1000);
    assertNotNull(tiger);
  }

}