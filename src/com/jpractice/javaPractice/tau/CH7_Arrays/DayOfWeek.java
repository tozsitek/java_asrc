package com.jpractice.javaPractice.tau.CH7_Arrays;

import java.util.Scanner;

public class DayOfWeek {
  public static void main(String args[]){
    String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number for the day of the week");
    int index = input.nextInt();
    input.close();

    System.out.println("Corresponding day: " + week[index - 1]);
  }

}
