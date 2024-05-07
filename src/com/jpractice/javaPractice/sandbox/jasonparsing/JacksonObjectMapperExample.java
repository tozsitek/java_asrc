package com.jpractice.javaPractice.sandbox.jasonparsing;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
//import com.journaldev.jackson.model.Address;
//import com.journaldev.jackson.model.Employee;




public class JacksonObjectMapperExample {

  public static void main(String[] args) throws IOException {
    System.out.println(new File("").getAbsolutePath());
    // read json file data to String
    byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\marianna.fields\\sanbox\\javaPractice\\src\\com\\jpractice\\javaPractice\\sandbox\\jasonparsing\\employee.txt"));

    // create objectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();

    // convert json string to object
    Employee emp = objectMapper.readValue(jsonData, Employee.class);
    System.out.println("Employee object:\n" +emp);

    //Convert Object to json string
    Employee emp1 = createEmployee();
    //Configure Object mapper for pretty print
    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

    //writing to console, can write to any output stream such as file
    StringWriter stringEmp = new StringWriter();
    objectMapper.writeValue(stringEmp, emp1);
    System.out.println("Employee JSON is: \n"+stringEmp);


  }

  public static Employee createEmployee(){
    Employee emp = new Employee();
    emp.setId(100);
    emp.setName("David");
    emp.setPermanent(false);
    emp.setPhoneNumbers(new long[] {123456, 987654});
    emp.setRole("Manager");

    Address addr = new Address();
    addr.setCity("Bangalore");
    addr.setStreet("BTM 1st Stage Street");
    addr.setZipcode(11111);
    emp.setAddress(addr);

    List<String> cities = new ArrayList<String>();
    cities.add("Los Angeles");
    cities.add("New York");
    emp.setCities(cities);

    Map<String, String> props = new HashMap<String, String>();
    props.put("salary", "1000 Rs");
    props.put("age", "28 years");
    emp.setProperties(props);

    return emp;

  }

}
