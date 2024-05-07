package com.jpractice.ASRCtest;

public class Test {

  public static void main(String[] args) {
    int grade = 60;

    if(grade > 99){
      System.out.println("Passed");
    }else{
      System.out.println("Failed");
    }

    //Conditional operator
    System.out.println(grade > 60 ? "passed" : "failed");
  }


}
