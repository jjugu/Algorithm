import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		 * 주사위 3개
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		int a = 6;
//		int b = 2;
//		int c = 5;
//		System.out.println(a + " " + b + " " + c + " ");
		
		if(a == b && b == c) {
			System.out.println(10000 + a * 1000);
		} else if(a == b || a == c || b == c) {
			if(a == b) {
				System.out.println(1000 + a * 100);
			}
			if(a == c) {
				System.out.println(1000 + a * 100);
			}
			if(b == c) {
				System.out.println(1000 + b * 100);
			}
		} else {
			System.out.println((Math.max(Math.max(a, b), c)) * 100);
		}
	}
}