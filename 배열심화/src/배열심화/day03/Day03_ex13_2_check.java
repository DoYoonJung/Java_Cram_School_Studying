package ¹è¿­½ÉÈ­.day03;

//2Â÷¿ø¹è¿­(Á¤·Ä)
import java.util.Scanner;

public class Day03_ex13_2_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int jangCount = 5;
		String[][] jang = { { "Ã¶¼ö", "±è¹ä" }, { "¿µÈñ", "°¨" }, { "Ã¶¼ö", "»ç°ú" }, { "¿µÈñ", "»ç°ú" }, { "¿µÈñ", "±è¹ä" } };

		for (int i = 0; i < jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}

		System.out.println();

		for (int i = 0; i < jang.length; i++) {
			String min = jang[i][0];
			int a = i;
			for (int j = i; j < jang.length; j++) {
				if (min.compareTo(jang[j][0]) > 0) {
					min = jang[j][0];
					a = j;
				}
			}

			String[] temp = jang[a];
			jang[a] = jang[i];
			jang[i] = temp;
		}
		for (int i = 0; i < jang.length; i++) {
			String min = jang[i][1];
			int a = i;
			for (int j = i; j < jang.length; j++) {
				if (jang[i][0].equals(jang[j][0])) {
					if (min.compareTo(jang[j][1]) > 0) {
						min = jang[j][1];
						a = j;
					}
				}

			}
			String[] temp = jang[i];
			jang[i] = jang[a];
			jang[a] = temp;
		}

		for (int i = 0; i < jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}

	}

}
