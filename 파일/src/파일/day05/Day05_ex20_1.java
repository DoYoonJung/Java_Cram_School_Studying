package ����.day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//���� ��Ʈ�ѷ�(1): ����

import java.util.Random;
import java.util.Scanner;

public class Day05_ex20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		String data = "";

		int count = 0;

		int[] temp = null;
		String fileName = "vector.txt";

		while (true) {

			for (int a = 0; a < count; a++) {
				System.out.print(vector[a] + " ");
			}

			System.out.println("[���� ��Ʈ�ѷ�]");
			System.out.println("[1]�߰��ϱ�");
			System.out.println("[2]�����ϱ�");
			System.out.println("[3]�����ϱ�");
			System.out.println("[4]�ε��ϱ�");
			System.out.println("[5]�����ϱ�");

			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (count == 0) {
					vector = new int[count + 1];
				}

				else if (count > 0) {
					temp = vector;
					vector = new int[count + 1];
				}

				for (int i = 0; i < count; i++) {
					vector[i] = temp[i];
				}
				temp = null;
				System.out.println("�߰��� ���� �Է� : ");
				int answer = scan.nextInt();
				vector[count] = answer;
				count++;
			}

			else if (sel == 2) {
				if (count == 1) {
					vector = null;
				} else if (count > 1) {

					temp = vector;
					vector = new int[count - 1];

					System.out.println("������ �ε��� �Է� : ");
					int delete = scan.nextInt();

					int k = 0;
					for (int i = 0; i < count; i++) {
						if (i != delete) {
							vector[k] = temp[i];
							k++;
						}
					}
					temp = null;
					count--;
				}
			} else if (sel == 3) {

				FileWriter fw = null;

				try {
					fw = new FileWriter(fileName);
					for (int i = 0; i < count; i++) {
						data += vector[i];
						if (i != count - 1) {
							data += "/";
						}

					}

					fw.write(data);
					data = "";
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (sel == 4) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						String line = br.readLine();
						String[] temp1 = line.split("/");
						for (int i = 0; i < count; i++) {
							vector[i] = Integer.parseInt(temp1[i]);
						}
						fr.close();
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 5) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}
}
