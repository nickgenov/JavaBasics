import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		double aX = scan.nextDouble();
		double aY = scan.nextDouble();
		
		double bX = scan.nextDouble();
		double bY = scan.nextDouble();
		
		double cX = scan.nextDouble();
		double cY = scan.nextDouble();
		
		int area = (int)Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
		
		System.out.println(area);
	}

}
