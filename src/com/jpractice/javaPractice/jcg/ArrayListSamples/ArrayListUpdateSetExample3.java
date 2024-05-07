package jcg.ArrayListSamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdateSetExample3 {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);
    list1.add(30);
    list1.add(40);
    list1.add(50);
    list1.add(60);

    System.out.println("List values before insertion - " + list1);
    System.out.println("lis1 size before: " + list1.size());
    list1.set(3, 333);
    System.out.println("List values after replacing the value at index 3 - " + list1);
    System.out.println("lis1 size after: " + list1.size());

  }

}
