package sandbox.jsonparsing1;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class JsonTest {

  public static void main(String[] args) {
    String jsonSource = "{\"title\":\"Marianna's json parsing\"}";
    try{
      JsonNode node = JsonUtil.parse(jsonSource);
      System.out.println("Title: " + node.get("title").asText());
    }catch(IOException e){
      e.printStackTrace();
    }

  }

}
