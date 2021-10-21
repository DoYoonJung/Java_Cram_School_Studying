package 파일.day02;

import java.util.Scanner;

//문자열 비교 2차원
public class Day02_ex03_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String[] name = { "김철수", "이만수", "이영희" };
		int[] score = { 87, 42, 95 };

		String str = "";

		for (int i = 0; i < name.length; i++) {
			str += name[i] + "/" + score[i];

			if (i != name.length - 1) {
				str += ",";
			}

		}

		System.out.println(str);

	}

}
