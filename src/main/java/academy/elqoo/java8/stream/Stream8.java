package academy.elqoo.java8.stream;


import academy.elqoo.java8.User;
import java.util.*;
import java.util.stream.*;

public class Stream8 {

  public static List<Integer> returnSquareRoot(List<Integer> numbers) {
    return numbers.stream()
        .map(num -> (int) (Math.sqrt(num)))
        .collect(Collectors.toList());
  }

  public static List<Integer> getAgeFromUsers(List<User> user) {
    return user.stream()
        .map(User::getAge).collect(Collectors.toList());
  }

  public static List<Integer> getDistinctAges(List<User> users) {
    return users.stream()
        .map(User::getAge)
        .distinct()
        .collect(Collectors.toList());
  }

  public static List<User> getLimitedUserList(List<User> users, int limit) {
    return users.stream()
        .limit(limit)
        .collect(Collectors.toList());
  }

  public static Integer countUsersOlderThen25(List<User> users) {
    long count = users.stream()
        .filter(user -> user.getAge() > 25)
        .count();
    return Math.toIntExact(count);
  }

  public static List<String> mapToUpperCase(List<String> strings) {
    return strings.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
  }

  public static Integer sum(List<Integer> integers) {
    return integers.stream()
        .mapToInt(Integer::intValue)
        .sum();
  }

  public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
    return integers.stream()
        .skip(toSkip)
        .collect(Collectors.toList());
  }

  public static List<String> getFirstNames(List<String> names) { //from {"Homer Simpson", "Marge Simpson"} you should return
    // {"Homer", "Marge"}
    return names.stream()
        .map(name -> name.split(" ")[0])
        .collect(Collectors.toList());
  }

  public static List<String> getDistinctLetters(List<String> names) {
    return names.stream()
        .flatMap(name -> Stream.of(name.split("")))
        .distinct()
        .collect(Collectors.toList());
  }


  public static String separateNamesByComma(List<User> users) {
    return users.stream()
        .map(User::getName)
        .collect(Collectors.joining(", "));
  }

  public static double getAverageAge(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .average()
        .getAsDouble();
  }

  public static Integer getMaxAge(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .max()
        .getAsInt();
  }

  public static Integer getMinAge(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .min()
        .getAsInt();
  }

  public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
    return users.stream()
        .collect(Collectors.groupingBy(User::isMale));
  }

  public static Map<Integer, List<User>> groupByAge(List<User> users) {
    return users.stream()
        .collect(Collectors.groupingBy(User::getAge));
  }

  public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
    return users.stream()
        .collect(Collectors.groupingBy(User::isMale,
            Collectors.groupingBy(User::getAge)));
  }

  public static Map<Boolean, Long> countGender(List<User> users) {
    return users.stream()
        .collect(Collectors.groupingBy(User::isMale,
            Collectors.counting()));
  }

  public static boolean anyMatch(List<User> users, int age) {
    return users.stream()
        .anyMatch(user -> user.getAge().equals(age));
  }

  public static boolean noneMatch(List<User> users, int age) {
    return users.stream()
        .noneMatch(user -> user.getAge().equals(age));
  }

  public static Optional<User> findAny(List<User> users, String name) {
    return users.stream()
        .filter(user -> user.getName().equals(name))
        .findAny();
  }

  public static List<User> sortByAge(List<User> users) {
    return users.stream()
        .sorted(Comparator.comparingInt(User::getAge))
        .collect(Collectors.toList());
  }

  public static Stream<Integer> getBoxedStream(IntStream stream) {
    return stream.boxed();
  }

  public static List<Integer> generateFirst10PrimeNumbers() {
    return IntStream.iterate(2, i -> i + 1)
        .filter(Stream8::isPrime)
        .limit(10)
        .boxed()
        .collect(Collectors.toList());
  }

  public static boolean isPrime(int number) {
    return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
  }

  public static List<Integer> generate10RandomNumbers() {
    return new Random()
        .ints()
        .boxed()
        .limit(10)
        .collect(Collectors.toList());
  }

  public static User findOldest(List<User> users) {
    return users.stream()
        .max(Comparator
            .comparingInt(User::getAge))
        .get();
  }

  public static int sumAge(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .sum();
  }

  public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
    return users.stream()
        .mapToInt(User::getAge)
        .summaryStatistics();
  }

  public static int getMultiplicationUsingReduce(List<Integer> numbers) {
    return numbers.stream()
        .reduce(Math::multiplyExact)
        .get();
  }

}
