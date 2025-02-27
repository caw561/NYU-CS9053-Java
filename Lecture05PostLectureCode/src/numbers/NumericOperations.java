package numbers;

import java.util.*;

public class NumericOperations {

	public static double calculateMean(List<? extends Number> nums) {
		
		Double sum = 0.0;
		for (Number num : nums) {
			sum += num.doubleValue();
		}
		return sum/nums.size();
	}
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Number> nums = new ArrayList<>();
		for (int i=0;i<10;i++) {
			int tst = rand.nextInt(3);
			Number num;
			if (tst == 0) {
				num = rand.nextInt();
			} else if (tst ==1 ) {
				num = rand.nextDouble()*Integer.MAX_VALUE;
			} else {
				num = rand.nextLong();
			}

			nums.add(num);
			
		}
		double mean = calculateMean(nums);
		/*System.out.println("mean of " + nums + " is:");
		System.out.println(mean);
		*/

		ArrayList<Integer> myIntegers = new ArrayList<>();
		for (int i=0;i<10;i++) {
			
			myIntegers.add(rand.nextInt());
		}
		System.out.println("myIntegers is " + myIntegers);
		myIntegers.sort(null);
		System.out.println("after sorting myIntegers is \n" + myIntegers);
		
		mean = calculateMean(myIntegers);
		System.out.println("mean of " + myIntegers + " is:");
		System.out.println(mean);
		
	}

}
