import java.math.BigDecimal;
import java.util.Scanner;


public class BigDecimalFactorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);		
		int n = scan.nextInt();

		BigDecimal value = new BigDecimal(n);
		BigDecimal factorial = new BigDecimal("1");
		
		while (true) {
			if (value.equals(new BigDecimal("1"))) {
				break;
			}
			factorial = factorial.multiply(value);
			value = value.subtract(new BigDecimal("1"));
		}
		
		System.out.printf("%d! = %s", n, factorial);
	}

}
