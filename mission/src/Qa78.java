import java.util.Scanner;

public class Qa78

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int sum=0;
		for (int i = 2; i <= a; i+=2) {
			sum+=i;
			
		}
		System.out.println(sum);
	}
}

