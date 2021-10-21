package 파일.day04;

import java.io.FileWriter;

//파일 저장하기

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
			fw.write("파일저장하기 연습문제");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
