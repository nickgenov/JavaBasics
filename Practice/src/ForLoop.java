import java.util.Scanner;


public class ForLoop {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		long factorial = 1;		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}		
		System.out.println(factorial);
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
	}

}
