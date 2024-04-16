package testStrings;

public class CreateLargeStringWithSpace {

  public static void main(String[] args) {
    StringBuilder text = new StringBuilder();
    int numOfElementText = 1000;

    for (int i = 1; i <= numOfElementText; i++) {
      if (i%10 == 0) {
        text.append("  ");
      } else {
        text.append("a");
      }
      //text.append("a");
    }
  System.out.println(text.toString());
  }
}
