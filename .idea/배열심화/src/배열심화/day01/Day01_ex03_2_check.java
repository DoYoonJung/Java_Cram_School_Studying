package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//숫자야구게임
public class Day01_ex03_2_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] com = { 1, 7, 3 };
		int[] me = new int[3];
		int a = 0;
		while (a < 3) {
			int random = tt.nextInt(9) + 1;
			int check = 0;
			int j = 0;
			while (j < a) {
				if (me[j] == random) {
					check = -1;
				}
				j++;
			}

			if (check == 0) {
				me[a] = random;
				a++;
			}
		}

		while (true) {
			int strike = 0;
			int ball = 0;
			int[] arr = new int[3];
			System.out.println("첫번쨰 숫자 :");
			int first = in.nextInt();

			System.out.println("두번쨰 숫자 :");
			int second = in.nextInt();

			System.out.println("세번쨰 숫자 :");
			int third = in.nextInt();

			arr[0] = first;
			arr[1] = second;
			arr[2] = third;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == com[i]) {
					strike++;
				}
				for (int k = 0; k < arr.length; k++) {

					if (k != i) {
						if (arr[i] == com[k]) {
							ball++;
						}
					}
				}
			}

			System.out.println("strike = " + strike);
			System.out.println("ball = " + ball);
		}

	}
}
