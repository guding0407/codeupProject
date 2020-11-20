import java.util.Scanner;

public class Qa66 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");

		Long c = Long.parseLong(b[0]);
		Long d = Long.parseLong(b[1]);
		Long e = Long.parseLong(b[2]);
		
		if(c%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(d%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if(e%2==0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}
