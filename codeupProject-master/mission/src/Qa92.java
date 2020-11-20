import java.util.Scanner;

public class Qa92 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		for (int i = 1; ; i++) {
			if (i%b!=0||i%c!=0||i%d!=0) {
				continue;
			}
			System.out.println(i);
			break;
		}
	}
}

