import java.util.Scanner;


public class _07_CountBitsOne {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int value = number;
		int oneBitsCount = 0;
		
		while (value > 0) {
			int remainder = value % 2;
			value /= 2;
			if (remainder == 1) {
				oneBitsCount++;
			}
		}
		
		System.out.println(oneBitsCount);		
	}

}
