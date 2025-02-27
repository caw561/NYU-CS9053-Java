import java.util.Scanner; 

public class SentinelValue {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    
    int data = 0;/// = input.nextInt();

    // Keep reading data until the input is 0
    int sum = 0;
    do {
      sum += data;

      // Read the next data
      System.out.print(
        "Enter an integer (the input ends if it is 0): ");
      data = input.nextInt();
    } while (data != 0);

    System.out.println("The sum is " + sum);
  }
}
