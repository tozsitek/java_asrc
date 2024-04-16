package jcg.streamsFiltering;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class FilterSingleCondition {
  public static void main(String[] args) {
    System.out.println("Fruites stream: " + getStream().collect(Collectors.toList()));

    //filter1
    Predicate<String> nofruitWordFilter = name -> !name.contains("fruit");
    List<String> filteredList1 = getStream().filter(nofruitWordFilter).collect(Collectors.toList());
    System.out.println("filteredList 1: " + filteredList1);

    //filter2
    Predicate<String> noLetterOFilter = name -> !name.contains("o");
    List<String> noLetterOFilterList = getStream().filter(noLetterOFilter).collect(Collectors.toList());
    System.out.println("filteredList 2: " + noLetterOFilterList);

  }

  private static Stream<String> getStream(){
    Stream<String> fruitesStream = Stream.of("mango", "grapes", "apple", "papaya", "jack fruit", "dragon fruit");
    return fruitesStream;
  }

}
