import java.util.Locale;
import java.util.Scanner;


public class ConsoleInput {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.nextLine();
		String str = scan.nextLine();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str);
	
	}

}
