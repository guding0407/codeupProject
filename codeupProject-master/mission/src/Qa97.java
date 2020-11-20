import java.util.Arrays;
import java.util.Scanner;

public class Qa97 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = new int[20][20];
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				int b = scan.nextInt();
				a[i][j] = b;
			}
		}
		int c = scan.nextInt();
		for (int i = 0; i < c; i++) {
			int d = scan.nextInt();
			int e = scan.nextInt();
			for (int j = 1; j < a.length; j++) {
				if (a[d][j] == 0) {
					a[d][j] = 1;
				} else {
					a[d][j] = 0;
				}
				if(a[j][e]==0) {
					a[j][e]=1;
				}else {
					a[j][e]=0;
				}
			}
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

