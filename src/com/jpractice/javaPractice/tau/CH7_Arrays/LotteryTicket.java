package com.jpractice.javaPractice.tau.CH7_Arrays;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
  private static final int LENGTH = 6;
  private static final int MAX_TICKET_NUMBER = 69;
  public static void main(String[] args) {
    //int[] ticket = generateNumbers();
    //Arrays.sort(ticket);
    //printTicket(ticket);

    //System.out.println("\nBinary search");
    int[] ticket1 = generateNumbersBinary();
    printTicket(ticket1);
  }

  public static int[] generateNumbers(){
    int[] ticket = new int[LENGTH];
    Random random = new Random();
    for(int i=0; i < LENGTH; i++){
      /* Generate random number then search to make sure it does not already
         exist in the array.  If it does, regenerate.
       */
      int randomNumber;
      do{
        randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
      }while(search(ticket, randomNumber));
      ticket[i] = randomNumber;
    }
    // Number is unique if we get here. Add it to the array.
    return ticket;
  }

  public static int[] generateNumbersBinary(){
    int[] ticket = new int[LENGTH];
    Random random = new Random();
    for(int i=0; i < LENGTH; i++){
      /* Generate random number then search to make sure it does not already
         exist in the array.  If it does, regenerate.
       */
      int randomNumber;
      do{
        randomNumber = random.nextInt(MAX_TICKET_NUMBER)+1;
      }while(binarySearch(ticket, randomNumber));
      ticket[i] = randomNumber;
    }
    // Number is unique if we get here. Add it to the array.
    return ticket;
  }
  public static void printTicket(int[] ticket){
    for(int i=0; i<LENGTH; i++){
      System.out.print(ticket[i] + " | ");
    }
  }

  /**
   * Does sequential search on the array to find a value
   * @param array - Array to search through
   * @param numberToSearchFor - The value to search for
   * @return - true if found, false if not
   */
  public static boolean search(int[] array, int numberToSearchFor){
    //Enhanced loop.  Iterates through the entire array,
    // and each time assigns the current element to 'value'
    for(int value : array){
      if(value == numberToSearchFor){
        return true;
      }
    }
    return false;
  }

  public static boolean binarySearch(int[] array, int numberToSearchFor){
    // Array must be sorted first
    Arrays.sort(array);
    int index = Arrays.binarySearch(array, numberToSearchFor);
    if(index >= 0){
      return true;
    }else {
      return false;
    }
  }


}
