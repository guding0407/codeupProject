import java.util.Scanner;

public class Qa46 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		String b[] = a.split(" ");

		int c = Integer.parseInt(b[0]);
		int d = Integer.parseInt(b[1]);
		int e = Integer.parseInt(b[2]);
		int sum = c + d + e;
		float avg = (float) sum / 3;

		System.out.println(sum);
		System.out.println(Math.round(avg * 10) / 10.0);
	}
}
