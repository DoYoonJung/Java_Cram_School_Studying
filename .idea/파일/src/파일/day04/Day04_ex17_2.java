package 파일.day04;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
//파일 저장하기

import java.util.Random;
import java.util.Scanner;

public class Day04_ex17_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();
		Scanner tt = new Scanner(System.in);

		String fileName = "ex01.txt";

		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		if (file.exists()) {
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String data = br.readLine();
				System.out.println(data);
				fr.close();
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
