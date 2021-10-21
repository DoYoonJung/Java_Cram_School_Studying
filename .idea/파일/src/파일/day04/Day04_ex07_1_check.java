package 파일.day04;

//문자열 속 숫자검사

import java.util.Random;
import java.util.Scanner;

public class Day04_ex07_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		System.out.print("입력 : ");
		String text = tt.next();

		char[] charNum = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int cnt = 0;
		for (int i = 0; i < charNum.length; i++) {
			for (int j = 0; j < text.length(); j++) {
				if (charNum[i] == text.charAt(j)) {
					cnt++;
				}
			}
		}

		if (cnt == 0) {
			System.out.println("모두 문자");
		} else if (cnt == text.length()) {
			System.out.println("모두 숫자");
		} else {
			System.out.println("숫자,문자 섞임");
		}
	}
}
