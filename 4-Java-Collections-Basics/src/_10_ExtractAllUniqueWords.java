import java.util.Scanner;
import java.util.TreeSet;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in); 
		
		String text = scan.nextLine();
		text = text.toLowerCase();
		String[] words = text.split("[\\W+]");
		
		TreeSet<String> set = new TreeSet<String>();
		
		for (int i = 0; i < words.length; i++) {
			set.add(words[i]);
		}
		
		set.remove(" ");
		set.remove("");
		
		set.forEach(x -> System.out.print(x + " "));
	}

}
