package academy.elqoo.java8.stream;

import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

/**
 * Collects Characters from a string to a String
 */
public class CharacterToStringCollector implements Collector<Character, StringBuilder, String> {
  @Override
  public Supplier<StringBuilder> supplier() {
    return null;
  }

  @Override
  public BiConsumer<StringBuilder, Character> accumulator() {
    return null;
  }

  @Override
  public BinaryOperator<StringBuilder> combiner() {
    return null;
  }

  @Override
  public Function<StringBuilder, String> finisher() {
    return null;
  }

  @Override
  public Set<Characteristics> characteristics() {
    return null;
  }
}
