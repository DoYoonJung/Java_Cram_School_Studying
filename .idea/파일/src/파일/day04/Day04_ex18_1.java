package ����.day04;

import java.io.FileWriter;

//���� �����ϱ� �������� 1

import java.util.Random;
import java.util.Scanner;

public class Day04_ex18_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String[] names = { "��ö��", "�̸���", "�̿���" };
		int[] ages = { 20, 30, 40 };

		String fileName = "fileTest01.txt";

		String data = "";

		for (int i = 0; i < names.length; i++) {
			data += names[i] + "/";
			data += ages[i];
			if (i != names.length - 1) {
				data += ",";
			}
		}

		System.out.println(data);

		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
