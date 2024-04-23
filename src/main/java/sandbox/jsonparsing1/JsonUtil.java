package sandbox.jsonparsing1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonUtil {
  //private static ObjectMapper objectMapper = new ObjectMapper();
  private static ObjectMapper objectMapper = getDefaultObjectMapper();

  private static ObjectMapper getDefaultObjectMapper(){
    ObjectMapper defaultObjectMapper = new ObjectMapper();
    return defaultObjectMapper;
  }

  //json node is part of the jackson library, base class to represent the tree mapping of the json object
  public static JsonNode parse(String src) throws IOException {
    return objectMapper.readTree(src);
  }


}
