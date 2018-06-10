package academy.elqoo.java8.labmda;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;
import academy.elqoo.java8.lambda.Lambda;
import org.junit.Test;
import java.util.*;

public class LambdaTest {

  @Test
  public void removeStringsWithMoreThanThreeCharacters() {
    List<String> input = asList("This", "is", "java", "8");
    input = Lambda.filter(input, s -> s.length() < 3);// complete
    assertThat(input, contains("is", "8"));
  }

  @Test
  public void sortStringsSecondLetterComprator() {
    List<String> input = Arrays.asList("CA", "FG", "AR", "DE", "BY", "EZ");
    List<String> result = Lambda.sortStringsSecondLetterComprator(input, (r, l) -> r.charAt(1) - l.charAt(1)); //insert lambda
    // implement SecondLetterComparator
    assertThat(result, is(equalTo(Arrays.asList("CA", "DE", "FG", "AR", "BY", "EZ"))));
  }

  @Test
  public void shouldCreateAString() {
    String bigString = Lambda.create(() -> "hello");
    assertTrue(bigString.length() > 0);
  }

  @Test
  public void extractStringSize() {
    String myString = "This is great";
    int length = Lambda.getStringLength(myString, String::length);
    assertTrue(length == 13);
  }

  @Test
  public void multiply() {
    int a = 5;
    int b = 6;
    int result = Lambda.multiply(a, b, (integer, integer2) -> a * b);
    assertTrue(result == 30);
  }

  @Test
  public void shouldSortStrings() {
    List<String> input = Arrays.asList("C", "F", "A", "D", "B", "E");
    List<String> result = Lambda.sortStrings(input, Comparator.comparing(s -> s));
    assertThat(result, is(equalTo(Arrays.asList("A", "B", "C", "D", "E", "F"))));
  }


}
