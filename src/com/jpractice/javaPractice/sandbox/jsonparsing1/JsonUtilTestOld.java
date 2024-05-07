
package test;

//import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.jpractice.javaPractice.sandbox.jsonparsing1.DayPojo;
import com.jpractice.javaPractice.sandbox.jsonparsing1.JsonUtil;
import com.jpractice.javaPractice.sandbox.jsonparsing1.SimpleTestCaseJsonPOJO;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

class JsonUtilTestOld {
  private String simpleTestCaseJsonSource = "{\"title\": \"Code from scracth\",\n"
      + "  \"author\": \"Marianna\"\n}";
  private String DayScenario1 = "{\"date\": \"2024-12-25\",\n"
      + "  \"name\": \"Christmas Day\"\n}";

  @Test
  void parse() {
  }

  @Test
  void fromJson() {
  }

  @Test
  void toJson() {
    SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
    pojo.setTitle("Testing toJson");

    JsonNode node = JsonUtil.toJson(pojo);
    //assertEquals(node.get("title").asText(), "Testing toJson");
    Assert.assertEquals(node.get("title").asText(), "Testing toJson");
  }

  @Test
  void stringify() throws JsonProcessingException {
    SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
    pojo.setTitle("Testing 123");

    JsonNode node = JsonUtil.toJson(pojo);
    System.out.println(JsonUtil.stringify(node));
    System.out.println(JsonUtil.prettyPrint(node));
    Assert.assertEquals(node.get("title").asText(), "Testing toJson");
  }

  @Test
  void dayTestScenario1() throws IOException {
    JsonNode node = JsonUtil.parse(DayScenario1);
    DayPojo pojo = JsonUtil.fromJson(node, DayPojo.class);

    System.out.println("DATE: " + pojo.getDate());
    Assert.assertEquals("2024-12-25", pojo.getDate().toString());
  }

}

