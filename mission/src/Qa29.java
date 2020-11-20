import java.util.Scanner;

public class Qa29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split("\\.");

		if (b[1].length() < 11) {
			for (int i = 11 - b[1].length(); i > 0; i--) {
				b[1] = b[1] + "0";
			}
		}
		System.out.println(b[0]+"."+b[1]);
	}
}

