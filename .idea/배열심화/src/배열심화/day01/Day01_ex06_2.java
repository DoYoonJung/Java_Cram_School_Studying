package �迭��ȭ.day01;

import java.util.Random;
import java.util.Scanner;

//���� ���
public class Day01_ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		String[] name = { "ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���" };
		int[] score = { 87, 42, 100, 11, 98 };

		String[] arr = new String[5];

		int q = 0;
		while (q < 5) {
			int a = 0;
			int b = 0;

			for (int i = 0; i < score.length; i++) {
				if (a < score[i]) {
					a = score[i];
					b = i;
				}
			}
			score[b] = 0;

			arr[q] = name[b];
			q++;
		}

		for (int i = 0; i < score.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
