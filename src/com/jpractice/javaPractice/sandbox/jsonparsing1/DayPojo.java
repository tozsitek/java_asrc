package com.jpractice.javaPractice.sandbox.jsonparsing1;

//import java.util.Date;
import java.time.*;

public class DayPojo {
  private String name;
  //private Date date;
  private LocalDate date;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
