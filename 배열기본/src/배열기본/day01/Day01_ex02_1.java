package 배열기본.day01;

//학생성적관리 프로그램 1단계

//19:31~19:
import java.util.Scanner;

public class Day01_ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("정수 : ");
			int a = in.nextInt();

			arr[i] = a;
		}

		int total = 0;
		int mean = 0;

		for (int i = 0; i < 5; i++) {
			total += arr[i];

		}
		mean = total / 5;

		System.out.println(total + " " + mean);
	}

}
