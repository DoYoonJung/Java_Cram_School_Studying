package ����.day04;

import java.io.FileWriter;

//���� �����ϱ�

import java.util.Random;
import java.util.Scanner;

public class Day04_ex17_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String fileName = "ex01.txt";

		FileWriter fw = null;

		try {
			fw = new FileWriter(fileName);
			fw.write("���������ϱ� ��������");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
