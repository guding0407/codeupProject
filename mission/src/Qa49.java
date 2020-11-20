import java.util.Scanner;

public class Qa49 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		String b[] = a.split(" ");
		if (Integer.parseInt(b[0]) > Integer.parseInt(b[1])) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
