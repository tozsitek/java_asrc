package com.jpractice.javaPractice.codingBat.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LoopVsLambda {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(6);
    nums.add(12);
    nums.add(-1);

    System.out.println("My original nums are: " + nums.toString());
    System.out.println("My Labmda doubling nums are: " + doublingLambda(nums).toString());
    System.out.println("My Loop doubling nums are: " + doublingLoop(nums).toString());
    System.out.println("My Stream doubling nums are: " + doublingStream(nums).toString());
    System.out.println("My noNegLambda nums are: " + noNegLambda(nums).toString());
    System.out.println("My noNegStream nums are: " + noNegStream(nums).toString());
  }

  public static List<Integer> doublingLambda(List<Integer> nums) {
    nums.replaceAll(n -> n * 2);
    return nums;
  }

  public static List<Integer> doublingLoop(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer n:nums) {
      result.add(n * 2);
    }
    return result;
  }

  public static List<Integer> doublingStream(List<Integer> nums) {
    return nums.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
  }

  public static List<Integer> noNegLambda(List<Integer> nums) {
    nums.removeIf(n -> n < 0);
    return nums;
  }

  public static List<Integer> noNegStream(List<Integer> nums) {
    return nums.stream()
        .filter(n -> n >= 0)
        .collect(Collectors.toList());
  }

}
