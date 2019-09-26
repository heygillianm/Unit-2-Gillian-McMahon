import java.util.Scanner;
import java.text.DecimalFormat;

//authors: gillian mcmahon and ian brinkley
public class StoreCopy{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat ("0.##");

    //constants
    final int BOOKPRICE = 9;
    final double MOVIEPRICE = 13.97;
    final double PEANUTPRICE = 1.72;

    //calculating a fake date so we can lie on our tax forms
    final int DAY = (int)(Math.random()*28);
    final int MONTH = (int)(Math.random()*12);
    final int YEAR = 2019;
    final int SECONDS = (int)(Math.random()*60);
    final int MINUTES = (int)(Math.random()*60);
    final int HOURS = (int)(Math.random()*24);

    System.out.println("Welcome to Steve's S-Mart! tm");
    System.out.println("Books: $9 each | Movies: $13.97 each | Peanuts: $1.72 per pound");
    //getting input from user
    System.out.println("How many books would you like to buy?");
    int books = scan.nextInt();
    System.out.println("How many movies would you like to buy?");
    int movies = scan.nextInt();
    System.out.println("Finally, how many pounds of peanuts would you like to buy?");
    double peanuts = scan.nextDouble();

    //calculating subtotal
    int bookSub = BOOKPRICE * books;
    double movieSub = MOVIEPRICE * movies;
    double peanutSub = PEANUTPRICE * peanuts;

    double subTotal = (bookSub + movieSub + peanutSub);

    //calculating shipping cost
    final double BOOKSHIPPING = books*0.95;
    final double MOVIESHIPPING = movieSub*0.04;
    final double PEANUTSHIPPING = peanuts*0.3;

    //calculating taxes after shipping
    final double BOOKTAXES = bookSub * 0.072;
    final double MOVIETAXES = movieSub * 0.072;

    //final charges
    final double SHIPPINGTOTAL = BOOKSHIPPING + MOVIESHIPPING + PEANUTSHIPPING;
    final double TAXESTOTAL = BOOKTAXES + MOVIETAXES;
    final double GRANDTOTAL = subTotal + SHIPPINGTOTAL + TAXESTOTAL;

    //final e-receipt
    System.out.println("__________________");
    System.out.println("| STEVE\'S S-MART |");
    System.out.println("******************");
    System.out.println("4877 West C St.");
    System.out.println("West Linn, OR 97068");
    System.out.println("Date: " + MONTH + "/" + DAY + "/" + YEAR);
    System.out.println("Time: " + HOURS + ":" + MINUTES + ":" + SECONDS);
    System.out.println("Cashier: jef");
    System.out.println("");
    //number of purchases and price
    System.out.println("---------------------------------");
    System.out.println("Books: " + books + " ---- $" + fmt.format(bookSub));
    System.out.println("Movies: " + movies + " ---- $" + fmt.format(movieSub));
    System.out.println("Pounds of peanuts: " + peanuts + " ---- $" + fmt.format(peanutSub));
    System.out.println("---------------------------------");
    //final calculations
    System.out.println("Subtotal: $" + fmt.format(subTotal));
    System.out.println("");
    System.out.println("Shipping charge: $" + fmt.format(SHIPPINGTOTAL));
    System.out.println("Taxes: $" + fmt.format(TAXESTOTAL));
    System.out.println("Grand Total: $" + fmt.format(GRANDTOTAL));
    System.out.println("");
    System.out.println("");
    //thank you to customer
    System.out.println("^-----------------------------^");
    System.out.println("Thank you for shopping with us!");
    System.out.println("^-----------------------------^");
  }
}
