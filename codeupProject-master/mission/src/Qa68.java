import java.util.Scanner;

public class Qa68 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		a = a / 10;
		switch (a) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		case 6:
		case 5:
		case 4:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;

		}
	}
}
