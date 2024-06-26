package jcg.ArrayListSamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdateSetIterateExample4 {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(4);
    list1.add(10);
    list1.add(24);
    list1.add(25);
    list1.add(5);
    list1.add(28);

    System.out.println("List values before insertion - " + list1);
    System.out.println("lis1 size before: " + list1.size());
    //list1.add(3, 333);
    for (int index = 0; index < list1.size(); index++){
      if (list1.get(index) % 5 == 0){
        list1.set(index, -1);
      }
    }
    System.out.println("List values after updating index 3 - " + list1);
    System.out.println("lis1 size after: " + list1.size());

  }

}
