package 배열기본.day01;

import java.util.Random;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random in = new Random();

		int[] score = { 10, 50, 30, 40, 80, 7 };

		for (int i = 0; i < score.length; i++) {
			int a = score[i];
			int b = i;
			for (int j = i; j < score.length; j++) {
				if (score[i] < score[j]) {
					a = score[j];
					b = j;

				}
			}
			int temp = a;
			score[b] = score[i];
			score[i] = a;
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();

	}

}
