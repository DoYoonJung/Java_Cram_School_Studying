package 파일.day04;

//예외 처리

import java.util.Random;
import java.util.Scanner;

public class Day04_ex16_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		int num = 1;
		int num2 = 2;

		try {
			System.out.println(num / num2);
		} catch (Exception e) {
			System.out.println("할롱");
		} finally {
			System.out.println("상관없이 나오는 글");
		}

	}
}
