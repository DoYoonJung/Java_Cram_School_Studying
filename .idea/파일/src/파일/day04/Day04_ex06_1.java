package 파일.day04;

//문자열 비교

import java.util.Random;
import java.util.Scanner;

public class Day04_ex06_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String name = "코끼리";

		System.out.print("동물 이름을 입력하세요 : "); // ex) 티라노사우루스
		String myName = tt.next();

		int cnt = 0;
		if (name.length() == myName.length()) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == myName.charAt(i)) {
					cnt++;
				}
			}
			if (cnt == name.length()) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		} else {
			System.out.println("FALSE");
		}
	}
}
