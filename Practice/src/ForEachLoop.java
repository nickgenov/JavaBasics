import java.util.Scanner;


public class ForEachLoop {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();		
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}		
		for (int num : numbers) {
			System.out.print(num + " ");
		}	
		System.out.println();
		
		String [] days = {"Monday", "Tuesday", "Wednesday", 
				"Thursday", "Friday", "Saturday", "Sunday"};
		
		for (String day : days) {
			System.out.print(day + " ");
		}
		
		System.out.println();
		
		for (String day : days) {
			day = "change";
			System.out.print(day + " ");
		}
		
		System.out.println();
		
		for (String day : days) {
			System.out.print(day + " ");
		}
	}

}
