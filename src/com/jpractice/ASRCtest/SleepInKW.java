package com.jpractice.ASRCtest;

import java.io.IOException;
import java.util.Scanner;

public class SleepInKW {
  public static void main(String[] arg) throws InterruptedException, IOException {

    //Determine if it's a weekday
    System.out.println("Is today a weekday, true or false?");
    Scanner scanner = new Scanner(System.in);
    String weekday = scanner.next();
    scanner.close();
    boolean sleep = Boolean.parseBoolean(weekday);

    //Determine if you can sleep in
    if (sleep) {
      System.out.println("It's a weekday, can you sleep in? Answer: false");
    } else {
      System.out.println("It's a vacation day or weekend, can you sleep in? Answer: true");
    }
  }

}
