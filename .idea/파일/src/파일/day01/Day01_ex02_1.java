package 파일.day01;

import java.util.Scanner;

//문자열 비교 1차원
public class Day01_ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String str = "11/100/89";

		int[] arr = new int[3];
		String[] arr2 = new String[3];

		arr2 = str.split("/");

		for (int i = 0; i < arr2.length; i++) {
			arr[i] = Integer.parseInt(arr2[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr[i]);
		}

		int[] scores = { 11, 100, 89 };

		String text = "";
		text = 11 + "/" + 100 + "/" + 89;

	}

}
