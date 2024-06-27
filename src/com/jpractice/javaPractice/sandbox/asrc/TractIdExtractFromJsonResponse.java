package com.jpractice.javaPractice.sandbox.asrc;

public class TractIdExtractFromJsonResponse {

  public static void main(String[] args) {
    String response = "{\"tractId\":291}";
    String tractId = response.substring(response.indexOf(":") + 1, response.indexOf("}"));
    System.out.println("tractId: " + tractId);
  }

}
