import java.util.Scanner;

public class Qa89 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int sum = a;

		for (int i = 1; i < c; i++) {
			sum+=b;
		}
		System.out.println(sum);
	}
}
