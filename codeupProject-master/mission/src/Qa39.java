import java.util.Scanner;

public class Qa39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");
		Long c = Long.parseLong(b[0]);
		Long d = Long.parseLong(b[1]);
		System.out.println(c + d);
	}
}

