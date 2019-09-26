import java.util.Scanner;

public class Time
{
  public static void main (String [] args)
  {
    final int SECONDSINHOURS = 3600;
    final int SECONDSINMINUTES = 60;

    Scanner scan = new Scanner(System.in);
    int totalSeconds;
    System.out.println("Enter a number of hours");
    int hours = scan.nextInt();

    System.out.println("Enter a number of minutes");
    int minutes = scan.nextInt();

    System.out.println("Enter a number of seconds");
    int seconds = scan.nextInt();

    totalSeconds = (hours*SECONDSINHOURS)+(minutes*SECONDSINMINUTES)+(seconds);
    System.out.println("The total seconds is " + totalSeconds);
  }
}
