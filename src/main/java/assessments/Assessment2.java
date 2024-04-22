package assessments;
//What is the result of the following code
public class Assessment2 {

  public static void main(String[] args) {
    String s1 = "Java";
    String s2 = "Java";
    StringBuilder sb = new StringBuilder();
    sb.append("Ja").append("va");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(sb.toString() == s1);
    System.out.println(s1.toString().equals(s1));

    System.out.println("sb toString: " + sb.toString());
  }

}
