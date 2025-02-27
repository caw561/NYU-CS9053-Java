package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class InitializeArray {

	public static void modifyVarAndArray(int k, 
			int[] myList) {
		k = 54;
		myList[3] = 99;
		System.out.println("k is " + k);

		for (int i=0;i<myList.length;i++) {
			System.out.println("myList["+i+"] = " +
					myList[i]);;
		}
	}
	
	public static void main(String[] args) {
		int[] myArray = new int[100];
		int[] array2 = new int[100];
		int[] array3 = {5, 7, 9, 3};
		
		for (int i=0; i < myArray.length; i++) {
			myArray[i] = (int)(Math.random()*100);
		}
		System.out.println("my array before sorting:  "+ Arrays.toString(myArray));
		Arrays.sort(myArray);
		System.out.println("my array after sorting:  "+ Arrays.toString(myArray));
		
		
		int myInt = 10;
		
		for (int i=0;i<array3.length;i++) {
			System.out.println("array3["+i+"] = " +
					array3[i]);;
		}
		modifyVarAndArray(myInt, array3);

		for (int i=0;i<array3.length;i++) {
			System.out.println("array3["+i+"] = " +
					array3[i]);;
		}
		System.out.println("myInt is " + myInt);
	}

}
