package ����.day07;

import java.io.FileWriter;
//���� ��Ʈ�ѷ�(3) : ��ٱ���
import java.util.Random;
import java.util.Scanner;

public class Day07_ex22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "���", "�ٳ���", "����" };

		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";

		int count = 0;
		int log = -1;

		while (true) {

			System.out.println("[MEGA SHOP]");
			System.out.println("[1]�α���");
			System.out.println("[2]�α׾ƿ�");
			System.out.println("[3]����");
			System.out.println("[4]��ٱ���");
			System.out.println("[5]����");
			System.out.println("[6]�ε�");
			System.out.println("[0]����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("���̵� �Է� : ");
					String id = scan.next();

					System.out.println("���� �Է� : ");
					String pw = scan.next();

					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("���̵� ��� ��Ȯ�� �ٶ�");
						continue;
					} else {
						System.out.println("�α��� ����!");
					}
				} else {
					System.out.println("�̹� �α��� ���Դϴ�.");
					continue;
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿� �ٶ�");
					continue;
				} else {
					log = -1;
					System.out.println("�α׾ƿ� �Ϸ�");
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿� ����");
					continue;

				} else {
					for (int i = 0; i < items.length; i++) {
						System.out.print((i + 1) + "�� " + items);
					}

					System.out.println("������ ��ǰ ��ȣ �Է� : ");
					int answer = scan.nextInt();

					jang[count][0] = log;
					jang[count][1] = answer - 1;
					count++;
					System.out.println("��ٱ��Ͽ� �����ϴ�.");
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α��� �Ŀ� �̿� ����");
					continue;

				} else {
					for (int i = 0; i < count; i++) {
						if (jang[i][0] == log) {
							if (jang[i][1] == 0) {
								System.out.print("���  ");
							} else if (jang[i][1] == 1) {
								System.out.print("�ٳ���  ");
							} else if (jang[i][1] == 2) {
								System.out.print("����");
							}
						}

					}

				}

			} else if (sel == 5) {
				FileWriter fw = null;

			} else if (sel == 6) {

			} else if (sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}
