package strings;

public class TestString {

	public static void main(String[] args) {
		String message = "    Welcome to Java!     ";
		System.out.println("length of message is  "+ message.length());
		String message2 = message.toUpperCase();
		String message3 = message.trim();
		System.out.println("message: |" + message + "|");
		System.out.println("message2: |" + message2 + "|");
		System.out.println("message3: |" + message3 + "|");
	}

}
