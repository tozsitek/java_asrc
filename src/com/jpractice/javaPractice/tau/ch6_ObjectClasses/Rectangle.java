package com.jpractice.javaPractice.tau.ch6_ObjectClasses;

public class Rectangle {
  private double length; // encapsulation, (private) no other code outside of this class can access it directly
  protected double width;  // other classes within the package can access it[

  //default constructor
  // no return type
  // name is the same as the class name
  public Rectangle(){
    length = 0;
    width = 0;
  }

  public Rectangle(double length, double width){
    //this.length = length;  // this will work as well
    setLength(length);
    //this.width = width;
    setWidth(width);
  }

  public double getLength(){
    return length;
  }
  public void setLength(double length){
    this.length = length;  // this.length is class variable, length is the method variable
  }

  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }

  public double calculatePerimeter(){
    return (2 * length) + (2 * width);
  }

  public double calculateArea(){
    return length * width;
  }

}
