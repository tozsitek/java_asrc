package com.jpractice.javaPractice.codingBat.warmUp1;

import java.util.Scanner;

public class Exc2D_FirstHalf {
  public static void main(String args[]){
    /*
    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
    firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */

    System.out.println("Enter an even length string:");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();

    int lengthOfString=string.length();
    int halfLengthOfString=lengthOfString / 2;

    int t;
    for (t=0;t<halfLengthOfString;t++){
      System.out.print(string.charAt(t));
    }
  }

}
