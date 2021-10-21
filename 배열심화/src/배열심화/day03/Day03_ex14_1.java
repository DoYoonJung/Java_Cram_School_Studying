package ¹è¿­½ÉÈ­.day03;

//¿À¸ñ°ÔÀÓ
import java.util.Scanner;

public class Day03_ex14_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };

		int p1Y = 0;
		int p1X = 0;
		int p2Y = 0;
		int p2X = 0;

		int turn = 0;

		int win = 0;

		while (true) {
			if (win == 1) {
				System.out.println("p1½Â");
				break;
			}
			if (win == 2) {
				System.out.println("p2½Â");
				break;
			}

			System.out.println("==== OMOK GAME ====");
			System.out.print("  ");
			for (int k = 0; k < omok[0].length; k++) {
				System.out.print(k + " ");
			}
			System.out.println();

			for (int k = 0; k < omok.length; k++) {
				System.out.print(k + " ");
				for (int u = 0; u < omok[k].length; u++) {
					System.out.print(omok[k][u] + " ");
				}
				System.out.println();
			}

			if (turn % 2 == 0) {
				System.out.println("p1 Â÷·Ê");
				System.out.println("x°ª:");
				p1X = scan.nextInt();
				System.out.println("y°ª:");
				p1Y = scan.nextInt();

				if (omok[p1X][p1Y] == 0) {
					omok[p1X][p1Y] = 1;
				} else {
					continue;
				}
			}
			if (turn % 2 == 1) {
				System.out.println("p2 Â÷·Ê");
				System.out.println("x°ª:");
				p2X = scan.nextInt();
				System.out.println("y°ª:");
				p2Y = scan.nextInt();

				if (omok[p2X][p2Y] == 0) {
					omok[p2X][p2Y] = 2;
				} else {
					continue;
				}
			}
			int gnt = 0;
			int cnt = 0;
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					if (omok[i][j] == 1) {
						cnt++;
					}

					else {
						cnt = 0;
					}
					if (omok[i][j] == 2) {
						gnt++;
					} else {
						gnt = 0;
					}
					if (cnt == 5) {
						win = 1;

					}
					if (gnt == 5) {
						win = 2;

					}
				}
			}
			cnt = 0;
			gnt = 0;
			for (int i = 0; i < omok.length; i++) {
				for (int j = 0; j < omok[i].length; j++) {
					if (omok[j][i] == 1) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (omok[j][i] == 2) {
						gnt++;
					} else {
						gnt = 0;
					}
					if (cnt == 5) {
						win = 1;
					}
					if (gnt == 5) {
						win = 2;
					}
				}
			}
			cnt = 0;
			gnt = 0;
			for (int i = 0; i < omok.length; i++) {
				if (omok[i][i] == 1) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt == 5) {
					win = 1;
				}
				if (omok[i][i] == 2) {
					gnt++;
				} else {
					gnt = 0;
				}
				if (gnt == 5) {
					win = 2;
				}
			}
			cnt = 0;
			gnt = 0;
			int g = 0;
			for (int i = 9; i >= 0; i--) {

				if (omok[i][g] == 1) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (cnt == 5) {
					win = 1;
				}

				if (omok[i][g] == 2) {
					gnt++;
				} else {
					gnt = 0;
				}
				if (gnt == 5) {
					win = 2;
				}
				g++;
			}

			turn++;

		}

	}

}
