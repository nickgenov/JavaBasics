import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();		
		String[] array = input.split(" ");
		
		String element = "";
		int maxLength = 0;
		int length = 1;
		
		for (int i = 0; i < array.length - 1; i++) {
			
			if (array[i].equals(array[i + 1])) {
				length++;
			}
			else {
				length = 1;
			}
			
			if (length > maxLength) {
				maxLength = length;
				element = array[i];
			}
		}
		
		for (int i = 0; i < maxLength; i++) {
			System.out.print(element + " ");
		}
		
		if (array.length == 1) {
			System.out.println(array[0]);
		}
	}
}
