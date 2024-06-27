package com.jpractice.javaPractice.codingBat.warmUp1;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix"
all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
mixStart("mix") -> true
mixStart("ix") -> false
mixStart("mmmmix") -> false
 */
public class mixStart0605 {

  public static void main(String[] args) {
    String str = "mmmix";

    System.out.println("Mix char:" + mixChar(str));
    System.out.println("Mix subString: " + mixSubString(str));
    System.out.println("Mix regex: " + mixMatch(str));
    System.out.println("Mix contains: " + mixContains(str));
  }

  public static boolean mixChar(String str) {
    //return(str.charAt(1) == 'i' && str.charAt(2) == 'x');
    if(str.charAt(1) == 'i' && str.charAt(2) == 'x'){
      return true;
    }else return false;
  }
  public static boolean mixSubString(String str) {
    if(str.length() < 3) return false;
    String followedBy = str.substring(1,3);
    /*
    if (followedBy.equalsIgnoreCase("ix")){
      return true;
    } else return false;
    */
    return (followedBy.equalsIgnoreCase("ix"));
  }

  public static boolean mixMatch(String str){
    //if(str.length() < 3) return false;
    return(str.toLowerCase().matches("^.ix.*$"));
  }

  //Keith
  public static boolean mixContains(String str){
    return(str.contains("ix") && str.length() > 2);
  }

}
