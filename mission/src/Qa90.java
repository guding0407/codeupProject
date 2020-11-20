import java.util.Scanner;

public class Qa90 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = scan.nextInt();
		int c = scan.nextInt();
		Long sum = Long.parseLong(a);

		for (int i = 1; i < c; i++) {
			sum*=b;
		}
		System.out.println(sum);
	}
}

