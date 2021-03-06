import java.util.Scanner;


public class _02_Durts {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//parse the center coordinates
		int cX = scan.nextInt();
		int cY = scan.nextInt();
		
		//parse the radius and the number of darts
		int radius = scan.nextInt();
		int n = scan.nextInt();
	
		//parse and store the darts coordinates in an array
		int[] darts = new int[n * 2];		
		for (int i = 0; i < darts.length; i++) {
			darts[i] = scan.nextInt();
		}
		
		//go through the array to check each pair of coordinates
		for (int i = 0; i < darts.length; i += 2) {
			//darts coordinates
			int x = darts[i];
			int y = darts[i + 1];
			
			//check if the darts hit each figure
			boolean insideA = (y <= (cY + radius) && y >= (cY - radius) && 
					x >= (cX - radius + 0.5 * radius) && x <= (cX + radius - 0.5 * radius));
			boolean insideB = (y <= (cY + radius - 0.5 * radius) && y >= (cY - radius + 0.5 * radius) && 
					x >= (cX - radius) && x <= (cX + radius));
			
			//if they hit the target, print yes, otherwise no
			if (insideA || insideB) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}		
	}
	
}
