package ����.day04;

//���� ó��

import java.util.Random;
import java.util.Scanner;

public class Day04_ex16_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		int num = 1;
		int num2 = 2;

		try {
			System.out.println(num / num2);
		} catch (Exception e) {
			System.out.println("�ҷ�");
		} finally {
			System.out.println("������� ������ ��");
		}

	}
}
