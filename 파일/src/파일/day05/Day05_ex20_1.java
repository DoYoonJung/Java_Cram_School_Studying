package 파일.day05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//파일 컨트롤러(1): 백터

import java.util.Random;
import java.util.Scanner;

public class Day05_ex20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		int[] vector = null;
		String data = "";

		int count = 0;

		int[] temp = null;
		String fileName = "vector.txt";

		while (true) {

			for (int a = 0; a < count; a++) {
				System.out.print(vector[a] + " ");
			}

			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (count == 0) {
					vector = new int[count + 1];
				}

				else if (count > 0) {
					temp = vector;
					vector = new int[count + 1];
				}

				for (int i = 0; i < count; i++) {
					vector[i] = temp[i];
				}
				temp = null;
				System.out.println("추가할 값을 입력 : ");
				int answer = scan.nextInt();
				vector[count] = answer;
				count++;
			}

			else if (sel == 2) {
				if (count == 1) {
					vector = null;
				} else if (count > 1) {

					temp = vector;
					vector = new int[count - 1];

					System.out.println("삭제할 인덱스 입력 : ");
					int delete = scan.nextInt();

					int k = 0;
					for (int i = 0; i < count; i++) {
						if (i != delete) {
							vector[k] = temp[i];
							k++;
						}
					}
					temp = null;
					count--;
				}
			} else if (sel == 3) {

				FileWriter fw = null;

				try {
					fw = new FileWriter(fileName);
					for (int i = 0; i < count; i++) {
						data += vector[i];
						if (i != count - 1) {
							data += "/";
						}

					}

					fw.write(data);
					data = "";
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (sel == 4) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;

				if (file.exists()) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						String line = br.readLine();
						String[] temp1 = line.split("/");
						for (int i = 0; i < count; i++) {
							vector[i] = Integer.parseInt(temp1[i]);
						}
						fr.close();
						br.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else if (sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
