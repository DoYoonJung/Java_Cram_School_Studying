package �迭��ȭ.day02;

import java.util.Random;
import java.util.Scanner;

//���ڿ� ����
public class Day01_ex10_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		String[] names = { "ȫ�浿", "������", "������", "�ڹ�ŷ", "������" };

		for (int i = 0; i < names.length; i++) {
			String min = names[i];
			int min1 = i;
			for (int j = i; j < names.length; j++) {
				if (min.compareTo(names[j]) > 0) {
					min = names[j];
					min1 = j;
				}
			}

			String temp = names[min1];
			names[min1] = names[i];
			names[i] = temp;
		}

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}

	}
}
