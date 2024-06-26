package com.jpractice.ASRCtest;
/*
Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class StartsWithHiString {

  public static void main(String[] args) {
    String s1 = "hi there";
    System.out.println("Starts with hi: " + startHi(s1));
  }
  public static boolean startHi(String str) {
    return str.startsWith("hi");
  }

}
