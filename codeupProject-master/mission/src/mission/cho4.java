package mission;

public class cho4 {

	public static void main(String[] args) {
		int sum = 0;
		int sw = -1;
		for (int i = 1; i <= 100; i++) {
			sw *= -1;
			sum += i * sw;
		}
		System.out.println(sum);
	}
}
