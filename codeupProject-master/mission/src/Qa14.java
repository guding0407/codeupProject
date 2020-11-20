import java.util.Scanner;

public class Qa14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String c[] = a.split(" ");
		System.out.printf("%s %s", c[1],c[0]);
	}
}
