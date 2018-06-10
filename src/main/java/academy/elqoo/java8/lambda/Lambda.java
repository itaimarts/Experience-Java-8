package academy.elqoo.java8.lambda;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

  public static List<String> filter(List<String> strings, Predicate<String> condition) {
    return strings.stream().filter(condition).collect(Collectors.toList()); //return null;
  }

  public static List<String> sortStrings(List<String> strings, SecondLetterComparator<String> secondLetterComparator) { /*
  implement the method to sort using secondLetterComparator */
    return strings.stream()
        .sorted(secondLetterComparator::compare)
        .collect(Collectors.toList());
  }

}


