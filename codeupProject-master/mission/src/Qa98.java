import java.util.Arrays;
import java.util.Scanner;

public class Qa98 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gyeok[][] = new int[101][101];
		int c = scan.nextInt();
		for (int i = 0; i < c; i++) {
			int d = scan.nextInt();
			int e = scan.nextInt();
			int f = scan.nextInt();
			int g = scan.nextInt();
			for (int j = 0; j < d; j++) {
				if (e == 0) {
					gyeok[f-1][g-1] = 1;
					g++;

				} else {
					gyeok[f-1][g-1] = 1;
					f++;

				}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(gyeok[i][j] + " ");
			}
			System.out.println();
		}
	}
}

