import java.util.Scanner;

public class Average
{
  public static void main (String [] args)
  {
    System.out.println("Enter three numbers to get their average");
    Scanner scan = new Scanner (System.in);
    double average;
    int n1 = scan.nextInt ();
    int n2 = scan.nextInt ();
    int n3 = scan.nextInt ();

    average = (double) (n1 + n2 + n3)/3;
    System.out.println("The average is: " + average);
  }
}
