package �迭�⺻.day01;

//�Ҽ�ã��

//19:20~19:30
import java.util.Scanner;

public class Day01_ex12_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("���� �Է� : ");
		int answer = in.nextInt();

		for (int i = 2; i <= answer; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}

			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}

	}

}
