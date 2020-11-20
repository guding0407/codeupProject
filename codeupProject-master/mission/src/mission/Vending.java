package mission;

import java.util.Scanner;

public class Vending {
	static String drink[] = new String[20];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		for (int i = 0; i < drink.length; i++) {
			drink[i] = "";
		}
		System.out.println("================���================");
		System.out.println("1: �����߰� 2: ������� 3: ���Ǳ��̿� 4:����");
		System.out.println("===================================");
		while (true) {
			System.out.print("��ɼ���: ");
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
				System.out.println("���Ǳ� ���� ���α׷� ����");
				return;
			}
		}
	}

	private static void program() {
		int answer;
		int total;
		while (true) {
			System.out.print("������ ��������(500���̻�): ");
			answer = scan.nextInt();
			if (answer >= 500) {
				break;
			}
		}
		total = answer;
		while (true) {
			System.out.print("(���� �ݾ�: " + total + "��) ");
			list();
			System.out.print("���Ḧ �����ϼ���(������� 1, 2, 3... �Է�, �Ž����� �ޱ�: 0): ");
			answer = scan.nextInt();
			if (answer == 0) {
				System.out.println("�Ž������� " + total + "�� �Դϴ�.");
				System.out.println("-------------------------------");
				break;
			}
			if (total <= 0) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			System.out.println(drink[answer - 1] + "�� ���Խ��ϴ�.");
			total -= 500;
		}

	}

	private static void drop() {
		System.out.print("������ �����? ");
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
		System.out.print("�߰��� �����? ");
		for (int i = 0; i < drink.length; i++) {
			if (drink[i].equals("")) {
				drink[i] = scan.next();
				break;
			}
		}
	}

	private static void list() {
		System.out.print("���� ���: [");
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
