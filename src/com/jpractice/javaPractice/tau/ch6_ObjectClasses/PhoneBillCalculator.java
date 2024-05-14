package com.jpractice.javaPractice.tau.ch6_ObjectClasses;

public class PhoneBillCalculator {
  public static void main(String args[]){
    PhoneBill bill = new PhoneBill(123456);
    bill.setMinutesUsed(1000);
    bill.printItemizedBill();
  }
}
