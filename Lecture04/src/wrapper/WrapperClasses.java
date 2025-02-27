package wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		int i = 8;
		Integer myInteger;
		myInteger = new Integer(5);
		myInteger = 15;
		Integer[] intArray = {i, myInteger, 34, 88, 27 };
		Integer newInt = myInteger + 66;
		System.out.println("newInt is  "+ newInt);
		String myArg = "55";
		//int j = Integer.parseInt(myArg);
		byte b = newInt.byteValue();
		
		Integer g = 55;
		Integer h = 55;
		System.out.println("g == h ? " + (g == h));
		Integer j = 555;
		Integer k = 555;
		System.out.println("j == k ? " + (j == k));
		
		String s = "55 892 547 23 5 43";
		String[] numbers = s.split(" ");
		Integer[] myInts = new Integer[5];
		
	}
	

}
