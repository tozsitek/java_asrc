package com.jpractice.javaPractice.codingBat.Misc;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class MinMaxAvgCalculate {

  public static void main(String[] args) {
    int[] arr = {12, 34, 456, -2, 999};
    ArrayList<Integer> al = new ArrayList<>();
    al.add(12);
    al.add(34);
    al.add(456);
    al.add(-2);
    al.add(999);

    System.out.println("Array displays:");
    System.out.println("Array MIN: " + arrayMin(arr) + " MAX: " + arrayMax(arr) + " AVG: " + arrayAvg(arr));

    System.out.println("ArrayList displays:");
    System.out.println("ArrayList MIN: " + arrListMin(al) + " MAX: " + arrListMax(al) + " AVG: " + arrListAvg(al));

    System.out.println("Collections displays:");
    System.out.println("Collections MIN: " + Collections.min(al) + " MAX: " + Collections.max(al));

    System.out.println("Run comparator example: ");
    comparatorExample();

    System.out.println("Run comparator java 8 example: ");
    comparableJava8();

    String startDate = String.valueOf(LocalDateTime.of(LocalDate.now().minusDays(60), LocalTime.now()));
    String completionDate = String.valueOf(LocalDateTime.of(LocalDate.now().minusDays(15), LocalTime.now()));
    String lastDayOfYear = String.valueOf(LocalDateTime.now().with(TemporalAdjusters.lastDayOfYear()));
    String currentYear = Year.now().toString();


    System.out.println("startDate is: " + startDate + "\ncompletionDate is: " + completionDate);
    System.out.println("Last Day of the year: " + lastDayOfYear);
    System.out.println("Current year: " + currentYear);
  }

  public static int arrayMin(int[] arr){
    int min = arr[0];
    for (int j : arr) {
      if (min > j) {
        min = j;
      }
    }
    return min;
  }

  public static int arrayMax(int[] arr){
    int max = arr[0];
    for (int j : arr) {
      if (max < j) {
        max = j;
      }
    }
    return max;
  }

  public static double arrayAvg(int[] arr){
    int total = 0;
    for (int j : arr) {
      total += j;
    }
    return (double) total / arr.length;
  }

/////// ArrayList
public static int arrListMin(ArrayList<Integer> al){
  int min = al.getFirst();
  for(int alNum : al){
    if(alNum < min){
      min = alNum;
    }
  }
  return min;
}

  public static int arrListMax(ArrayList<Integer> al){
    int max = al.getFirst();
    for(int alNum : al){
      if(alNum > max){
        max = alNum;
      }
    }
    return max;
  }

  public static double arrListAvg(ArrayList<Integer> al){
    int total = 0;
    for(int alNum : al){
        total += alNum;
      }
    return (double) total / al.size();
  }

  public static void comparatorExample(){
    List<Integer> ints = Stream.of(12, 72, 54, 83, 51).toList();
    System.out.println("the list: ");
    ints.forEach((i) -> System.out.print(i + " "));
    Integer minNumber = ints.stream().min(Comparator.comparing(i -> i)).get();
    Integer maxNumber = ints.stream().max(Comparator.comparing(i -> i)).get();

    System.out.println("Min number is " + minNumber);
    System.out.println("Max number is " + maxNumber);
  }

  public static void comparableJava8() throws NoSuchElementException {
    List<Integer> ints = Stream.of(22,44,11,66,33,55).toList();
    int max = ints.stream().mapToInt(i->i).max().orElseThrow(NoSuchElementException::new); //66
    int min = ints.stream().mapToInt(i->i).min().orElseThrow(NoSuchElementException::new); //11
    System.out.println("Comparable Java 8 LIST: ");
    ints.forEach((i) -> System.out.print(i + " "));

    System.out.println("\nMin number is " + min);
    System.out.println("Max number is " + max);
  }

}
