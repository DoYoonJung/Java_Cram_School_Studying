package �迭�⺻.day01;

//�л��������� ���α׷� 4�ܰ�

//19:31~19:
import java.util.Scanner;

public class Day01_ex02_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };

		int a = scores[0];
		int b = 0;
		for (int i = 0; i < scores.length; i++) {
			if (a < scores[i]) {
				a = scores[i];
				b = i;
			}
		}

		System.out.println("1���л��� �й� : " + hakbuns[b] + " ������ : " + a);

	}

}
