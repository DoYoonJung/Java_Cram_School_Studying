package 배열기본.day03;

//삼각형 그리기
import java.util.Scanner;

public class Day03_ex10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("#");
			}
			for (int k = i + 1; k < 3; k++) {
				System.out.print("@");

			}
			System.out.println();
		}
		System.out.println();

		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= k; j++) {
				System.out.print("#");
			}
			System.out.println();
			k += 2;
		}

	}
}
