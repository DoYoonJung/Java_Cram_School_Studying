package 배열심화.day02;

import java.util.Random;
import java.util.Scanner;

//쇼핑몰[관리자]
public class Day01_ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		Scanner scan = new Scanner(System.in);

		String[][] items = new String[100][2];
		for (int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}

		int itemCount = 0;

		while (true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");

			System.out.print(": ");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.println("추가할 카테고리를 입력 : ");
				String answer = in.next();

				int check1 = 0;

				for (int k = 0; k < items.length; k++) {
					if (items[k][0].equals(answer)) {
						check1 = 1;
					}
				}

				if (check1 == 1) {
					System.out.println("중복되는 카테고리가 있습니다.");
					continue;
				} else if (check1 == 0) {
					System.out.println("카테고리에 추가 되었습니다.");
					items[itemCount][0] = answer;
					itemCount++;
				}
			} else if (sel == 2) {
				System.out.println("추가하고 싶은 아이템 카테고리를 입력 : ");
				String answer = in.next();

				int check2 = -1;
				for (int k = 0; k < items.length; k++) {
					if (items[k][0].equals(answer)) {
						check2 = k;
					}
				}

				if (check2 == -1) {
					System.out.println("해당하는 카테고리가 없습니다.");
					continue;
				} else {
					System.out.println("추가할 아이템을 입력 : ");
					String item = in.next();

					items[check2][1] += item;
					items[check2][1] += "/";
				}
			} else if (sel == 3) {
				for (int k = 0; k < itemCount; k++) {
					System.out.println(items[k][0] + "의 아이템은 " + items[k][1]);
				}
			}

		}

	}
}
