package 파일.day04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//파일 로드하기 연습문제

import java.util.Random;
import java.util.Scanner;

public class Day04_ex19_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;

		String[] temp = null;
		String fileName = "fileTest02.txt";
		String[] temp2 = null;

		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;

		String data = "";
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				while (true) {
					String line = br.readLine();

					if (line == null) {
						break;
					}
					data += line;

					data += "\n";
				}

				data = data.substring(0, data.length() - 1);

				temp = data.split("\n");
				System.out.println(temp.length);
				ids = new String[temp.length];
				pws = new String[temp.length];
				moneys = new int[temp.length];

				for (int i = 0; i < temp.length; i++) {
					temp2 = temp[i].split("/");

					ids[i] = temp2[0];
					pws[i] = temp2[1];
					moneys[i] = Integer.parseInt(temp2[2]);

					temp2 = null;
				}
				fr.close();
				br.close();

				for (int i = 0; i < ids.length; i++) {
					System.out.print(ids[i] + " " + pws[i] + " " + moneys[i]);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
