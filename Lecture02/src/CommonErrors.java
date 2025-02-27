import java.util.Scanner;

public class CommonErrors {

	public static void main(String[] args) {
		double interestRate = 0.05;
		double interest = interestRate*45;
		
		int value = 2147483647 + 1;
		System.out.println("value is " + value);
		System.out.println(1.0 - 0.1 -0.1 - 0.1 -0.1 - 0.1);
		System.out.println(1.0 -0.9);
		
		int number1 = 1;
		int number2 = 2;
		double average = (number1  + number2)/2;
		System.out.println(average);
		
		number1 = 1;
		number2 = 2;
		average = (number1 + number2) / 2.0;
		System.out.println(average);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int v1 = input.nextInt();
		System.out.println("v1 is " + v1);
		
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter a double value: ");
		double v2 = input1.nextDouble();
		System.out.println("v2 is " + v2);

	}
}
