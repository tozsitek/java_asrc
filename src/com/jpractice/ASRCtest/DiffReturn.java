package com.jpractice.ASRCtest;

import static java.lang.Math.abs;

public class DiffReturn {

  public static void main(String[] args) {
    int n = -21;
    System.out.println("The difference is: " + diffReturn(n));
  }

  public static int diffReturn(int n) {
    if (n <= 21) {
      return (21 - n);
    } else {
      return (n - 21) * 2;
    }
  }
}
