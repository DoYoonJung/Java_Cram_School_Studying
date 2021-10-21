package 배열심화.day03;

//중복숫자 제거
public class Day03_ex12_2_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = { 1, 2, 3, 2, 1 };
		int test2[] = { 1, 3, 4, 4, 2 };
		int test3[] = { 1, 1, 1, 2, 1 };

		int[] temp = new int[5];
		for (int i = 0; i < test1.length; i++) {
			int number = test3[i];
			int a = -1;
			int b = -1;
			for (int j = i; j < test1.length; j++) {
				if (number == test3[j] && i != j) {
					a = i;
					b = j;
				}
			}
			if (a != -1 && b != -1) {
				temp[a] = number;
				temp[b] = number;
			}

		}
		int count = 5;
		while (true) {
			int Zero = -1;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] == 0) {
					Zero = i;

				}
			}
			if (Zero != -1) {
				int k = 0;
				int[] arr = temp;
				temp = new int[count - 1];

				for (int i = 0; i < arr.length; i++) {
					if (i != Zero) {
						temp[k] = arr[i];
						k++;
					}
				}
				count--;
			} else {
				break;
			}

		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

}
