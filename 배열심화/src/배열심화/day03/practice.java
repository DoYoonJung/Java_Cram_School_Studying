package 배열심화.day03;

import java.util.Random;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] temp = new int[25];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(50) + 1;
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
				}
			}
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}
}
