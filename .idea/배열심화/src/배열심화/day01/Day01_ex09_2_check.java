package 배열심화.day01;

import java.util.Random;
import java.util.Scanner;

//사다리 게임
public class Day01_ex09_2_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random tt = new Random();

		int ladder[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0 },
				{ 1, 1, 0, 0, 0 }, { 0, 1, 1, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };

		int x = 0;
		int y = 0;

		System.out.println("0~4입력 :");
		x = in.nextInt();

		for (int i = 0; i < ladder.length; i++) {
			if (ladder[y][x] == 0) {
				y++;
			} else if (ladder[y][x] == 1) {
				if (ladder[y][x - 1] == 1 && x != 0) {
					x--;
				}
			}
		}
	}
}
