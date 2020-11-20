import java.util.Scanner;

public class Qa54 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		if (b[0].equals("1") && b[1].equals("1")) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
