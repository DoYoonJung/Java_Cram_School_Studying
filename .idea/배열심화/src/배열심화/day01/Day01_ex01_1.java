package 배열심화.day01;

//최댓갑 구하기(3단계)
import java.util.Scanner;

public class Day01_ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = { 11, 87, 42, 100, 24 };
		int cnt = 0;
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.println("입력 :");
			int answer = in.nextInt();

			int a = 0;
			int b = 0;
			for (int i = 0; i < arr.length; i++) {
				if (a < arr[i]) {
					a = arr[i];
					b = i;
				}
			}

			if (a == answer) {
				System.out.println("정답");
				arr[b] = 0;
				cnt++;
				if (cnt == 5) {
					System.out.println("게임 끝");
					break;
				}
			} else {
				System.out.println("틀렸습니다.");
			}

		}

	}

}
