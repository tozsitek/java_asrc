package deitel.ch7_arrayAndArrayList;

/**
 * Arrays are collections
 * It's a group of variables (elements,components) with the same type
 * They are objects, so they are reference types
 */
public class ArraySamples {

  public static void main(String[] args) {
    /*
    int[] a = {37, 22, 90, 40, 35,-3};
    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
    */

    //initArray();
    //sumArray();
    studentPoll();
  }

  public static void initArray(){
    final int LENGTH = 10;
    int[] array = new int[LENGTH];

    for (int i = 0; i < array.length; i++){
      array[i] = 2 + 2 * i;
    }

    for (int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
  }

  public static void sumArray(){
    int total = 0;
    int count = 0;
    final int LENGTH = 10;
    int[] array = new int[LENGTH];

    for (int i = 0; i < array.length; i++){
      array[i] = 2 + 2 * i;
    }
    for (int i = 0; i < array.length; i++){
      total = total + array[i];
      count += array[i];
    }
    System.out.println(total);
    System.out.println(count);
  }

  public static void studentPoll(){
    int[] responses = {2,5,4,3,5,2,1,3,3,1,4,14};
    int[] frequency = new int[6];

    for (int answer = 0; answer < responses.length; answer++){
      try{
        ++frequency[responses[answer]];
      }catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
        System.out.println("Error: " + answer + " " +responses[answer]);
      }
      for( int rating = 1; rating < frequency.length; rating++){
        System.out.println("Rating and Frequency: " + rating + " " + frequency[rating]);
      }

    }
  }

}
