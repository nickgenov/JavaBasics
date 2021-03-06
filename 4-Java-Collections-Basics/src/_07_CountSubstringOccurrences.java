import java.util.Scanner;

public class _07_CountSubstringOccurrences {

       public static void main(String[] args) {
             
             @SuppressWarnings("resource")
             Scanner scan = new Scanner(System.in);
             
             String text = scan.nextLine().toLowerCase();          
             String word = scan.nextLine().toLowerCase();
                    
             int wordCount = 0;
             
             int start = 0;
             int end = word.length();
             
             for (int i = 0; i <= text.length() - word.length(); i++) {
                    
                    String str = text.substring(start, end);
                    
                    if (str.equals(word)) {
                           wordCount++;
                    }
                    
                    start++;
                    end++;
             }
             
             System.out.println(wordCount);
       }
}