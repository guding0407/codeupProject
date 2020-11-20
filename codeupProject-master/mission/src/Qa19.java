import java.util.Scanner;

public class Qa19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split("\\.");
		int c =Integer.parseInt(b[0]);
		int d =Integer.parseInt(b[1]);
		int e = Integer.parseInt(b[2]);
		
		System.out.printf("%04d.%02d.%02d",c,d,e);
	}
}

