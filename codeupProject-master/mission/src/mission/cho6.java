package mission;

public class cho6 {
	public static void main(String[] args) {
		int sum = 0;
		int H = 1;
		sum += H;
		for (int i = 2; i < 11; i++) {
			H+=i;
			sum+=H;
		}
		System.out.println(sum);
	}
}
