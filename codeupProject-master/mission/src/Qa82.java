import java.util.Scanner;

public class Qa82

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int b = Integer.valueOf(a, 16);
		for (int j = 1; j < 16; j++) {
			System.out.printf(a + "*%X=%X\n", j, b * j);
		}
	}
}

