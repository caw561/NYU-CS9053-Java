import java.util.Scanner;

public class SalesTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();
    
    double tax = purchaseAmount * 0.0875;
    System.out.println("first tax calc is  "+ tax);
    System.out.println("Sales tax is " + (int)(Math.ceil(tax) * 100) / 100.0);
  }
}
