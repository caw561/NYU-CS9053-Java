package numbers;

import java.util.ArrayList;
import java.util.Arrays;

import shapes.Circle;

public class StringLists {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>(
				Arrays.asList("Dean", "Maria", "Ivan", "Constantine"));
		//strList.add(new Circle(5));
		strList.sort(null);
		System.out.println("sorted string are : \n" + strList);
	}

}
