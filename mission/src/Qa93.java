import java.util.Scanner;

public class Qa93 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[24];
		for (int i = 0; i < a; i++) {
			int c = scan.nextInt();
			b[c]++;
		}
		for (int i = 1; i < 24; i++) {
			System.out.print(b[i]+" ");
		}
	}
}

