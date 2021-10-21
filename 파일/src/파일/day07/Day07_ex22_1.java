package 파일.day07;

import java.io.FileWriter;
//파일 컨트롤러(3) : 장바구니
import java.util.Random;
import java.util.Scanner;

public class Day07_ex22_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };

		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";

		int count = 0;
		int log = -1;

		while (true) {

			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("아이디 입력 : ");
					String id = scan.next();

					System.out.println("버번 입력 : ");
					String pw = scan.next();

					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("아이디 비번 재확인 바람");
						continue;
					} else {
						System.out.println("로그인 성공!");
					}
				} else {
					System.out.println("이미 로그인 중입니다.");
					continue;
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그인 후에 이용 바람");
					continue;
				} else {
					log = -1;
					System.out.println("로그아웃 완료");
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("로그인 후에 이용 가능");
					continue;

				} else {
					for (int i = 0; i < items.length; i++) {
						System.out.print((i + 1) + "번 " + items);
					}

					System.out.println("구입할 상품 번호 입력 : ");
					int answer = scan.nextInt();

					jang[count][0] = log;
					jang[count][1] = answer - 1;
					count++;
					System.out.println("장바구니에 들어갔습니다.");
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후에 이용 가능");
					continue;

				} else {
					for (int i = 0; i < count; i++) {
						if (jang[i][0] == log) {
							if (jang[i][1] == 0) {
								System.out.print("사과  ");
							} else if (jang[i][1] == 1) {
								System.out.print("바나나  ");
							} else if (jang[i][1] == 2) {
								System.out.print("딸기");
							}
						}

					}

				}

			} else if (sel == 5) {
				FileWriter fw = null;

			} else if (sel == 6) {

			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
