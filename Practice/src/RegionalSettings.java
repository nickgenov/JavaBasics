import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;


@SuppressWarnings("unused")
public class RegionalSettings {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Locale.setDefault(Locale.ROOT);
//		Locale.setDefault(new Locale("BG", "BG"));
		
//		DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.GERMAN);
//		otherSymbols.setDecimalSeparator('.');
//		otherSymbols.setGroupingSeparator(',');
//		
		double a = Double.parseDouble(scan.nextLine());
		System.out.println(a);
		
	}
}
