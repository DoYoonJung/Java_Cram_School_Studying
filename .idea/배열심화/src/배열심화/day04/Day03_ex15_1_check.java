package 배열심화.day04;

import java.util.Random;
import java.util.Scanner;

public class Day03_ex15_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		final int player = 2;

		final int wall = 9;
		final int goal = 3;
		final int Goal = 4;

		int px = 0;
		int py = 0;

		int Goalx = 0;
		int Goaly = 0;

		int goalx = 0;
		int goaly = 0;

		int[][] map = new int[7][7];

		System.out.println("벽을 몇개 만들겠습니까:");
		int wallNumber = in.nextInt();
		int u = 0;
		while (u < wallNumber) {
			int r1 = tt.nextInt(7);
			int r2 = tt.nextInt(7);

			if (map[r1][r2] == 0) {
				map[r1][r2] = wall;
				u++;
			} else {
				u--;
			}
		}

		while (true) {
			int r1 = tt.nextInt(7);
			int r2 = tt.nextInt(7);

			if (map[r1][r2] == 0) {
				map[r1][r2] = Goal;
				Goalx = r1;
				Goaly = r2;
				break;
			}
		}

		while (true) {

			int r1 = tt.nextInt(5) + 1;
			int r2 = tt.nextInt(5) + 1;

			if (map[r1][r2] == 0) {
				map[r1][r2] = goal;
				goalx = r1;
				goaly = r2;
				break;
			}
		}
		for (int g = 0; g < map.length; g++) {
			for (int e = 0; e < map[g].length; e++) {
				System.out.print(map[g][e] + " ");
			}
			System.out.println();
		}
		System.out.println();
		while (true) {
			System.out.println("x :");
			int x = in.nextInt();
			System.out.println("y :");
			int y = in.nextInt();

			if (map[x][y] == 0) {
				map[x][y] = player;
				px = x;
				py = y;
				break;
			}
		}

		while (true) {

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == player) {
						System.out.print("나" + " ");
					} else if (map[i][j] == wall) {
						System.out.print("벽" + " ");
					} else if (map[i][j] == goal) {
						System.out.print("공" + " ");
					} else if (map[i][j] == Goal) {
						System.out.print("골" + " ");
					} else {
						System.out.print(map[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println();
			if (goalx == Goalx && goaly == Goaly) {
				System.out.println("게임끝");
				break;
			}
			System.out.println("상(1) 하(2) 좌(3) 우(4) ");
			int num = in.nextInt();

			int xx = px;
			int yy = py;

			if (num == 1) {
				xx = xx - 1;
			} else if (num == 2) {
				xx = xx + 1;
			} else if (num == 3) {
				yy = yy - 1;
			} else if (num == 4) {
				yy = yy + 1;

			}
			if (xx < 0 || xx >= 7) {
				continue;

			}

			if (yy < 0 || yy >= 7) {
				continue;
			}
			if (map[xx][yy] != 0 && map[xx][yy] != goal) {
				continue;
			}

			if (map[xx][yy] == goal) {
				int xxx = goalx;
				int yyy = goaly;

				if (num == 1) {
					xxx--;
				} else if (num == 2) {
					xxx++;
				} else if (num == 3) {
					yyy--;
				} else if (num == 4) {
					yyy++;

				}

				if (xxx < 0 || xxx >= 7) {
					continue;
				}
				if (yyy < 0 || yyy >= 7) {
					continue;
				}
				if (map[xxx][yyy] != 0 && map[xxx][yyy] != Goal) {
					continue;
				}

				map[goalx][goaly] = 0;
				goalx = xxx;
				goaly = yyy;
				map[goalx][goaly] = goal;
			}

			map[px][py] = 0;
			px = xx;
			py = yy;
			map[px][py] = player;

		}
	}

}
