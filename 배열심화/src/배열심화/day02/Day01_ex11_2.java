package �迭��ȭ.day02;

import java.util.Random;
import java.util.Scanner;

//���θ�[��ٱ���]
public class Day01_ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = { "���", "�ٳ���", "����" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]�� �� ��");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]��     ��");
			System.out.println("[4]��ٱ���");
			System.out.println("[0]��     ��");

			System.out.print("�޴� ���� : ");
			int sel = in.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("���̵� �Է����ּ���:");
					String id = in.next();

					System.out.println("��й�ȣ�� �Է����ּ���:");
					String pw = in.next();

					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("�ش� ���̵�� ��й�ȣ�� ��Ȯ�� ���ּ���");
					} else {
						System.out.println("�α��� ����");
					}
				} else {
					System.out.println("�̹� �α��� ��");

				}

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�α׾ƿ� �� �̿밡��");
				} else {
					System.out.println("�α׾ƿ��� �Ϸ�Ǿ����ϴ�.");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("�α׾ƿ� �� �̿밡��");
				} else {
					System.out.println("-----�޴�-----");
					for (int i = 0; i < items.length; i++) {
						System.out.print((i + 1) + ". " + items[i] + " ");
					}
					System.out.println();

					System.out.println("������ ��ǰ�� ��ȣ �Է� : ");
					int number = in.nextInt();

					jang[count][0] = log;
					jang[count][1] = number;
					count++;
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α׾ƿ� �� �̿밡��");
				} else {
					for (int i = 0; i < jang.length; i++) {
						if (jang[i][0] == log) {
							if (jang[i][1] == 1) {
								System.out.print("���" + " ");
							} else if (jang[i][1] == 2) {
								System.out.print("�ٳ���" + " ");
							} else if (jang[i][1] == 3) {
								System.out.print("����" + " ");
							}
						}
					}
				}
				System.out.println();
			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}
