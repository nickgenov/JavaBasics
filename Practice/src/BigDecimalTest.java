import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;


public class BigDecimalTest {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.ROOT);
		
		BigDecimal bigA = new BigDecimal(scan.nextLine());
		BigDecimal bigB = new BigDecimal(scan.nextLine());
		
		BigDecimal sum = bigA.add(bigB);
		System.out.println(sum);
	}

}
