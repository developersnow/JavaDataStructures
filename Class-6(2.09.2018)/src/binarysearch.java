import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = scn.nextInt();
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (n == arr[mid]) {
				System.out.println(n + " is found at " + mid);
				return;
			} else if (n < arr[mid]) {
				high = mid - 1;
			} else if (n > arr[mid]) {
				low = mid + 1;
			}

		}
		System.out.print(-1);

	}

}
