import java.util.Scanner;


public class Exceptions2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		String str = new Scanner(System.in).nextLine();
		
		try {
			int num = Integer.parseInt(str);
			System.out.printf("Valid integer: %d", num);
		} catch (NumberFormatException numEx) {
			System.out.println("Invalid integer: " + numEx);
		}
		

	}

}
