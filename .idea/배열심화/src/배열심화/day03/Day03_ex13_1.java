package ¹è¿­½ÉÈ­.day03;

//2Â÷¿ø¹è¿­(»èÁ¦)
import java.util.Scanner;

public class Day03_ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		String[][] jang = { { "Ã¶¼ö", "¼Ò°í±â" }, { "Ã¶¼ö", "±è¹ä" }, { "¿µÈñ", "±èÄ¡" }, { "Ã¶¼ö", "¹Ù³ª³ª" }, { "Ã¶¼ö", "»õ¿ì±ø" },
				{ "¿µÈñ", "¿ÀÂ¡¾î" }, { "¿µÈñ", "¸À¹ã" } };
		int a = jang.length;
		int b = jang[0].length;

		while (true) {
			System.out.println("ÀÔ·Â : ");
			String name = in.next();

			System.out.println("»èÁ¦ : ");
			String delet = in.next();

			int one = -1;
			int two = -1;
			for (int i = 0; i < jang.length; i++) {
				for (int j = 0; j < jang[i].length; j++) {
					if (jang[i][0].equals(name)) {
						if (jang[i][j].equals(delet)) {
							one = i;
							two = j;
						}
					}
				}
			}

			if (one == -1 || two == -1) {
				System.out.println("ÇØ´çÇÏ´Â ³»¿ëÀÌ ¾ø½À´Ï´Ù. ´Ù½ÃÈ®ÀÎ");
				continue;
			} else if (one != -1 && two != -1) {
				System.out.println(one + "    " + two);
				String[][] temp = jang;
				jang = new String[a - 1][b];
				int k = 0;
				for (int i = 0; i < temp.length; i++) {
					int q = 0;
					for (int j = 0; j < temp[i].length; j++) {
						if (i != one) {
							jang[k][q] = temp[i][j];
							q++;
						}
					}
					if (i != one) {
						k++;
					}

				}
			}

			for (int i = 0; i < jang.length; i++) {
				for (int j = 0; j < jang[i].length; j++) {
					System.out.print(jang[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

}
