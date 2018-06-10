package academy.elqoo.java8.labmda;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertThat;
import academy.elqoo.java8.lambda.Lambda;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {

  @Test
  public void removeStringsWithMoreThanThreeCharacters() {
    List<String> input = asList("This", "is", "java", "8");
    input = Lambda.filter(input, s -> s.length() < 3);// complete
    assertThat(input, contains("is", "8"));
  }

  @Test
  public void shouldSortStrings() {
    List<String> input = Arrays.asList("CA", "FG", "AR", "DE", "BY", "EZ");
    List<String> result = Lambda.sortStrings(input, (r, l) -> r.charAt(1) - l.charAt(1)); //insert lambda implement SecondLetterComparator
    assertThat(result, is(equalTo(Arrays.asList("CA", "DE", "FG", "AR", "BY", "EZ"))));
  }


}
