package deitel.ch3_classesObjectsMethods;

import java.util.Scanner;

public class AccountTest {

  public static void main(String[] args) {
    Account account1 = new Account("Jane Green", 50000);
    Account account2 = new Account("John Blue", -7.53);

    System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

    Scanner input = new Scanner(System.in);
    System.out.print("Enter deposit amount for account1: ");
    double depositAmount = input.nextDouble();
    System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
    account1.deposit(depositAmount);

    //display balance
    System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

    System.out.print("Enter deposit amount for account2: ");
    double depositAmount2 = input.nextDouble();
    System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount2);
    account2.deposit(depositAmount2);

    System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

  }

}
