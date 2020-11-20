import java.util.Scanner;

public class Qa71 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");
		
		for (int i = 0; i < b.length; i++) {
			if(b[i].equals("0")) {
				break;
			}
			System.out.println(b[i]);
		}

	}
}
