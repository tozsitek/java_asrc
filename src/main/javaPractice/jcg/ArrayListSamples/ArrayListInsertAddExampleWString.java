package jcg.ArrayListSamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInsertAddExampleWString {
  public static void main(String[] args) {
    List<String> list2 = new ArrayList<>();
    list2.add("one");
    list2.add("two");
    list2.add("three");
    list2.add("four");
    list2.add("five");
    list2.add("six");

    System.out.println("List values before insertion - " + list2);
    System.out.println("lis1 size before: " + list2.size());
    list2.add(3, "new value");
    System.out.println("List values after inserting the value 'new value' at index 3 - " + list2);
    System.out.println("lis1 size after: " + list2.size());

  }

}
