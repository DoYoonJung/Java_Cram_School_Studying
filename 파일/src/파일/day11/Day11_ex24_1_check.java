package 파일.day11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//콘솔 게시판
import java.util.Scanner;

public class Day11_ex24_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String fileName = "board.txt";

		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 5; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호
		File file = new File(fileName);

		if (file.exists()) {
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);

				String size = br.readLine();
				count = Integer.parseInt(size);

				String data = "";
				for (int i = 0; i < count; i++) {
					data += br.readLine();
					if (count - 1 != i) {
						data += "\n";
					}
				}
				if (count > 0) {
					String[] info = data.split("\n");
					board = new String[count][2];

					for (int i = 0; i < info.length; i++) {
						String[] temp = info[i].split("/");
						board[i][0] = temp[0];
						board[i][1] = temp[1];
					}
				}
				fr.close();
				br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		while (true) {

			pageCount = count / pageSize;
			if (count % pageSize > 0) {
				pageCount++;
			}

			startRow = (curPageNum - 1) * pageSize;
			endRow = startRow + pageSize;
			if (endRow > count) {
				endRow = count;
			}

			System.out.println("게시판 (" + count + ") 개");
			System.out.println("현재 페이지 : " + curPageNum);
			for (int i = startRow; i < endRow; i++) {
				System.out.println("(" + (i + 1) + ")" + board[i][0]);
			}
			System.out.println();
			System.out.println("[1]이전");

			System.out.println("[2]이후");
			System.out.println("[3]추가하기");
			System.out.println("[4]삭제하기");
			System.out.println("[5]내용확인");

			int choice = scan.nextInt();

			if (choice == 1) {
				if (curPageNum == 1) {
					continue;

				}
				curPageNum--;
			} else if (choice == 2) {
				if (curPageNum >= pageCount) {
					continue;
				}
				curPageNum++;
			} else if (choice == 3) {
				System.out.println("게시글 제목 : ");
				String s = scan.next();

				System.out.println("게시글 내용 : ");
				String s1 = scan.nextLine();

				if (count == 0) {
					board = new String[count + 1][2];
				} else if (count > 0) {
					String[][] temp = board;
					board = new String[count + 1][2];

					for (int i = 0; i < count; i++) {
						board[i] = temp[i];
					}
					temp = null;

				}
				board[count][0] = s;
				board[count][1] = s1;

				count++;

				String data = "";
				data += count;
				data += "\n";

				for (int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if (count - 1 != i) {
						data += "\n";
					}
				}
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);

					fw.write(data);
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (choice == 4) {
				System.out.println("삭제할 게시글의 번호 입력 : ");
				int number = scan.nextInt() - 1;

				if (startRow > number || endRow <= number) {
					continue;
				}

				if (count == 1) {
					board = null;
				} else if (count > 1) {
					String[][] temp = board;
					board = new String[count - 1][2];
					int k = 0;
					for (int i = 0; i < count; i++) {
						if (i != number) {
							board[k] = temp[i];
							k++;
						}
					}
					temp = null;

				}
				count--;

				String data = "";
				data += count;
				data += "\n";

				for (int i = 0; i < count; i++) {
					data += board[i][0];
					data += "/";
					data += board[i][1];
					if (count - 1 != i) {
						data += "\n";
					}
				}
				FileWriter fw = null;
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
				} catch (IOException e) {
					e.printStackTrace();
				}

			} else if (choice == 5) {
				System.out.println("확인할 게시글 번호 입력 :");
				int number = scan.nextInt() - 1;

				if (startRow <= number && number < endRow) {
					System.out.println("내용 = " + board[number][1]);
				}

			}
		}

	}
}