package �迭�⺻.day03;

//�迭 ��Ʈ�ѷ�(1�ܰ�)
import java.util.Scanner;

public class Day03_ex09_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0 };
		int cnt = 2;

		boolean run = true;
		while (run) {

			for (int i = 0; i < cnt; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("[1]�߰�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (cnt == 5) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue;
				}
				System.out.print("�߰��� �� �Է� : ");
				int data = scan.nextInt();

				arr[cnt] = data;
				cnt++;

			}

			if (sel == 2) {

				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();

				int index = -1;

				for (int i = 0; i < arr.length; i++) {
					if (data == arr[i]) {
						index = i;
					}

				}
				if (index == -1) {
					continue;
				}
				for (int i = index; i < cnt - 1; i++) {
					arr[i] = arr[i + 1];
				}
				cnt--;
			}

			if (sel == 3) {

				System.out.print("������ ��ġ �Է� : ");
				int idx = scan.nextInt();

				System.out.print("������ �� �Է� : ");
				int data = scan.nextInt();

				for (int i = cnt; idx < i; i--) {
					arr[i] = arr[i - 1];
				}
				arr[idx] = data;
				cnt++;
			}
		}
	}
}
