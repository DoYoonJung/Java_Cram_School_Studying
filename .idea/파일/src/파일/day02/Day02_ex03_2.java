package ����.day02;

import java.util.Scanner;

//���ڿ� �� 2����
public class Day02_ex03_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String[] name = { "��ö��", "�̸���", "�̿���" };
		int[] score = { 87, 42, 95 };

		String str = "";

		for (int i = 0; i < name.length; i++) {
			str += name[i] + "/" + score[i];

			if (i != name.length - 1) {
				str += ",";
			}

		}

		System.out.println(str);

	}

}
