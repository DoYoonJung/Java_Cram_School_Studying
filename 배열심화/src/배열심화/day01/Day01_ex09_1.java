package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//관리비 문제
public class Day01_ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		// 문제 1
		int a = 0;
		int b = 0;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				a += pay[i][j];
			}
			System.out.println((i + 1) + "층 관리비 : " + a);
			a = 0;
		}

		// 2번문제

		System.out.println("호수 입력 : ");
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

		System.out.println(apt[k][q] + "호의 관리비는 " + pay[k][q]);

		// 3번문제
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

		System.out.println("가장많이나온집: " + apt[x1][x2] + " 가장적게나온집:" + apt[y1][y2]);

		// 문제4

		System.out.println("교체하고자 하는 호수 1: ");
		int one = in.nextInt();
		System.out.println("교체하고자 하는 호수 2: ");
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
