package 배열심화.day02;

import java.util.Random;
import java.util.Scanner;

//쇼핑몰[장바구니]
public class Day01_ex11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };

		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		int count = 0;

		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;

		while (true) {

			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");

			System.out.print("메뉴 선택 : ");
			int sel = in.nextInt();

			if (sel == 1) {
				if (log == -1) {
					System.out.println("아이디를 입력해주세요:");
					String id = in.next();

					System.out.println("비밀번호를 입력해주세요:");
					String pw = in.next();

					for (int i = 0; i < ids.length; i++) {
						if (ids[i].equals(id) && pws[i].equals(pw)) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("해당 아이디와 비밀번호를 재확인 해주세요");
					} else {
						System.out.println("로그인 성공");
					}
				} else {
					System.out.println("이미 로그인 중");

				}

			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그아웃 후 이용가능");
				} else {
					System.out.println("로그아웃이 완료되었습니다.");
					log = -1;
				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("로그아웃 후 이용가능");
				} else {
					System.out.println("-----메뉴-----");
					for (int i = 0; i < items.length; i++) {
						System.out.print((i + 1) + ". " + items[i] + " ");
					}
					System.out.println();

					System.out.println("구입할 상품의 번호 입력 : ");
					int number = in.nextInt();

					jang[count][0] = log;
					jang[count][1] = number;
					count++;
				}
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그아웃 후 이용가능");
				} else {
					for (int i = 0; i < jang.length; i++) {
						if (jang[i][0] == log) {
							if (jang[i][1] == 1) {
								System.out.print("사과" + " ");
							} else if (jang[i][1] == 2) {
								System.out.print("바나나" + " ");
							} else if (jang[i][1] == 3) {
								System.out.print("딸기" + " ");
							}
						}
					}
				}
				System.out.println();
			} else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
}
