package �迭��ȭ.day01;

import java.util.Random;
import java.util.Scanner;

//������ ����
public class Day01_ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		// ���� 1
		int a = 0;
		int b = 0;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				a += pay[i][j];
			}
			System.out.println((i + 1) + "�� ������ : " + a);
			a = 0;
		}

		// 2������

		System.out.println("ȣ�� �Է� : ");
		int answer = in.nextInt();

		int k = 0;
		int q = 0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (answer == apt[i][j]) {
					k = i;
					q = j;
				}
			}
		}

		System.out.println(apt[k][q] + "ȣ�� ������� " + pay[k][q]);

		// 3������
		int x = 0;
		int x1 = 0;
		int x2 = 0;

		int y = pay[0][0];
		int y1 = 0;
		int y2 = 0;

		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (pay[i][j] > x) {
					x = pay[i][j];
					x1 = i;
					x2 = j;
				}

				if (pay[i][j] < y) {
					y = pay[i][j];
					y1 = i;
					y2 = j;
				}
			}
		}

		System.out.println("���帹�̳�����: " + apt[x1][x2] + " �������Գ�����:" + apt[y1][y2]);

		// ����4

		System.out.println("��ü�ϰ��� �ϴ� ȣ�� 1: ");
		int one = in.nextInt();
		System.out.println("��ü�ϰ��� �ϴ� ȣ�� 2: ");
		int two = in.nextInt();

		int cnt = 0;
		int cnt1 = 0;

		int cnt2 = 0;
		int cnt3 = 0;

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == one) {
					cnt = i;
					cnt1 = j;
				}

				if (apt[i][j] == two) {
					cnt2 = i;
					cnt3 = j;
				}
			}
		}

		int temp = pay[cnt][cnt1];
		pay[cnt][cnt1] = pay[cnt2][cnt3];
		pay[cnt2][cnt3] = temp;

		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
	}
}
