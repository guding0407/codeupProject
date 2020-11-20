import java.util.Scanner;

public class Qa88 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i <= a; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}
