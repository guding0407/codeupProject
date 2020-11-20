import java.util.Arrays;
import java.util.Scanner;

public class Qa95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		Arrays.sort(b);
		System.out.println(b[0]);
	}
}

