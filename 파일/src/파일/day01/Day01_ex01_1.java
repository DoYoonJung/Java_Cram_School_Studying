package 파일.day01;

import java.util.Scanner;

public class Day01_ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String jumin = "890101-2012932";

		String age = jumin.substring(0, 2);
		String sex = jumin.substring(7, 8);
		int answer = 100 - Integer.parseInt(age) + 21;
		int answer2 = Integer.parseInt(sex);

		System.out.println(answer);

		if (answer2 == 2) {
			System.out.println("여자");
		}
	}

}
