package ����.day03;

//Ÿ�� ����
//�̰� ����Ʈ Ȯ���� ����! ���ù��!

import java.util.Random;
import java.util.Scanner;

public class Day03_ex05_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);
		String[] words = { "java", "mysql", "jsp", "spring" };

		String[] arr = new String[4];

		for (int i = 0; i < words.length; i++) {
			int ran = in.nextInt(4);
			arr[i] = words[ran];
			for (int j = 0; j < i; j++) {
				if (arr[i].equals(arr[j])) {
					i--;
				}
			}
		}

		int q = 0;
		while (q < 4) {
			System.out.println("����  " + arr[q]);
			String answer = tt.next();

			if (arr[q].equals(answer)) {
				System.out.println("����");
				q++;
			}

		}

	}

}
