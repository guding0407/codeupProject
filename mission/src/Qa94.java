import java.util.Scanner;

public class Qa94 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		for (int i = b.length-1; i >= 0; i--) {
			System.out.print(b[i]+" ");
		}
	}
}

