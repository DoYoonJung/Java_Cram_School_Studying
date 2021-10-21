package 파일.day02;

import java.util.Scanner;

//끝말잇기
public class Day02_ex04_1_check {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String start = "자전거";
		while (true) {

			System.out.println("제시어 : " + start);

			System.out.println("입력 :");
			String next = in.next();

			char last = start.charAt(start.length() - 1);

			if (last != next.charAt(0)) {
				continue;
			} else {
				start = next;
			}
		}

	}

}
