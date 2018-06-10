package academy.elqoo.java8.stream;


import academy.elqoo.java8.User;
import java.util.*;
import java.util.stream.*;

public class Stream8 {

  public static List<Integer> returnSquareRoot(List<Integer> numbers) {
    return null;
  }

  public static List<Integer> getAgeFromUsers(List<User> user) {
    return null;
  }

  public static List<Integer> getDistinctAges(List<User> users) {
    return null;
  }

  public static List<User> getLimitedUserList(List<User> users, int limit) {
    return null;
  }

  public static Integer countUsersOlderThen25(List<User> users) {
    return null;
  }

  public static List<String> mapToUpperCase(List<String> strings) {
    return null;
  }

  public static Integer sum(List<Integer> integers) {
    return null;
  }

  public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
    return null;
  }

  public static List<String> getFirstNames(List<String> names) { //from {"Homer Simpson", "Marge Simpson"} you should return
    // {"Homer", "Marge"}
    return null;
  }

  public static List<String> getDistinctLetters(List<String> names) {
    return null;
  }


  public static String separateNamesByComma(List<User> users) {
    return null;
  }

  public static double getAverageAge(List<User> users) {
    return 0;
  }

  public static Integer getMaxAge(List<User> users) {
    return null;
  }

  public static Integer getMinAge(List<User> users) {
    return null;
  }

  public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
    return null;
  }

  public static Map<Integer, List<User>> groupByAge(List<User> users) {
    return null;
  }

  public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
    return null;
  }

  public static Map<Boolean, Long> countGender(List<User> users) {
    return null;
  }

  public static boolean anyMatch(List<User> users, int age) {
    return false;
  }

  public static boolean noneMatch(List<User> users, int age) {
    return false;
  }

  public static Optional<User> findAny(List<User> users, String name) {
    return null;
  }

  public static List<User> sortByAge(List<User> users) {
    return null;
  }

  public static Stream<Integer> getBoxedStream(IntStream stream) {
    return null;
  }

  public static List<Integer> generateFirst10PrimeNumbers() {
    return null;
  }

  public static boolean isPrime(int number) {
    return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
  }

  public static List<Integer> generate10RandomNumbers() {
    return null;
  }

  public static User findOldest(List<User> users) {
    return null;
  }

  public static int sumAge(List<User> users) {
    return 0;
  }

  public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
    return null;
  }

  public static int getMultiplicationUsingReduce(List<Integer> numbers) {
    return 0;
  }

}
