package �迭��ȭ.day01;

import java.util.Random;
//1 to 8
import java.util.Scanner;

public class Day01_ex01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();
		int[] arr = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			int a = tt.nextInt(9);
			int temp = arr[0];
			arr[0] = arr[a];
			arr[a] = temp;
		}

		int number = 1;
		while (true) {
			int end = 0;

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();

			System.out.println("�ε��� �Է� : ");
			int answer = in.nextInt();

			if (arr[answer] == number) {
				System.out.println("����");
				arr[answer] = 0;
				number++;
			} else {
				System.out.println("���� �ٽü����� �ּ���");
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					end++;
				}
			}
			if (end == 9) {
				System.out.println("���� ��");
				break;
			}
		}
	}

}
