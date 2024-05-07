package com.jpractice.javaPractice.sandbox.jsonparsing1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;

public class JsonUtil {
  //private static ObjectMapper objectMapper = new ObjectMapper();
  private static ObjectMapper objectMapper = getDefaultObjectMapper();

  private static ObjectMapper getDefaultObjectMapper(){
    ObjectMapper defaultObjectMapper = new ObjectMapper();
    defaultObjectMapper.registerModule(new JavaTimeModule());
    defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return defaultObjectMapper;
  }

  //json node is part of the jackson library, base class to represent the tree mapping of the json object
  public static JsonNode parse(String src) throws IOException {
    return objectMapper.readTree(src);
  }

  public static <A> A fromJson(JsonNode node, Class<A> clazz) throws JsonProcessingException {
    return objectMapper.treeToValue(node, clazz);
  }

  public static JsonNode toJson(Object a){
    return objectMapper.valueToTree(a);
  }

  public static String stringify(JsonNode node) throws JsonProcessingException {
    //ObjectWriter objectWriter = objectMapper.writer();
    //return objectWriter.writeValueAsString(node);
    return generateString(node, false);
  }

  public static String prettyPrint(JsonNode node) throws JsonProcessingException {
    //ObjectWriter objectWriter = objectMapper.writer();
    //objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
    //return objectWriter.writeValueAsString(node);
    return generateString(node, true);
  }

  private static String generateString(JsonNode node, boolean pretty) throws JsonProcessingException {
    ObjectWriter objectWriter = objectMapper.writer();
    if(pretty)
      objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
    return objectWriter.writeValueAsString(node);
  }
}
