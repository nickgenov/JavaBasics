import java.time.LocalDate;


public class PrintFormatting {

	public static void main(String[] args) {
		
		String name = "SoftUni";
		String location = "Bulgaria";

		double age = 0.5;
		
		System.out.printf("%s is a %.2f years old organisation located in %s\n", name, age, location);
		
		//$ means that the numbering ends and the formatting begins
		//t - time
		//d - day
		//m - month
		//Y - year
		//\n - new line
		System.out.printf("Today is %1$td.%1$tm.%1$tY\n", LocalDate.now());
		
		//d - number
		System.out.printf("%1$d + %1$d = %2$d\n", 2, 4);
		
		System.out.printf("%1$s + %1$s = %2$s\n", 1.6, 3.2);
	}

}
