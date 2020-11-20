import java.util.Scanner;

public class Qa67 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		Long c = Long.parseLong(b[0]);

		if (c < 0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
		}
		if (c % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}
}
