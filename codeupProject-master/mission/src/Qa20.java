import java.util.Scanner;

public class Qa20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split("-");
		System.out.println(b[0]+b[1]);
	}
	
}

