package ����.day09;

//�ı� ���Ǳ�
import java.util.Random;
import java.util.Scanner;

public class Day09_ex23_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5; // �ı� ����
		int price = 3200; // �ı� ����

		while (true) {

			System.out.println("[1]������");
			System.out.println("[2]�����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println("1)�ı�����");
					System.out.println("2)�ܵ�����");
					System.out.println("3)�ڷΰ���");

					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						tickets++;
						System.out.println("���� �Ŀ� " + tickets + "��");

					} else if (choice == 2) {
						while (true) {
							for (int i = 0; i < money.length; i++) {
								System.out.println(i + ". " + money[i] + "�� " + charges[i] + "��");
							}
							System.out.println("�ڷΰ��� 6");
							int charge = scan.nextInt();
							for (int i = 0; i < money.length; i++) {
								if (charge == i) {
									charges[i]++;
									System.out.println(money[i] + "�� 1���� �����Ͽ����ϴ�.");
								}
							}

							if (charge == 6) {
								break;
							}
						}

					} else if (choice == 3) {
						break;
					}
				}

			} else if (sel == 2) {
				while (true) {
					System.out.println("[ �ı� ���� : " + price + " ]");
					System.out.println("[ �ı� ���� : " + tickets + " ]");
					System.out.println();
					for (int i = 0; i < money.length; i++) {
						System.out.println("[" + money[i] + "��]" + charges[i] + "��");
					}

					System.out.println("1)����");
					System.out.println("2)�ڷΰ���");

					System.out.print("�޴� ���� : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						int[] aaa = new int[6];
						int input = 0;
						int exchange = 0;
						System.out.println("�Ա��� �ݾ� �Է�: ");
						while (true) {

							for (int i = 0; i < money.length; i++) {
								System.out.print(i + ". [" + money[i] + "��]" + " ");
							}
							System.out.print("6" + ". [" + "����]" + " ");
							int answer = scan.nextInt();

							for (int i = 0; i < money.length; i++) {
								if (answer == i) {
									input += money[i];
									aaa[i]++;
								}
							}
							if (answer == 6) {
								break;
							}
							System.out.println("�Ա��� �ݾ� :" + input);

						}

						System.out.println("�ı� �ż� �Է� :");
						int cnt = scan.nextInt();

						if (cnt > tickets) {
							System.out.println("�ı� ����");
							break;
						}

						if (price * cnt > input) {
							System.out.println("�� �� ����");
							break;
						}

						else if (price * cnt <= input) {
							tickets -= cnt;
							input = input - price * cnt;
							for (int i = 0; i < money.length; i++) {
								if (input / money[i] != 0) {

									int a = input / money[i];
									System.out.println(money[i] + " " + a);
									aaa[i] -= a;
									exchange += a * money[i];
									if (charges[i] - a < 0) {
										System.out.println("�ܵ�����");
										break;
									}
									input = input % money[i];
								}
							}
						}
						for (int i = 0; i < money.length; i++) {
							charges[i] = charges[i] + aaa[i];
						}

						System.out.println("���� : " + (cnt * price) + "�ܵ� : " + exchange);

					} else if (choice == 2) {
						break;
					}
				}
			}

		}
	}
}
