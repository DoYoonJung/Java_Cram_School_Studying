package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//ATM(4)
public class Day01_ex05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int MAX = 5;

		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];

		int count = 0;
		int log = -1;

		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";

		while (true) {

			for (int g = 0; g < count; g++) {
				System.out.print(arId[g] + " ");
			}
			System.out.println();
			for (int g = 0; g < count; g++) {
				System.out.print(arPw[g] + " ");
			}
			System.out.println();
			for (int g = 0; g < count; g++) {
				System.out.print(arMoney[g] + " ");
			}
			System.out.println();

			System.out.println(menu);

			int sel = in.nextInt();

			if (sel == 1) {
				if (count == 5) {
					System.out.println("더 이상 회원가입 할 수 없습니다.");
					continue;
				}
				int check = 0;
				System.out.println("아이디를 입력하세요 : ");
				int id = in.nextInt();

				System.out.println("비밀번호를 입력하세요 : ");
				int pw = in.nextInt();

				for (int i = 0; i < MAX; i++) {
					if (arId[i] != id && arPw[i] != pw) {
						check = -1;
					}

				}

				if (check == 0) {
					System.out.println("중복된 아이디 비밀번호가 있습니다.");
				} else {
					System.out.println("회원가입 되었습니다.");
					arId[count] = id;
					arPw[count] = pw;
					arMoney[count] = 1000;
					count++;
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("로그인 후에 이용해 주세요");
					continue;
				} else {
					for (int i = log; i < count - 1; i++) {
						arId[i] = arId[i + 1];
						arPw[i] = arPw[i + 1];
						arMoney[i] = arMoney[i + 1];

					}
					count--;
					System.out.println("회원탈퇴가 완료 되었습니다.");

					log = -1;

				}
			} else if (sel == 3) {
				if (log == -1) {
					System.out.println("아이디를 입력하시오 : ");
					int id = in.nextInt();
					System.out.println("비밀번호를 입력하시오 : ");
					int pw = in.nextInt();

					for (int i = 0; i < MAX; i++) {
						if (arId[i] == id && arPw[i] == pw) {
							log = i;
						}
					}

					if (log == -1) {
						System.out.println("해당 아이디와 비밀번호가 업습니다.");
					} else {
						System.out.println("로그인 성공");
					}
				} else {
					System.out.println("이미 로그인 중입니다.");
					continue;
				}

			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후에 이용해 주세요");
					continue;
				} else {
					System.out.println("로그아웃이 완료 되었습니다.");
					log = -1;
				}
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("로그인 후에 이용해 주세요");
					continue;
				} else {
					System.out.println("얼마를 입금하시겠습니까 : ");
					int a = in.nextInt();

					arMoney[log] += a;
				}
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("로그인 후에 이용해 주세요");
					continue;
				} else {
					System.out.println("얼마를 이체하시겠습니까 : ");
					int a = in.nextInt();
					if (arMoney[log] >= a) {
						arMoney[log] -= a;
					} else {
						System.out.println("잔액이 부족합니다.");
					}

				}
			} else if (sel == 7) {
				if (log == -1) {
					System.out.println("로그인 후에 이용해 주세요");
					continue;
				} else {
					System.out.println(arId[log] + " 님의 잔액은 " + arMoney[log] + "원 입니다.");
				}
			} else if (sel == 0) {
				break;
			}
		}

	}
}
