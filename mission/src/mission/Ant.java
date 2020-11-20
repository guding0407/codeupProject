package mission;

public class Ant {
	private int i = 1, j = 1;

	public Ant() {
		int root[][] = new int[10][10];
		for (int i = 0; i < root.length; i++) {
			root[i][0] = 1;
			root[0][i] = 1;
			root[i][9] = 1;
			root[9][i] = 1;
		}
		root[1][3] = 1;
		root[2][3] = 1;
		root[2][4] = 1;
		root[2][5] = 1;
		root[3][7] = 1;
		root[4][7] = 1;
		root[5][7] = 1;
		root[6][7] = 1;
		root[7][7] = 1;
		root[5][5] = 1;
		root[6][5] = 1;
		root[7][5] = 1;

		for (int i = 0; i < root.length; i++) {
			for (int j = 0; j < root.length; j++) {
				if (root[i][j] != 1) {
					root[i][j] = 0;
				}
			}
		}
		root[6][6] = 2;

		for (int i = 0; i < root.length; i++) {
			for (int j = 0; j < root.length; j++) {
				System.out.print(root[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		while (true) {
			if (root[i][j] == 2) {
				root[i][j] = 9;
				break;
			}
			root[i][j] = 9;
			if (root[i][j + 1] == 1 || root[i][j + 1] == 2) {
				if (root[i + 1][j] == 0 || root[i + 1][j] == 2) {
					i++;
				} else {
					break;
				}
			} else {
				j++;
			}
		}
		for (int i = 0; i < root.length; i++) {
			for (int j = 0; j < root.length; j++) {
				System.out.print(root[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Ant();
	}
}
