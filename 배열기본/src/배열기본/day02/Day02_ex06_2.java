package �迭�⺻.day02;

//���� ����
import java.util.Random;
import java.util.Scanner;

public class Day02_ex06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		int t = 0;

		while (t < 1000) {
			int b = tt.nextInt(10);
			int temp = front[0];
			front[0] = front[b];
			front[b] = temp;

			t++;
		}

		for (int i = 0; i < front.length; i++) {
			System.out.print(front[i] + " ");
		}

		System.out.println();

		while (true) {
			System.out.println("���� 1 : ");
			int number1 = in.nextInt();

			System.out.println("���� 2 : ");
			int number2 = in.nextInt();

			if (front[number1] == front[number2]) {
				System.out.println("����!");
				back[number1] = front[number1];
				back[number2] = front[number2];

			}

			else {
				System.out.println("Ʋ�Ƚ��ϴ�. �ٽ� ������ �ּ���");
				continue;
			}
			int cnt = 0;

			for (int w = 0; w < back.length; w++) {
				if (back[w] != 0) {
					cnt++;
				}
			}

			if (cnt == 10) {
				System.out.println("��!");
				break;
			}
		}
	}

}
