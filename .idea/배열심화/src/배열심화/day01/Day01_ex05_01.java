package �迭��ȭ.day01;

import java.util.Random;
import java.util.Scanner;

//ATM(4)
public class Day01_ex05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int count = 0;
		int log = -1;

		String menu = "=== �ް�IT ATM ===\n";
		menu += "1.ȸ������\n2.ȸ��Ż��\n3.�α���\n4.�α׾ƿ�\n";
		menu += "5.�Ա�\n6.��ü\n7.�ܾ���ȸ\n0.����";

		while (true) {

			for (int g = 0; g < count; g++) {
				System.out.print(arId[g] + " ");
			}
			System.out.println();
			for (int g = 0; g < count; g++) {
				System.out.print(arPw[g] + " ");
			}
			System.out.println();
			for (int g = 0; g < count; g++) {
				System.out.print(arMoney[g] + " ");
			}
			System.out.println();

			System.out.println(menu);

			int sel = in.nextInt();

			if (sel == 1) {
				if (count == 5) {
					System.out.println("�� �̻� ȸ������ �� �� �����ϴ�.");
					continue;
				}
				int check = 0;
				System.out.println("���̵� �Է��ϼ��� : ");
				int id = in.nextInt();

				System.out.println("��й�ȣ�� �Է��ϼ��� : ");
				int pw = in.nextInt();

				for (int i = 0; i < MAX; i++) {
					if (arId[i] != id && arPw[i] != pw) {
						check = -1;
					}

				}

				if (check == 0) {
					System.out.println("�ߺ��� ���̵� ��й�ȣ�� �ֽ��ϴ�.");
				} else {
					System.out.println("ȸ������ �Ǿ����ϴ�.");
					arId[count] = id;
					arPw[count] = pw;
					arMoney[count] = 1000;
					count++;
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿��� �ּ���");
					continue;
				} else {
					for (int i = log; i < count - 1; i++) {
						arId[i] = arId[i + 1];
						arPw[i] = arPw[i + 1];
						arMoney[i] = arMoney[i + 1];

					}
					count--;
					System.out.println("ȸ��Ż�� �Ϸ� �Ǿ����ϴ�.");

					log = -1;

				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("���̵� �Է��Ͻÿ� : ");
					int id = in.nextInt();
					System.out.println("��й�ȣ�� �Է��Ͻÿ� : ");
					int pw = in.nextInt();

					for (int i = 0; i < MAX; i++) {
						if (arId[i] == id && arPw[i] == pw) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("�ش� ���̵�� ��й�ȣ�� �����ϴ�.");
					} else {
						System.out.println("�α��� ����");
					}
				} else {
					System.out.println("�̹� �α��� ���Դϴ�.");
					continue;
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�α׾ƿ��� �Ϸ� �Ǿ����ϴ�.");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�󸶸� �Ա��Ͻðڽ��ϱ� : ");
					int a = in.nextInt();

					arMoney[log] += a;
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�󸶸� ��ü�Ͻðڽ��ϱ� : ");
					int a = in.nextInt();
					if (arMoney[log] >= a) {
						arMoney[log] -= a;
					} else {
						System.out.println("�ܾ��� �����մϴ�.");
					}

				}
			} else if (sel == 7) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿��� �ּ���");
					continue;
				} else {
					System.out.println(arId[log] + " ���� �ܾ��� " + arMoney[log] + "�� �Դϴ�.");
				}
			} else if (sel == 0) {
				break;
			}
		}

	}
}
