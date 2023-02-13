import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int[] iArr = new int[number];
		
		for(int i = 0; i <iArr.length; i++) {
			iArr[i] = sc.nextInt();
		}

		int max = iArr[0];
		for(int i = 0; i < iArr.length; i++) {
			max = Math.max(max, iArr[i]);
		}
		
		int min = iArr[0];
		for(int i = 0; i < iArr.length; i++) {
			min = Math.min(min, iArr[i]);
		}
		System.out.println(min + " " + max);
	}
}