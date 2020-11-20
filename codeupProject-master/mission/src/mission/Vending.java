package mission;

import java.util.Scanner;

public class Vending {
	static String drink[] = new String[20];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < drink.length; i++) {
			drink[i] = "";
		}
		System.out.println("================기능================");
		System.out.println("1: 음료추가 2: 음료삭제 3: 자판기이용 4:종료");
		System.out.println("===================================");
		while (true) {
			System.out.print("기능선택: ");
			int answer = scan.nextInt();
			switch (answer) {
			case 1:
				list();
				plus();
				list();
				System.out.println("-------------------------------");
				break;
			case 2:
				list();
				drop();
				list();
				System.out.println("-------------------------------");
				break;
			case 3:
				program();
				break;
			case 4:
				System.out.println("자판기 관리 프로그램 종료");
				return;
			}
		}
	}

	private static void program() {
		int answer;
		int total;
		while (true) {
			System.out.print("동전을 넣으세요(500원이상): ");
			answer = scan.nextInt();
			if (answer >= 500) {
				break;
			}
		}
		total = answer;
		while (true) {
			System.out.print("(현재 금액: " + total + "원) ");
			list();
			System.out.print("음료를 선택하세요(순서대로 1, 2, 3... 입력, 거스름돈 받기: 0): ");
			answer = scan.nextInt();
			if (answer == 0) {
				System.out.println("거스름돈은 " + total + "원 입니다.");
				System.out.println("-------------------------------");
				break;
			}
			if (total <= 0) {
				System.out.println("잔액이 부족합니다.");
			}
			System.out.println(drink[answer - 1] + "가 나왔습니다.");
			total -= 500;
		}

	}

	private static void drop() {
		System.out.print("삭제할 음료는? ");
		String dropItem = scan.next();
		for (int i = 0; i < drink.length; i++) {
			if (drink[i].equals(dropItem)) {
				drink[i] = "";
				break;
			}
		}
		for (int i = 0; i < drink.length; i++) {
			if (drink[i + 1].equals("") && drink[i + 2].equals("")) {
				break;
			} else if (!drink[i + 1].equals("")) {
				drink[i] = drink[i + 1];
				drink[i + 1] = "";
			}
		}
	}

	private static void plus() {
		System.out.print("추가할 음료는? ");
		for (int i = 0; i < drink.length; i++) {
			if (drink[i].equals("")) {
				drink[i] = scan.next();
				break;
			}
		}
	}

	private static void list() {
		System.out.print("음료 목록: [");
		for (int i = 0; i < drink.length; i++) {

			if (drink[i].equals("")) {

				System.out.println("]");
				break;
			} else if (drink[i + 1].equals("")) {
				System.out.println("'" + drink[i] + "']");
				break;
			} else {

				System.out.print("'" + drink[i] + "',");
			}
		}
	}
}
