package 파일.day04;

import java.io.FileWriter;

//파일 저장하기 연습문제 2

import java.util.Random;
import java.util.Scanner;

public class Day04_ex18_2_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String[] names = { "momk", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };

		String fileName = "fileTest02.txt";

		String data = "";
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			for (int i = 0; i < names.length; i++) {
				data += names[i] + "/" + pws[i] + "/" + moneys[i];
				fw.write(data);
				if (i != names.length - 1) {
					fw.write("\n");
				}

				data = "";
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
