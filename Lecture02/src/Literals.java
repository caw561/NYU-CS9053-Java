
public class Literals {

	public static void main(String[] args) {
		System.out.println(1.0 - 0.5);
		
		double interestRate = 0.05;
		double interest = interestRate*45;
		
		System.out.println(1.0 - 0.1 -0.1 -0.1 -0.1 -0.1);
		System.out.println("2^3 = " + Math.pow(2, 3));
		System.out.println("Pi = " + Math.PI);
		byte b = 127;
		int intLiteral = 2147483647;
		long longLiteral = 2147483648L;
		double doubleLiteral = 1.23456e2d;
		float myFloat = 1.23456e2F;
		
		System.out.println(intLiteral + 10);
		
		System.out.println("(1<2) ? " + (1<2));
	}
}
