package wrapperclasses;

public class WrapperExample {

	public static void main(String[] args) {
		Integer intWrapper = 5;
		Integer intWrapper2 = 15;
		Integer intval3 = 15;
		Integer result = intWrapper + intWrapper2;
		System.out.println(result);
		
		Integer int1 = 555;
		Integer int2 = 555;
		System.out.println(int1 == int2);
		System.out.println(int1.equals(int2));
		System.out.println(intWrapper2 == intval3);
	}

}
