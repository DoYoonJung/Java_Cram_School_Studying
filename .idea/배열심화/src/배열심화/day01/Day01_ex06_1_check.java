package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//내림차순 정렬
public class Day01_ex06_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();
		int[] score = { 10, 50, 30, 40, 80, 7 };

		int q = 0;
		while (q < 6) {
			for (int i = 0; i < score.length; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			int a = score[q];
			int b = 0;

			for (int i = q; i < score.length; i++) {
				if (a < score[i]) {
					a = score[i];
					b = i;
				}
			}
			int check = score[q];
			if (score[q] != a) {
				score[b] = check;
			}
			score[q] = a;

			q++;

		}
	}
}
