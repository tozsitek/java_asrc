package jcg.arrayaverage;

import java.util.Arrays;
import java.util.List;

public class SumWithStream {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    int sum = numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

    System.out.println("Sum of even numbers: " + sum);
  }

}
