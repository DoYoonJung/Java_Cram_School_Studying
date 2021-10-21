package ����.day06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Day06_ex21_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		int size = 5;
		int count = 0;
		int log = -1;

		String data = "";
		String[] accs = new String[size];
		String[] pws = new String[size];
		int[] moneys = new int[size];

		String fileName = "atm.txt";

		while (true) {
			for (int i = 0; i < count; i++) {
				System.out.print(accs[i] + "/" + pws[i] + "/" + moneys[i]);
			}
			System.out.println("[MEGA ATM]");
			System.out.println("[1]ȸ������");
			System.out.println("[2]ȸ��Ż��");
			System.out.println("[3]�α���");
			System.out.println("[4]�α׾ƿ�");
			System.out.println("[5]�Ա�");
			System.out.println("[6]���");
			System.out.println("[7]��ü");
			System.out.println("[8]�ܾ���ȸ");
			System.out.println("[9]����");
			System.out.println("[10]�ε�");
			System.out.println("[0]����");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				int check = -1;

				if (count == 5) {
					System.out.println("ȸ�� �ʰ�");
					continue;
				}
				System.out.println("���̵� �Է�: ");
				String id = scan.next();

				System.out.println("��й�ȣ �Է�: ");
				String pw = scan.next();

				for (int i = 0; i < size; i++) {
					if (id.equals(accs[i]) || pw.equals(pws[i])) {
						check = 1;
					}
				}

				if (check == -1) {
					System.out.println("ȸ������ ����!");
					accs[count] = id;
					pws[count] = pw;
					moneys[count] += 1000;

					count++;
				} else {
					System.out.println("�ߺ� Ȯ��! ��Ȯ�� �ٶ�!");

					continue;
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				}

				else {
					System.out.println("ȸ�� Ż�� �Ϸ�");

					for (int i = log; i < count - 1; i++) {
						accs[i] = accs[i + 1];
						pws[i] = pws[i + 1];
						moneys[i] = moneys[i + 1];
					}

					count--;

					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("���̵� �Է�: ");
					String id = scan.next();

					System.out.println("��й�ȣ �Է�: ");
					String pw = scan.next();

					for (int i = 0; i < size; i++) {
						if (id.equals(accs[i]) && pw.equals(pws[i])) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("�α��� ����");
						continue;
					} else {
						System.out.println(accs[log] + "�� �������");
					}
				} else {
					System.out.println("�̹� �α��� ���Դϴ�.");
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�α׾ƿ� �Ϸ�");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�󸶸� �Ա� �Ͻðڽ��ϱ� : ");
					int money = scan.nextInt();

					moneys[log] += money;
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				} else {
					System.out.println("�󸶸� ��� �Ͻðڽ��ϱ� : ");
					int money = scan.nextInt();

					if (moneys[log] - money < 0) {
						System.out.println("�ܾ��� �ʰ��մϴ�.");
						continue;
					}
					moneys[log] -= money;
				}
			} else if (sel == 7) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				} else {

					int check = -1;

					System.out.println("��ü�� ���̵� �Է� : ");
					String id = scan.next();

					for (int i = 0; i < count; i++) {
						if (id.equals(accs[i])) {
							check = i;
						}
					}

					if (check == -1) {
						System.out.println("��ü�� ���̵� ����");
						continue;
					} else {
						System.out.println("��ü�� �ݾ� �Է� : ");
						int money = scan.nextInt();

						if (moneys[log] - money < 0) {
							System.out.println("�ܾ׺���");
							continue;
						}
						moneys[log] -= money;
						moneys[check] += money;

					}
				}
			} else if (sel == 8) {
				if (log == -1) {
					System.out.println("�α��� �� �̿��� �ּ���");
					continue;
				} else {

					System.out.print(accs[log] + "�� : " + moneys[log] + "��");

				}
			} else if (sel == 9) {
				FileWriter fw = null;

				for (int i = 0; i < count; i++) {
					data += accs[i] + "/";
					data += pws[i] + "/";
					data += moneys[i] + "\n";
				}
				data = data.substring(0, data.length() - 1);

				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (sel == 10) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						while (true) {
							String line = br.readLine();

							if (line == null) {
								break;
							}

							data += line;
							data += "\n";
						}

						data = data.substring(0, data.length() - 1);

						String[] temp = data.split("\n");

						count = temp.length;

						accs = new String[count];
						pws = new String[count];
						moneys = new int[count];

						for (int i = 0; i < count; i++) {
							String[] temp1 = temp[i].split("/");

							accs[i] = temp1[0];
							pws[i] = temp1[1];
							moneys[i] = Integer.parseInt(temp1[2]);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 0) {
				break;
			}

		}
	}
}
