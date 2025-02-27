import java.util.Arrays;

public class RotateMatrix {

	public static int[][] rotatedMatrix(int[][] args) {
		int height = args.length;
		int width = args[1].length;
		int[][] resultMatrix = new int[width][height];
		
		for(int i = 0; i<width; i++) {
			for(int j = 0; j<height; j++) {
				resultMatrix[i][j] = args[(height-1-j)][i];
			}
		}
		return resultMatrix;
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};
		int[][] matrix2 = {
			    {1, 2, 3, 4},
			    {5, 6, 7, 8},
			    {9, 10, 11, 12}
			};
		int[][] matrix3 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9},
			    {10, 11, 12}
		};
		
		int[][] newMatrix1 = rotatedMatrix(matrix);
		int[][] newMatrix2 = rotatedMatrix(matrix2);
		int[][] newMatrix3 = rotatedMatrix(matrix3);
		
		System.out.println(Arrays.deepToString(newMatrix1));
		System.out.println(Arrays.deepToString(newMatrix2));
		System.out.println(Arrays.deepToString(newMatrix3));
	}

}
