package com.jpractice.ASRCtest;

public class SleepIn {

  public static void main(String[] args) {
    boolean weekday = true;
    boolean vacation = true;

    System.out.println("Sleep in true or false? " + sleepIn(weekday, vacation));
  }

  public static boolean sleepIn(boolean weekday, boolean vacation){
    if(!weekday || vacation){
      return true;
    }else{
      return false;
    }
  }

}
