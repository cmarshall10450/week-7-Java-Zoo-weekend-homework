import animals.Animal;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

  @Mock
  private Animal animal;

  @Before
  public void before() {
    animal = Mockito.mock(Animal.class, Mockito.CALLS_REAL_METHODS);
  }

  @Test
  public void testAnimalHasName() {
    String expected = "Shep";
    Mockito.when(animal.getName()).thenReturn(expected);

    String actual = animal.getName();
    assertEquals(expected, actual);
  }

  @Test
  public void testAnimalHasValue() {
    int expected = 1000;
    Mockito.when(animal.getValue()).thenReturn(expected);

    int actual = animal.getValue();
    assertEquals(expected, actual);
  }

}
