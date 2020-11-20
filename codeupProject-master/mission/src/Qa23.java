import java.util.Scanner;

public class Qa23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split("\\.");
		System.out.println(b[0]+"\n"+b[1]);
		
	}
	
}

