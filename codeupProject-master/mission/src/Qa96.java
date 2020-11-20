import java.util.Arrays;
import java.util.Scanner;

public class Qa96 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[20][20];
		int b = scan.nextInt();
		for (int i = 0; i < b; i++) {
			a[scan.nextInt()][scan.nextInt()] = 1;
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

