package main.ASRCtest;

public class SleepIn {

  public static void main(String[] args) {
    boolean weekday = true;
    boolean vacation = false;

    System.out.println("Sleep in or not? " + sleepIn(weekday, vacation));
  }

  public static boolean sleepIn(boolean weekday, boolean vacation){
    if(!weekday || vacation){
      return true;
    }else{
      return false;
    }
  }

}
