import java.util.Scanner;

public class arraymax {

	public static void main(String[] args) {
//		int[] arr = { 10, 50, 60, 20, 99, 33, 66 };
//		int max = arr[0];
//
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max + " is largest");

		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] arr = new int[n];
		int max =scn.nextInt();
		
		for(int i=1;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);
		
		
		
		
		
	}

}
