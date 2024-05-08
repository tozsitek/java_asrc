package com.jpractice.javaPractice.sandbox.jsonparsing1;

//import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonUtilTestJU4 {

  JsonUtil JsonUtil = new JsonUtil();
  DayPojo DayPojo = new DayPojo();
  private String simpleTestCaseJsonSource = "{\"title\": \"Code from scracth\",\n"
      + "  \"author\": \"Marianna\"\n}";
  private String DayScenario1 = "{\"date\": \"2024-12-25\",\n"
      + "  \"name\": \"Christmas Day\"\n}";
  @Test
  public void parse() {
  }

  @Test
  public void fromJson() {
  }

  @Test
  public void toJson() {
    SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
    pojo.setTitle("Testing toJson");

    JsonNode node = JsonUtil.toJson(pojo);
    //assertEquals(node.get("title").asText(), "Testing toJson");
    Assert.assertEquals(node.get("title").asText(), "Testing toJson");
  }

  @Test
  public void prettyPrint() {
  }

  @Test
  public void stringify() throws JsonProcessingException {
    SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
    pojo.setTitle("Testing 123");

    JsonNode node = JsonUtil.toJson(pojo);
    System.out.println(JsonUtil.stringify(node));
    System.out.println(JsonUtil.prettyPrint(node));
    Assert.assertEquals(node.get("title").asText(), "Testing toJson");
  }

  @Test
  public void dayTestScenario1() throws IOException {
    JsonNode node = JsonUtil.parse(DayScenario1);
    DayPojo pojo = JsonUtil.fromJson(node, DayPojo.class);

    System.out.println("DATE: " + pojo.getDate());
    Assert.assertEquals("2024-12-25", pojo.getDate().toString());
  }
}