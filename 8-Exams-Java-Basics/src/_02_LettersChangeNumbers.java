import java.util.ArrayList;
import java.util.Scanner;


public class _02_LettersChangeNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the input string and split it
		String[] input = scan.nextLine().trim().split("\\s+");
		ArrayList<String> values = new ArrayList<>();
		
		//add its values to a list
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("") == false) {
				values.add(input[i]);
			}
		}
		
		//calculate the sum
		double sum = 0;
		for (String value : values) {
			
			char firstLetter = value.charAt(0);
			char lastLetter = value.charAt(value.length() - 1);
			String numString = value.substring(1, value.length() - 1);
			double number = Double.parseDouble(numString);
			
			//use methods for the calculations
			sum += returnValue(firstLetter, lastLetter, number);
		}
		
		//print the result
		System.out.printf("%.2f", sum);

	}

	private static double returnValue(char firstLetter, char lastLetter,
			double number) {

		double result = 0;
		
		// use the methods to get the case and position of the first letter
		String firstLetterCase = returnLetterCase(firstLetter);
		int firstLetterPosition = returnLetterPosition(firstLetter);
		
		// divide or multiply the result depending on the case of the first letter
		if (firstLetterCase.equals("uppercase")) {
			result = number / firstLetterPosition;
		} else {
			result = number * firstLetterPosition;
		}
		
		// use the methods to get the case and position of the last letter
		String lastLetterCase = returnLetterCase(lastLetter);
		int lastLetterPosition = returnLetterPosition(lastLetter);
		
		// subtract or add the result depending on the case of the last letter
		if (lastLetterCase.equals("uppercase")) {
			result -= lastLetterPosition;
		} else {
			result += lastLetterPosition;
		}
		
		return result;
	}

	// check if the letter is upper case or lower case
	private static String returnLetterCase(char character) {
		if (character >= 65 && character <= 90) {
			return "uppercase";
		} else {
			return "lowercase";
		}		
	}

	// calculate the position of the letter in the alphabet
	private static int returnLetterPosition(char character) {
		int position = 0;
		if (character >= 65 && character <= 90) {
			position = character - 64;
		} else if (character >= 97 && character <= 122){
			position = character - 96;
		}		
		return position;
	}

}
