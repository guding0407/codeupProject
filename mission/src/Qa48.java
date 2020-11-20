import java.util.Scanner;

public class Qa48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		String b[] = a.split(" ");

		int sum = 2;
		int c = Integer.parseInt(b[0]);

		if (Integer.parseInt(b[1]) == 0) {
			sum = 1;
		}
		for (int i = 0; i < Integer.parseInt(b[1]) - 1; i++) {
			sum *= 2;
		}
		c = c * sum;
		System.out.println(c);
	}
}
