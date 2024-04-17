package jcg.ArrayListSamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToStringArraySamples {
  public static void main(String[] args) {
    List<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("one");
    listOfStrings.add("two");
    listOfStrings.add("three");
    listOfStrings.add("four");
    listOfStrings.add("five");
    listOfStrings.add("six");

    System.out.println("List values before insertion - " + listOfStrings);
    System.out.println("lis1 size before: " + listOfStrings.size());
    listOfStrings.add(3, "new value");
    System.out.println("List values after inserting the value 'new value' at index 3 - " + listOfStrings);
    System.out.println("lis1 size after: " + listOfStrings.size());

    // ArrayList to String with a loop
    String[] stringArray = new String[listOfStrings.size()];
    for (int i = 0; i < stringArray.length; i++){
      stringArray[i] = listOfStrings.get(i);
    }
    for (int i = 0; i < stringArray.length; i++){
      System.out.println("String value at index " +i+ " is " +stringArray[i]);
    }



  }

}
