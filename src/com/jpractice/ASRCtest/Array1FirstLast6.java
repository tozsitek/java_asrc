package com.jpractice.ASRCtest;

public class Array1FirstLast6 {

  public static void main(String[] args) {
    int[] nums = {1,2,6};
    System.out.println("The first or last number is 6: " + firstLast6(nums));
  }
  public static boolean firstLast6(int[] nums) {
    if(nums[0] == 6 || nums[nums.length-1] == 6){
      return true;
    } else {
      return false;
    }
  }

}
