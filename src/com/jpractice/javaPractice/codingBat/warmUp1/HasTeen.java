package com.jpractice.javaPractice.codingBat.warmUp1;
/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class HasTeen {

  public static void main(String[] args) {
    int a = 13;
    int b = 20;
    int c = 10;

    System.out.println("Has Teen: " + hasTeen(a,b,c));
  }
  public static boolean hasTeen(int a, int b, int c) {
    if(a >= 13 && a >= 19){
      return true;
    }else if(b >= 13 && b >= 19){
      return true;
    }else if(c >= 13 && c >= 19){
      return true;
    }else{
      return false;
    }
  }

  public static boolean hasTeenShortVersion(int a, int b, int c){
    return (a>=13 && a<=19) ||
        (b>=13 && b<=19) ||
        (c>=13 && c<=19);
  }

}
