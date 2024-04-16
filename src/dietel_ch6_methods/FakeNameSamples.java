package dietel_ch6_methods;

import java.util.Random;
import java.util.UUID;

public class FakeNameSamples {

  public static void main(String[] args){
    String name = getRandomName();
    System.out.println("Random name is: " + name );
    System.out.println("Random last name is: " + getRandomFullName());

  }
  public static String getRandomName(){
    String random = UUID.randomUUID().toString();
    int desiredLength = 6;
    String randomName = UUID.randomUUID().toString().substring(0, desiredLength);
    //return randomName;
    return random;
  }

  public static String getRandomFullName(){
    Random random = new Random();
    String FIRST_NAME = "UItester ";
    String[] LAST_NAMES = {
        "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Fields",
        "Davis", "Rodriguez", "Washington"
    };

    int index = random.nextInt(LAST_NAMES.length);
    return FIRST_NAME + LAST_NAMES[index];
  }

}
