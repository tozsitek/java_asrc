package com.jpractice.ASRCtest;

public class MissingChar {

  public static void main(String[] args) {
    String str = "kitten";
    int n = 4;
    System.out.println("String w missing character: " + missingChar(str, n));
  }
  public static String missingChar(String str, int n) {
    //String newStr = str.substring(0,n) + str.substring(n+1, str.length());
    String newStr = str.substring(0,n) + str.substring(n+1);
    return newStr;
  }

}
