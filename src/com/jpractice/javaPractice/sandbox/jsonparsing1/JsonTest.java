package com.jpractice.javaPractice.sandbox.jsonparsing1;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;



public class JsonTest {

  public static void main(String[] args) throws IOException {
    String jsonSource = "{\"title\":\"Marianna's json parsing\"}";
    try{
      JsonNode node = JsonUtil.parse(jsonSource);
      System.out.println("Title: " + node.get("title").asText());
    }catch(IOException e){
      e.printStackTrace();
    }

    try {
      JsonNode node = JsonUtil.parse(jsonSource);
      SimpleTestCaseJsonPOJO pojo = JsonUtil.fromJson(node, SimpleTestCaseJsonPOJO.class);
      System.out.println("POJO title: " + pojo.getTitle());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }

}
