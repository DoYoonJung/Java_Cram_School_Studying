package ����.day02;

import java.util.Scanner;

//�����ձ�
public class Day02_ex04_1_check {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String start = "������";
		while (true) {

			System.out.println("���þ� : " + start);

			System.out.println("�Է� :");
			String next = in.next();

			char last = start.charAt(start.length() - 1);

			if (last != next.charAt(0)) {
				continue;
			} else {
				start = next;
			}
		}

	}

}
