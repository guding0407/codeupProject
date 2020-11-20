import java.util.Scanner;

public class Qa25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split("");

		for (int i = b.length - 1; i > 0; i--) { // 3
			for (int j = b.length - i; j < b.length; j++) { // 2
				b[4 - i] = b[4 - i] + "0";
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("[" + b[i] + "]");
		}
	}
}

