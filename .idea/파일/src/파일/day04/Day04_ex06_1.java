package ����.day04;

//���ڿ� ��

import java.util.Random;
import java.util.Scanner;

public class Day04_ex06_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String name = "�ڳ���";

		System.out.print("���� �̸��� �Է��ϼ��� : "); // ex) Ƽ�����罺
		String myName = tt.next();

		int cnt = 0;
		if (name.length() == myName.length()) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) == myName.charAt(i)) {
					cnt++;
				}
			}
			if (cnt == name.length()) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}
		} else {
			System.out.println("FALSE");
		}
	}
}
