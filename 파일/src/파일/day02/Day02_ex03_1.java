package ����.day02;

import java.util.Scanner;

//���ڿ� �� 2����
public class Day02_ex03_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String str = "��ö��/87,�̸���/42,�̿���/95";

		String[] name = new String[3];
		int[] score = new int[3];

		String[] arr = str.split(",");

		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("/");
			name[i] = temp[0];
			score[i] = Integer.parseInt(temp[1]);
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " �� " + score[i] + "��");
		}

	}

}
