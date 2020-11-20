package mission;

public class cho8 {
	public static void main(String[] args) {
		double sum = 0.0;

		for (int i = 1; i < 50; i++) {

			sum += i /(double) (i + 1);
		}
		System.out.println(sum);
	}
}
