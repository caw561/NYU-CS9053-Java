import java.util.Arrays;

public class MaximumSubarray {

	public static int[] maxSubarray(int[] arr) {
		int maxSum = arr[0];
        int currentSum = arr[0];
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i]; 
                tempStart = i;
            } else {
                currentSum += arr[i]; 
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }
        
        int[] resultArr = Arrays.copyOfRange(arr, start, end + 1);
		return resultArr;
	}
	public static void main(String[] args) {
		int[] testArray = {-2,1,-3,4,-1,2,1,-5,4};
		int[] maxSubArr = maxSubarray(testArray);
		
		System.out.println(Arrays.toString(maxSubArr));
	}

}
