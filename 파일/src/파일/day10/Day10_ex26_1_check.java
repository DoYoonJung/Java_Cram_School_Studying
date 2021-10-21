package 파일.day10;

//경마게임
import java.util.Random;
import java.util.Scanner;

public class Day10_ex26_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];
		int count = 1;
		for (int i = 0; i < 20; i++) {
			int check = 0;
			for (int j = 0; j < 5; j++) {

				int r = ran.nextInt(4) + 1;
				horse[j][i] = r;
				total[j] = total[j] + horse[j][i];

				if (total[j] >= 19) {
					check++;
					if (check >= 2) {
						j--;
						total[j] = total[j] - horse[j][i];

					} else {
						rank[j] = count;
						count++;
					}

				}

			}
		}

		for (int i = 0; i < 5; i++) {
			// System.out.println(total[i]);
			System.out.println(rank[i]);
		}
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 20; n++) {
				System.out.print(horse[i][n]);
			}
			System.out.println();
		}

	}
}
