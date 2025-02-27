import java.util.Scanner;

public class LetterPyramid {

	public static String generatePyramid(int rows) {
		String pyramid = "";
		for(int i = 0; i<rows; i++) {
			char ch = 'A';
			int spaces = rows - i;
			
			for(int j = 0; j<spaces; j++) {
				pyramid += ' ';
			}
			for(int k = 0; k<=i; k++) {
				pyramid += ch;
				ch++;
			}
			ch -= 2;
			for(int l = 0; l<i; l++) {
				pyramid += ch;
				ch--;
			}
			pyramid += "\n";
		}
			
		return pyramid;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows = scanner.nextInt();
		
		String pyramid = generatePyramid(rows);
		System.out.print(pyramid);
	}

}
