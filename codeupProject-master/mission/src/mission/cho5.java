package mission;

public class cho5 {
	public static void main(String[] args) {
		int sum = 0;
		int H = 1;
		sum += 1;
		for (int i = 1; i < 10; i++) {
			H += i;
			sum+=H;
		}
		System.out.println(sum);
	}
}
