import java.util.Scanner;

public class Qa64 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		Long c = Long.parseLong(b[0]);
		Long d = Long.parseLong(b[1]);
		Long e = Long.parseLong(b[2]);

		if (c > d) {
			if (d > e) {
				System.out.println(e);
			} else {
				System.out.println(d);
			}
		} else {
			if (c > e) {
				System.out.println(e);
			} else {
				System.out.println(c);
			}
		}
	}
}
