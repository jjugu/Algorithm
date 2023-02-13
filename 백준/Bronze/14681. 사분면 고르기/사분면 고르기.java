import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Quadrant1 = x+ y+
		 * Quadrant2 = x- y+
		 * Quadrant3 = x- y-
		 * Quadrant4 = x+ y-
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 ) {
			if(y > 0) {
				System.out.println(1);
			}
			if(y < 0) {
				System.out.println(4);
			}
		} else if(x != 0 && x < 0) {
			if(y > 0) {
				System.out.println(2);
			}
			if(y < 0) {
				System.out.println(3);
			}
		}
	}
}
