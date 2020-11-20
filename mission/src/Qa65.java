import java.util.Scanner;

public class Qa65 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		Long c = Long.parseLong(b[0]);
		Long d = Long.parseLong(b[1]);
		Long e = Long.parseLong(b[2]);
		
		if(c%2==0) {
			System.out.println(c);
		}
		if(d%2==0) {
			System.out.println(d);
		}
		if(e%2==0) {
			System.out.println(e);
		}
	}
}
