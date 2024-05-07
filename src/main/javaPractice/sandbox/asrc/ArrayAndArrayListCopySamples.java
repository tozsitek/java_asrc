package main.javaPractice.sandbox.asrc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayListCopySamples {

  public static void main(String[] args) {
    // Normal Approach
    // ***************************
    List<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("string one");
    listOfStrings.add("string two");
    listOfStrings.add("string three");
    listOfStrings.add("string four");
    listOfStrings.add("string five");

    String[] stringArray = new String[listOfStrings.size()];
    //adding list values to ArrayList
    for(int i=0; i < listOfStrings.size(); i++){
      stringArray[i] = listOfStrings.get(i);
    }
    // print the value of Array
    for(int i=0; i < stringArray.length; i++){
      System.out.println("String value at index: " +i+ " is: " +stringArray[i]);
    }


    // Using List.toArray() method
    // ***********************************************************
    String[] stringArray2 = listOfStrings.toArray(new String[listOfStrings.size()]);
    System.out.println("Using toArray method");
    for(int i=0; i < stringArray2.length; i++){
      System.out.println("String value at index: " +i+ " is: " +stringArray2[i]);
    }


    // Using Stream.toArray() method
    // **************************************************************
    //Using stream API toArray() method and passing the String array object with method reference
    String[] stringArray3= listOfStrings.stream().toArray(String[]::new);
    System.out.println("Using Stream.toArray() method");
    for(int i=0; i < stringArray3.length; i++){
      System.out.println("String value at index: " +i+ " is: " +stringArray3[i]);
    }

    // Using Arrays.copyof() method
    // **************************************************************
    List<String> arrayList = new ArrayList<>(listOfStrings);
    Object[] objectList = arrayList.toArray();
    String[] stringArray4 = Arrays.copyOf(objectList, objectList.length,String[].class);
    String[] stringArray5 = listOfStrings.toArray(new String[listOfStrings.size()]);

    System.out.println("Using Arrays.copyof() method");
    for(int i=0; i < stringArray4.length; i++){
      System.out.println("String value at index: " +i+ " is: " +stringArray4[i]);
    }

  }




}
