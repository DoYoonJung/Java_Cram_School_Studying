package �迭��ȭ.day01;

//�ִ� ���ϱ�(3�ܰ�)
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
			System.out.println("�Է� :");
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
				System.out.println("����");
				arr[b] = 0;
				cnt++;
				if (cnt == 5) {
					System.out.println("���� ��");
					break;
				}
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}

		}

	}

}
