import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

	System.out.println("number % 5 == 0 is " +
			(number % 5 == 0));
    if (number % 5 == 0) {
    	System.out.println("HiFive");
    }

    if (number % 2 == 0) System.out.println("HiEven");
    
    int i=1, j=2, k=3;
    if (i>j) {
    	if (i >k) System.out.println("A");
    } else 
    	System.out.println("B");

  }
}
