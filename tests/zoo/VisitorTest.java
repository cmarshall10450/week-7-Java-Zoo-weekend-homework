package zoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by chris on 10/11/2017.
 */
public class VisitorTest {

  Visitor visitor;
  Zoo zoo;

  @Before
  public void before() {
    visitor = new Visitor();
    zoo = new Zoo();
  }


  @Test
  public void visitZoo() {
    visitor.visitZoo(zoo);
    Zoo actual = visitor.getVisitingZoo();
    assertEquals(zoo, actual);
  }

  @Test
  public void leaveZoo() {
    visitor.visitZoo(zoo);
    visitor.leaveZoo();
    assertNull(visitor.getVisitingZoo());
  }

}