package 배열심화.day01;

import java.util.Random;
//중복숫자 금지(2단계)
import java.util.Scanner;

public class Day01_ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] arr = new int[5];
		int a = 0;
		while (a < 5) {
			int random = tt.nextInt(10) + 1;
			int check = 0;
			int j = 0;
			while (j < a) {
				if (arr[j] == random) {
					check = -1;
				}
				j++;
			}

			if (check == 0) {
				arr[a] = random;
				a++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
