package 배열기본.day02;

import java.util.Random;

//숫자이동(1단계)

//19:20~19:30
import java.util.Scanner;

public class Day02_ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] game = { 0, 0, 2, 0, 0, 0, 0 };
		final int wall = 9;
		int player = 0;
		for (int i = 0; i < 7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}

		while (true) {
			int Wall = tt.nextInt(7);

			if (game[Wall] != 2) {
				game[Wall] = wall;
				break;
			}

		}

		while (true) {
			for (int k = 0; k < game.length; k++) {
				System.out.print(game[k] + " ");
			}
			System.out.println();

			System.out.println("숫자를 입력해 주세요 :");
			int answer = in.nextInt();

			for (int j = 0; j < game.length; j++) {
				if (game[j] == 2) {
					player = j;
				}
			}

			if (player == 0 || player == 6) {
				System.out.println("게임 끝");
				break;
			}

			if (answer == 1) {

				if (player != 0 && game[player - 1] != wall) {
					game[player] = 0;
					game[player - 1] = 2;
				}

			}

			else if (answer == 2) {

				if (player != 6 && game[player + 1] != wall) {
					game[player] = 0;
					game[player + 1] = 2;
				}
			}

			else if (answer == 3) {
				if (game[player - 1] == wall) {
					game[player - 1] = 0;
				}

				else if (game[player + 1] == wall) {
					game[player + 1] = 0;
				}
			}
		}

	}

}
