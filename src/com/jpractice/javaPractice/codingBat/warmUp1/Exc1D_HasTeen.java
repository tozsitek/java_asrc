package com.jpractice.javaPractice.codingBat.warmUp1;
import java.util.Scanner;

public class Exc1D_HasTeen {

  public static void main(String args[]) {

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
    */

    System.out.println("Enter first number");
    Scanner scanner = new Scanner(System.in);
    int firstNumber = scanner.nextInt();

    System.out.println("Enter second number");
    int secondNumber = scanner.nextInt();

    System.out.println("Enter third number");
    int thirdNumber = scanner.nextInt();
    scanner.close();

    decision(firstNumber,secondNumber,thirdNumber);

  }

  public static boolean decision(int a,int b,int c){
    if (numberType(a) == true || numberType(b) == true
        || numberType(c) == true) {
      System.out.println("true");
      return true;

    } else {
      System.out.println("false");
      return false;
    }
  }

    public static boolean numberType(int t){
      boolean teen;
      if (t>=13&&t<=19)
        teen = true;
      else
        teen = false;
      return teen;
    }

  }
