import java.util.Scanner;

public class Coordinates
{
  public static void main (String [] args)
  {
    System.out.println("Enter two sets of cooridinates to get the distance");
    Scanner scan = new Scanner(System.in);
    double x;
    double y;
    double x2;
    double y2;

    x = scan.nextDouble();
    y = scan.nextDouble();
    x2 = scan.nextDouble();
    y2 = scan.nextDouble ();

    double xDifference;
    double yDifference;

    xDifference = (x2-x);
    yDifference = (y2-y);

    double xSquared;
    double ySquared;

    xSquared = Math.pow(xDifference,2);
    ySquared = Math.pow(yDifference,2);

    double allVariables;

    allVariables = xSquared + ySquared;

    double distance;
    distance = Math.sqrt(allVariables);
    System.out.println("The distance between the two coordinates is " + distance);

  }
}
