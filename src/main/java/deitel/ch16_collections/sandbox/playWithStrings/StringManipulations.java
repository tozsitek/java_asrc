package deitel.ch16_collections.sandbox.playWithStrings;
import java.util.random.RandomGenerator;
import java.util.Random;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang.RandomStringUtils;



public class StringManipulations {

  public static void main(String[] args){
    String testStr = "myOmyHaha";
    String message = "Application TSP-001 is successfully created. Congratulation!";
    int n = 4;

    // Setup for missingChar
    //String newStr = missingChar(testStr,n);
    //System.out.println(testStr.charAt(n));
    //System.out.println(newStr);

    //countWords("Once upon a time.");
    //reverseString("Hello Marianna");
    //addSpaces("HeyTeam!It'sMarianna");
    findAppNum(message);

  }

  /**
   * Generate random nick name
   */
  public static void generateRandomNickName(){
    String prefix = "Fjord-";
    int length = 5;
    boolean useLetters = true;
    boolean useNumbers = false;
    // not a maven project, apache needs to be imported like in the automation project
    //String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
    //String test = RandomStringUtils.randomAlphabetic(5);

    //System.out.println("Generated String: " + prefix + generatedString + test);
  }

  /**
   * Find the app number in a string
   */
  public static String findAppNum(String message){
    String[] str = message.split(" ");
    String appNum = "";
    for ( String word : str){
      System.out.println("Word in loop: " + word);
      if ( word.startsWith("TSP")){
        appNum = word;
        break;
      }
    }
    System.out.println("Word after loop: " + appNum);
    return appNum;

  }

  /**
   * Add spaces before each uppercase letter
   * @param s jumbled text
   */
  private static void addSpaces(String s) {
    var modifiedText = new StringBuilder(s);
    for(int i=0; i<modifiedText.length(); i++){
      if(i !=0 && Character.isUpperCase(modifiedText.charAt(i))){
        modifiedText.insert(i, " ");
        i++;
      }
    }
    System.out.println(modifiedText);
  }

  public static String missingChar(String str, int n) {
    String newStr = str.substring(0,n)+str.substring(n+1);
    return newStr;
  }

  /**
   * Splits a String into an array by tokenizing it.
   * Counts words and prints them
   * @param text Full string to be split
   */
  public static void countWords(String text){
    var words = text.split(" ");
    int numberOfWords = words.length;

    String message = String.format("Your text contains %d words: ", numberOfWords);
    System.out.println(message);

    for(int i=0; i < numberOfWords; i++){
      System.out.println(words[i]);
    }
  }

  /**
   * Prints a String in a reverse order
   * @param text String to reverse
   */
  public static void reverseString(String text){
    for(int i=text.length()-1; i>=0; i--){
      System.out.print(text.charAt(i));
    }
  }

  //TODO: Validate the complexity of a proposed password by assuring it meets these rules:
  // at least 8 characters long
  // contains an uppercase letter
  // contain a special character
  // not contain the username
  // not the same as the old password

}
