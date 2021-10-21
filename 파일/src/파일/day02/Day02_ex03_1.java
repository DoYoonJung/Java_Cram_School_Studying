package 파일.day02;

import java.util.Scanner;

//문자열 비교 2차원
public class Day02_ex03_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String str = "김철수/87,이만수/42,이영희/95";

		String[] name = new String[3];
		int[] score = new int[3];

		String[] arr = str.split(",");

		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("/");
			name[i] = temp[0];
			score[i] = Integer.parseInt(temp[1]);
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " 씨 " + score[i] + "점");
		}

	}

}
