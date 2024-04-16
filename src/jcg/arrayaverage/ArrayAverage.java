package jcg.arrayaverage;

public class ArrayAverage {

  public static void main(String[] args) {
    //create an array
    int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};

    //getting array length
    int length = array.length;

    // default sum
    int sum = 0;

    //sum all values
    for(int i = 0; i < length; i++){
      sum += array[i];
    }

    double average = sum / length;
    System.out.println("Average is: " + average);

  }

}
