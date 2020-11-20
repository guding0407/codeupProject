import java.util.Scanner;

public class Qa91 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		Long sum = Long.parseLong(a);

		for (int i = 1; i < d; i++) {
			sum=sum*b+c;
		}
		System.out.println(sum);
	}
}

