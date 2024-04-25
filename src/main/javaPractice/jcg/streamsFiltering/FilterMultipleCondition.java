package jcg.streamsFiltering;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class FilterMultipleCondition {

  public static void main(String[] args) {
    System.out.println("Fruites stream: " + getStream().collect(Collectors.toList()));

    //filter1
    Predicate<String> nofruitWordFilter = name -> !name.contains("fruit");
    List<String> noFruitWordFilter = getStream().filter(nofruitWordFilter).collect(Collectors.toList());
    System.out.println("No fruit word filter: " + noFruitWordFilter);

    //filter2
    Predicate<String> noLetterOFilter = name -> !name.contains("o");
    List<String> noLetterOFilterList = getStream().filter(noLetterOFilter).collect(Collectors.toList());
    System.out.println("No o letter filter: " + noLetterOFilterList);

    // filter multiple conditions - remove the fruits with letter "fruit" and with letter "o"
    List<String> result = getStream().filter(nofruitWordFilter).filter(noLetterOFilter)
        .collect(Collectors.toList());
    System.out.println("Final filter result: " + result);
  }

  private static Stream<String> getStream(){
     Stream<String> fruiteStream = Stream.of("mango", "grapes", "apple", "papaya", "jack fruit", "dragon fruit");
     return fruiteStream;
  }

}
