package 파일.day08;

//스네이크
import java.util.Random;
import java.util.Scanner;

public class Day08_ex27_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);
		final int item = 7;
		int size = 10;
		int[][] map = new int[size][size];

		int[] x = new int[4];
		int[] y = new int[4];
		int snake = 4;

		for (int i = 0; i < 4; i++) {
			x[i] = i;
			map[y[i]][x[i]] = i + 1;

		}

		System.out.println("아이템을 몇개 설치할까요?");
		int answer = scan.nextInt();
		int cnt = 0;

		while (true) {
			int ran = in.nextInt(10);
			int ran1 = in.nextInt(10);

			if (map[ran][ran1] != 0) {
				continue;
			}

			map[ran][ran1] = item;
			cnt++;

			if (cnt == answer) {
				break;
			}

		}
		while (true) {

			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (map[i][j] != 0 && map[i][j] != item) {
						System.out.print("뱀" + " ");
					} else if (map[i][j] == item) {
						System.out.print("템" + " ");
					} else {
						System.out.print(map[i][j] + " ");
					}

				}
				System.out.println();
			}
			System.out.println();

			System.out.print("1)left 2)right 3)up 4)down : ");
			int move = scan.nextInt();

			int xx = 0;
			int yy = 0;

			if (move == 1) {
				yy = y[0];
				xx = x[0] - 1;
			} else if (move == 2) {
				yy = y[0];
				xx = x[0] + 1;
			} else if (move == 3) {
				yy = y[0] - 1;
				xx = x[0];
			} else if (move == 4) {
				yy = y[0] + 1;
				xx = x[0];
			}

			if (xx < 0 || xx > 9) {
				continue;
			} else if (yy < 0 || yy > 9) {
				continue;
			} else if (map[yy][xx] != 0 && map[yy][xx] != item) {
				continue;
			} else if (map[yy][xx] == item) {
				int[] ty = y;
				int[] tx = x;
				x = new int[snake + 1];
				y = new int[snake + 1];

				for (int i = 0; i < snake; i++) {
					y[i] = ty[i];
					x[i] = tx[i];

				}
				snake++;
			}

			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = 0;
			}

			for (int i = snake - 1; i > 0; i--) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
			x[0] = xx;
			y[0] = yy;

			for (int i = 0; i < snake; i++) {
				map[y[i]][x[i]] = i + 1;
			}

		}

	}
}
