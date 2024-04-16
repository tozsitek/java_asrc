package QAAllHands;

public class FindMinimum {

  public static void main(String[] args) {
    int[] num1 = {4,2,1,-1,0};
    int[] num2 = {};

    System.out.println("Array with members.");
    findMinimum(num1);
    System.out.println("Empty array");
    findMinimum(num2);


  }

  public static int findMinimum(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Array cannot be null or empty");
    }

    int min = numbers[0];
    for (int number : numbers) {
      if (number < min) {
        min = number;
      }
    }
    System.out.println(min);
    return min;
  }
}
