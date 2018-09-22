import java.util.Scanner;

public class kadans {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		int test = scn.nextInt();
		int n = scn.nextInt();
		int[][] arr = new int[test][n];
		
		int[] arr = { 4, 5, -12, 3, 6, -2, 5, -20, 1, 2, 8 };
		kadan(arr);

	}

	public static void kadan(int[] arr) {
		int cmax = arr[0], omax = arr[0], cstart = 0, cend = 0, ostart = 0, oend = 0;
		for (int i = 1; i < arr.length; i++) {
			if (cmax >= 0) {// for a greater sequence we put equal to
				cmax += arr[i];
				cend++;

			} else {
				cmax = arr[i];
				cend = i;
				cstart = i;

			}
			if (cmax > omax) {//if it is equal we will get later sequence if it is only greater we will get earlier sequence
				omax = cmax;
				ostart = cstart;
				oend = cend;
			}

		}
		System.out.println(omax + " from " + ostart + " to " + oend);

	}

}
