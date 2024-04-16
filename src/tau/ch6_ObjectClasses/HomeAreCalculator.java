package tau.ch6_ObjectClasses;

public class HomeAreCalculator {

  public static void main(String[] args) {
    /****************
     *  RECTANGLE 1
     ***************/

    // Create an instance of Rectangle class
    // instantiate the Rectangle class
    Rectangle room1 = new Rectangle();
    room1.setWidth(20);
    room1.setLength(50);
    double areOfRoom1 = room1.calculateArea();

    /****************
     *  RECTANGLE 2
     ***************/
    Rectangle room2 = new Rectangle(30, 40);
    double areaOfRoom2 = room2.calculateArea();

    double totalArea = areOfRoom1 + areaOfRoom2;
    System.out.println("Area of both rooms: " + totalArea);

  }

}
