package com.jpractice.javaPractice.codingBat.warmUp1;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
mixStart("mix") -> true
mixStart("ix") -> false
 */
public class mixStart0605 {

  public static void main(String[] args) {
    String str = "mix mix it is";
    System.out.println("Mix start: " + mixStart(str));
    System.out.println("Mix match: " + mixMatch(str));
  }

  public static boolean mixStart(String str) {
    if(str.length() < 3) return false;
    String followedBy = str.substring(1,3);
    if (followedBy.equalsIgnoreCase("ix")){
      return true;
    } else return false;

    }

  public static boolean mixMatch(String str){
    if(str.length() < 3) return false;
    if(str.toLowerCase().matches("^[a-z]ix.*$") || str.matches("^[0-9]ix.*$")){
      return true;
    }else return false;
  }

}
