package animals;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by chris on 10/11/2017.
 */
public class GiraffeTest {

  @Test
  public void testCanCreateGiraffe() {
    Giraffe giraffe = new Giraffe("Melvin", 1000);
    assertNotNull(giraffe);
  }

}