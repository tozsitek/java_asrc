package com.jpractice.javaPractice.tau.ch6_ObjectClasses;

public class MonthConverter {
  private static Month month = new Month();
  public static void main(String[] args) {
    System.out.println(month.getMonth(2));
    System.out.println(Month.getMonth("January"));
  }
}
