
public class arrayshift {

	public static void main(String[] args) {

		int[] arr = { 33, 66, 55, 77, 88 };

		int n = 2;

		reverse(arr, 0, arr.length - 1 - n);
		reverse(arr, arr.length - n, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

		display(arr);
	}

	public static void display(int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

	public static void reverse(int[] arr, int lo, int hi) {
		while (lo < hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;
			lo++;
			hi--;
		}
	}

}
