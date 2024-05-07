/*
package main.javaPractice.sandbox.jsonparsing1;

//import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class JsonUtilTest {

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
}

 */