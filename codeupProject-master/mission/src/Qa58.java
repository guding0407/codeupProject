import java.util.Scanner;

public class Qa58 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		if (b[0].equals("0") && b[1].equals("0")) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
