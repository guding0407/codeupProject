import java.util.Scanner;

public class Qa86 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();

		System.out.printf("%.2f MB", ((a * b * c) / 8) / 1048576);
	}
}
