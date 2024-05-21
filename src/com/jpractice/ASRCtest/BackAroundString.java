package com.jpractice.ASRCtest;
/*
Given a string, take the last char and return a new string with the last char added
at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
public class BackAroundString {

  public static void main(String[] args) {
    //BackAroundString bas = new BackAroundString();
    String str = "!!Mee!!";
    System.out.println(backAround(str));
    //System.out.println(bas.backAround(str));

  }
  public static String backAround(String str) {
    String lastLetter = String.valueOf(str.charAt(str.length()-1));
    //String lastLetter = str.substring(str.length() - 1);
    return lastLetter + str + lastLetter;
  }

}
