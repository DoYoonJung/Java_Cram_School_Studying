package �迭��ȭ.day02;

import java.util.Random;
import java.util.Scanner;

//���θ�[������]
public class Day01_ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		Scanner scan = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}

		int itemCount = 0;

		while (true) {

			System.out.println("[������ ���]");
			System.out.println("[1]ī�װ� ����");
			System.out.println("[2]�� �� ��  ����");
			System.out.println("[3]��üǰ�� ���");

			System.out.print(": ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("�߰��� ī�װ��� �Է� : ");
				String answer = in.next();

				int check1 = 0;

				for (int k = 0; k < items.length; k++) {
					if (items[k][0].equals(answer)) {
						check1 = 1;
					}
				}

				if (check1 == 1) {
					System.out.println("�ߺ��Ǵ� ī�װ��� �ֽ��ϴ�.");
					continue;
				} else if (check1 == 0) {
					System.out.println("ī�װ��� �߰� �Ǿ����ϴ�.");
					items[itemCount][0] = answer;
					itemCount++;
				}
			} else if (sel == 2) {
				System.out.println("�߰��ϰ� ���� ������ ī�װ��� �Է� : ");
				String answer = in.next();

				int check2 = -1;
				for (int k = 0; k < items.length; k++) {
					if (items[k][0].equals(answer)) {
						check2 = k;
					}
				}

				if (check2 == -1) {
					System.out.println("�ش��ϴ� ī�װ��� �����ϴ�.");
					continue;
				} else {
					System.out.println("�߰��� �������� �Է� : ");
					String item = in.next();

					items[check2][1] += item;
					items[check2][1] += "/";
				}
			} else if (sel == 3) {
				for (int k = 0; k < itemCount; k++) {
					System.out.println(items[k][0] + "�� �������� " + items[k][1]);
				}
			}

		}

	}
}
