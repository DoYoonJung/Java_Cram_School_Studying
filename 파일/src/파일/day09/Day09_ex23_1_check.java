package 파일.day09;

//식권 자판기
import java.util.Random;
import java.util.Scanner;

public class Day09_ex23_1_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random in = new Random();

		Scanner scan = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5; // 식권 개수
		int price = 3200; // 식권 가격

		while (true) {

			System.out.println("[1]관리자");
			System.out.println("[2]사용자");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				while (true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");

					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						tickets++;
						System.out.println("현재 식원 " + tickets + "개");

					} else if (choice == 2) {
						while (true) {
							for (int i = 0; i < money.length; i++) {
								System.out.println(i + ". " + money[i] + "원 " + charges[i] + "개");
							}
							System.out.println("뒤로가기 6");
							int charge = scan.nextInt();
							for (int i = 0; i < money.length; i++) {
								if (charge == i) {
									charges[i]++;
									System.out.println(money[i] + "원 1개를 충전하였습니다.");
								}
							}

							if (charge == 6) {
								break;
							}
						}

					} else if (choice == 3) {
						break;
					}
				}

			} else if (sel == 2) {
				while (true) {
					System.out.println("[ 식권 가격 : " + price + " ]");
					System.out.println("[ 식권 개수 : " + tickets + " ]");
					System.out.println();
					for (int i = 0; i < money.length; i++) {
						System.out.println("[" + money[i] + "원]" + charges[i] + "매");
					}

					System.out.println("1)구입");
					System.out.println("2)뒤로가기");

					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if (choice == 1) {
						int[] aaa = new int[6];
						int input = 0;
						int exchange = 0;
						System.out.println("입금할 금액 입력: ");
						while (true) {

							for (int i = 0; i < money.length; i++) {
								System.out.print(i + ". [" + money[i] + "원]" + " ");
							}
							System.out.print("6" + ". [" + "종료]" + " ");
							int answer = scan.nextInt();

							for (int i = 0; i < money.length; i++) {
								if (answer == i) {
									input += money[i];
									aaa[i]++;
								}
							}
							if (answer == 6) {
								break;
							}
							System.out.println("입금한 금액 :" + input);

						}

						System.out.println("식권 매수 입력 :");
						int cnt = scan.nextInt();

						if (cnt > tickets) {
							System.out.println("식권 부족");
							break;
						}

						if (price * cnt > input) {
							System.out.println("살 돈 부족");
							break;
						}

						else if (price * cnt <= input) {
							tickets -= cnt;
							input = input - price * cnt;
							for (int i = 0; i < money.length; i++) {
								if (input / money[i] != 0) {

									int a = input / money[i];
									System.out.println(money[i] + " " + a);
									aaa[i] -= a;
									exchange += a * money[i];
									if (charges[i] - a < 0) {
										System.out.println("잔돈부족");
										break;
									}
									input = input % money[i];
								}
							}
						}
						for (int i = 0; i < money.length; i++) {
							charges[i] = charges[i] + aaa[i];
						}

						System.out.println("가격 : " + (cnt * price) + "잔돈 : " + exchange);

					} else if (choice == 2) {
						break;
					}
				}
			}

		}
	}
}
