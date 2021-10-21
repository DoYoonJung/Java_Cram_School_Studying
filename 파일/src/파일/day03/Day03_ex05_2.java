package 파일.day03;

//타자 연습2

import java.util.Random;
import java.util.Scanner;

public class Day03_ex05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String[] words = { "java", "mysql", "jsp", "spring" };

		for (int i = 0; i < 1000; i++) {
			int r = in.nextInt(4);

			String temp = words[0];
			words[0] = words[r];
			words[r] = temp;
		}
		int q = 0;
		while (q < 4) {
			int a = tt.nextInt(words[q].length());

			String str = "";
			for (int i = 0; i < words[q].length(); i++) {
				if (i != a) {
					str += words[q].charAt(i);
				} else {
					str += "*";
				}

			}

			System.out.println("문제 : " + str);

			System.out.println("입력 : ");
			String answer = tt.next();

			if (str.equals(answer)) {
				System.out.println("정답");
				q++;
			}

		}

	}

}
