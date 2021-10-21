package 배열기본.day01;

import java.util.Random;

//omr카드

//19:31~19:
import java.util.Scanner;

public class Day01_ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] answer = { 1, 3, 4, 2, 5 };
		int[] hgd = new int[5];
		int cnt = 0;
		while (cnt < 5) {
			int a = tt.nextInt(5) + 1;
			int j = 0;
			int check = 0;

			while (j < cnt) {
				if (a == hgd[j]) {
					check = -1;
				}
				j++;
			}

			if (check == 0) {
				hgd[cnt] = a;
				cnt++;
			}
		}

		for (int i = 0; i < hgd.length; i++) {
			System.out.print(hgd[i] + " ");
		}

	}

}
