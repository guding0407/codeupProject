import java.util.Scanner;

public class Qa69 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		if (a.equals("A")) {
			System.out.println("best!!!");
		} else if (a.equals("B")) {
			System.out.println("good!!");
		} else if (a.equals("C")) {
			System.out.println("run!");
		} else if (a.equals("D")) {
			System.out.println("slowly~");
		} else {
			System.out.println("what?");
		}

	}
}
