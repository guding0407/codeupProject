import java.util.Scanner;

public class Qa79

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b[] = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if(b[i].equals("q")) {
				break;
			}
		}
	}
}

