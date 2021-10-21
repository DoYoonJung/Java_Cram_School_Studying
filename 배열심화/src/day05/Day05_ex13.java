package day05;

import java.util.Random;
import java.util.Scanner;

public class Day05_ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int win = 0;
		int turn = 0;
		int size = 50;
		int max = 5;
		int[][] me = new int[max][max];
		int[][] you = new int[max][max];
		int[][] me1 = new int[max][max];
		int[][] you1 = new int[max][max];
		int[] temp = new int[max * max];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}

		int k = 0;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				me[i][j] = temp[k];
				k++;
			}
		}

		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}

		k = 0;
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				you[i][j] = temp[k];
				k++;
			}
		}
		while (true) {
			System.out.println("me BinGO");
			for (int t = 0; t < max; t++) {
				for (int u = 0; u < max; u++) {
					if (me1[t][u] == 0) {
						System.out.print(me[t][u] + " ");
					} else if (me1[t][u] == 1) {
						System.out.print("o" + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("you BinGO");
			for (int t = 0; t < max; t++) {
				for (int u = 0; u < max; u++) {
					if (you1[t][u] == 0) {
						System.out.print(you[t][u] + " ");
					} else if (you1[t][u] == 1) {
						System.out.print("x" + " ");
					}
				}
				System.out.println();
			}
			System.out.println();

			if (win == 1) {
				System.out.println("me ½Â¸®");
				break;
			} else if (win == 2) {
				System.out.println("you ½Â¸®");
				break;
			}

			if (turn % 2 == 0) {
				while (true) {
					System.out.println("me Â÷·Ê");
					System.out.println("x°ª :");
					int x = scan.nextInt();
					System.out.println("y°ª :");
					int y = scan.nextInt();

					if (me1[x][y] != 0) {

						continue;
					} else {
						me1[x][y] = 1;
					}

					int num = me[x][y];

					for (int i = 0; i < max; i++) {
						for (int j = 0; j < max; j++) {
							if (you[i][j] == num) {
								if (you1[i][j] == 0) {
									you1[i][j] = 1;
								}
							}
						}
					}

					break;
				}
			}

			if (turn % 2 == 1) {
				while (true) {
					System.out.println("you Â÷·Ê");

					int x = ran.nextInt(max);

					int y = ran.nextInt(max);

					if (you1[x][y] != 0) {

						continue;
					} else {
						you1[x][y] = 1;
					}

					int num = you[x][y];

					for (int i = 0; i < max; i++) {
						for (int j = 0; j < max; j++) {
							if (me[i][j] == num) {
								if (me1[i][j] == 0) {
									me1[i][j] = 1;
								}
							}
						}
					}

					break;
				}
			}
			int gnt = 0;
			int cnt = 0;
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < max; j++) {
					if (me1[i][j] == 1) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (you1[i][j] == 1) {
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

			gnt = 0;
			cnt = 0;
			for (int i = 0; i < max; i++) {
				for (int j = 0; j < max; j++) {
					if (me1[j][i] == 1) {
						cnt++;
					} else {
						cnt = 0;
					}
					if (you1[j][i] == 1) {
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
			gnt = 0;
			cnt = 0;
			for (int i = 0; i < max; i++) {
				if (me1[i][i] == 1) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (you1[i][i] == 1) {
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
			int a = 4;
			gnt = 0;
			cnt = 0;
			for (int i = 0; i < max; i++) {
				if (me1[i][a] == 1) {
					cnt++;
				} else {
					cnt = 0;
				}
				if (you1[i][a] == 1) {
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
				a--;
			}
			turn++;
		}

	}

}
