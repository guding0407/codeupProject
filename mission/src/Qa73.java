import java.util.Scanner;

public class Qa73

{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b [] = a.split(" ");
		int i = 0;
		while(true) {
			if(b[i].equals("0")) {
				break;
			}
			System.out.println(b[i]);
			i++;
		}
	}
}

