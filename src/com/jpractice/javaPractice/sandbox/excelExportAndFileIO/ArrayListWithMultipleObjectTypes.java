package com.jpractice.javaPractice.sandbox.excelExportAndFileIO;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListWithMultipleObjectTypes {
  public static void main(String[] args)
  {

    // Creating an ArrayList of Object type
    ArrayList<Object> arr = new ArrayList<Object>();

    // Inserting String value in arr
    arr.add("Test String");

    // Inserting Integer value in arr
    arr.add(14);

    // Inserting Long value in arr
    arr.add(1800L);

    // Inserting Double value in arr
    arr.add(6.0D);

    // Inserting Float value in arr
    arr.add(1.99F);

    // Inserting date values
    arr.add(new Date(05/24/2024));

    // arr after all insertions: ["Test String", 14,
    // 1800L, 6.0D, 1.99F]

    System.out.print(
        "ArrayList after all insertions: ");
    display(arr);

    // Replacing element at index 0 (i.e. an String)
    // with an Integer type value 50
    arr.set(0, 50);

    // Replacing element at index 1 (Integer value)
    // with a Double type value
    arr.set(1, 10.0D);

    // arr after modifications: [50, 10.0D,
    // 1800L, 6.0D, 1.99F]

    System.out.print("ArrayList after modifications: ");

    display(arr);
  }

  // Function to display elements of the ArrayList
  public static void display(ArrayList<Object> arr)
  {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + ", ");
    }
    System.out.println();
  }
}
