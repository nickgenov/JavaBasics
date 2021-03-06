import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String[] input1 = scan.nextLine().split("-");
		int[] date1 = new int[input1.length];
		for (int i = 0; i < date1.length; i++) {
			date1[i] = Integer.parseInt(input1[i]);
		}
		
		String[] input2 = scan.nextLine().split("-");
		int[] date2 = new int[input2.length];
		for (int i = 0; i < date2.length; i++) {
			date2[i] = Integer.parseInt(input2[i]);
		}
		
		LocalDate start = LocalDate.of(date1[2], date1[1], date1[0]);
		LocalDate end = LocalDate.of(date2[2], date2[1], date2[0]);
		
		long result = ChronoUnit.DAYS.between(start, end);
		System.out.println(result);	
	}
}
