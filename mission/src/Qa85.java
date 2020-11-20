import java.util.Scanner;

public class Qa85 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		float d = scan.nextFloat();
		
		
		System.out.printf("%.1f MB",((a*b*c*d)/8)/1048576);
	}
}
