import java.util.Scanner;

public class Qa45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		String b[] = a.split(" ");

		int c = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);

		float e = Float.valueOf(c);
		float f = Float.valueOf(d);

		System.out.println(c + d);
		System.out.println(c - d);
		System.out.println(c * d);
		System.out.println(c / d);
		System.out.println(c % d);
		System.out.printf("%.2f", e / f);
	}
}
