import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		System.out.println("변수입력");
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] array2 = new int[10];
		
		for(int i = 0; i < array2.length; i++) {
			array2[i] = (array[i] % 42);
		}
		
		/* int 배열을 Integer배열로 변환 */
		Integer[] arr = new Integer[array2.length];
		for(int i = 0; i < array2.length; i++) {
			arr[i] = array2[i];
		}
		/* Integer[]arr를 set으로 변환 */
		Set<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
		
		System.out.println(set.size());
	}
}
