package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//1 to 18
public class Day01_ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		final int SIZE = 9;

		int[] front = new int[SIZE];
		int[] back = new int[SIZE];

		int a = 0;
		while (a < 9) {
			int r = tt.nextInt(9) + 1;
			int check = 0;
			int j = 0;

			while (j < a) {
				if (front[j] == r) {
					check = -1;

				}
				j++;
			}

			if (check == 0) {
				front[a] = r;
				a++;
			}
		}

		for (int k = 0; k < back.length; k++) {
			back[k] = k + 10;
		}
		int cnt = 1;
		int t = 0;
		while (true) {
			for (int i = 0; i < front.length; i++) {
				System.out.print(front[i] + " ");

				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();

			System.out.println("인덱스를 입력해 주세요 : ");
			int answer = in.nextInt();

			if (cnt == front[answer]) {
				if (cnt < 10) {
					System.out.println("정답");
					front[answer] = back[t];
					cnt++;
					t++;
				} else {
					System.out.println("정답");
					front[answer] = 0;

					cnt++;

				}

			} else {
				System.out.println("틀렸습니다.");
			}
			if (cnt == 19) {
				System.out.println("게임 끝");
				break;
			}
		}
	}
}
