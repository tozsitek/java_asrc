package tau.ch4_Loops;

import java.util.Scanner;

public class Cashier {
  public static void main(String[] args){
    System.out.println("Enter the number of items you would like to scan:");
    Scanner scanner = new Scanner(System.in);
    int quantity = scanner.nextInt();
    double total = 0;

    // loop to iterate through the items
    for(int i=0; i < quantity; i++){
      System.out.println("Enter the cost of the item:");
      double price = scanner.nextDouble();
      total = total + price;
    }
    scanner.close();
    System.out.println("The total is: " + total);
  }

}
