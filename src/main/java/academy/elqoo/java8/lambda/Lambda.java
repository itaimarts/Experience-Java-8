package academy.elqoo.java8.lambda;


import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambda {

  public static List<String> filter(List<String> strings, Predicate<String> condition) {
    return strings.stream().filter(condition).collect(Collectors.toList());
  }

  public static String create(/*add functional interface to supply something and implement the method to use it*/) {
    return null;
  }

  public static Integer getStringLength(String s /*place a function here*/) {
    return null;
  }

  public static int multiply(int a, int b/* add a functional interface here */) {
    return 0;
  }

  public static List<String> sortStrings(List<String> strings/* sorting can be done using a comparator */) {
    return null;
  }

  public static List<String> sortStringsSecondLetterComprator(List<String> strings, SecondLetterComparator<String> secondLetterComparator) {
    /*implement the method to sort using secondLetterComparator */
    return null;
  }

}


