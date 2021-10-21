package 배열심화.day02;

import java.util.Random;
import java.util.Scanner;

//쇼핑몰[장바구니]
public class Day01_ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[][] lottoSet = new int[5][7];

		int ran = tt.nextInt(5);

		for (int i = 0; i < lottoSet.length; i++) {
			int cnt = 0;
			for (int j = 0; j < lottoSet[i].length; j++) {
				if (i != ran) {
					int r = tt.nextInt(7);
					if (r == 3) {
						cnt++;
					}
					if (cnt == 3) {
						j--;
						cnt--;
					} else {
						lottoSet[i][j] = r;
					}

				} else {
					int r = tt.nextInt(7);

					if (j == ran) {
						lottoSet[i][ran] = 3;
						lottoSet[i][ran + 1] = 3;
						lottoSet[i][ran + 2] = 3;
						j += 3;
					} else {
						if (r != 3) {
							lottoSet[i][j] = r;
						}

					}
				}

			}
		}
		for (int i = 0; i < lottoSet.length; i++) {

			for (int j = 0; j < lottoSet[i].length; j++) {
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}

	}
}
