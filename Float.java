import java.util.Scanner;
import java.text.DecimalFormat;

public class Float
{
  public static void main (String [] args)
  {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat ("0.##");
    System.out.println("Enter the first number");
    double n1 = scan.nextDouble();
    System.out.println("Enter the second number");
    double n2 = scan.nextDouble();

    double sum;
    double difference;
    double product;
    double quotient;

    sum = n1 + n2;
    difference = n1 - n2;
    product = n1*n2;
    quotient = n1/n2;

    System.out.println("Sum is " + fmt.format(sum));
    System.out.println("Difference is " + fmt.format(difference));
    System.out.println("Product is " + fmt.format(product));
    System.out.println("Quotient is " + fmt.format(quotient));
  }
}
