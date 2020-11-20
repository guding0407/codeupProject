import java.util.Scanner;

public class Qa26 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(":");
		String c[] = b[1].split("");

		if (c[0].equals("0") || c[0].equals("1")) {
			System.out.println(c[1]);
			return;
		}
		System.out.println(b[1]);
	}
}

