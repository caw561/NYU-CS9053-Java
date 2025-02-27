package arrays;

public class TestArray {

	public static void main(String[] args) {
		int[] values = new int[5];
		for (int i=1;i<values.length;i++) {
			values[i] = i + values[i-1];
		}
		values[0] = values[1] + values[4];
		//System.out.println(values);
		for (int v : values) {
			System.out.println(v);
		}
	}

}
