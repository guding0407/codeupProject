import java.util.Arrays;
import java.util.Scanner;

public class Qa99 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[10][10];
		int w = 1, h = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int b = scan.nextInt();
				a[i][j] = b;
			}
		}
		while (true) {
			if (a[w][h] == 2) {
				a[w][h]=9;
				break;
			}
			a[w][h] = 9;
			if (a[w][h + 1] == 0 || a[w][h + 1] == 2) {
				h++;
			} else if (a[w + 1][h] == 0 || a[w + 1][h] == 2) {
				w++;
			} else {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

