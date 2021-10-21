package 배열기본.day02;

//기억력 게임
import java.util.Random;
import java.util.Scanner;

public class Day02_ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int[] game = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int turn = 0;

		int idx1 = 0;
		int idx2 = 0;
		p1[idx1] = 1;
		p2[idx2] = 2;

		while (true) {
			for (int i = 0; i < game.length; i++) {
				System.out.println(game[i] + " ");
				System.out.println(p1[i] + " ");
				System.out.println(p2[i] + " ");
			}
			System.out.println();

		}

	}

}
