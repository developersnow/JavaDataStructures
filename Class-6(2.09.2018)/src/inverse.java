import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {

//		int[] arr = { 3, 4, 2, 0, 1 };
//		int[] inv = new int[arr.length];
//		int n;
//
//		for (int i = 0; i < arr.length; i++) {
//			n = arr[i];
//			inv[n] = i;
//
//		}
//
//		for (int val : inv) {
//			System.out.print(val + " ");
//		}
		
		Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr = new int[n];
        int[] inv = new int[arr.length];
        boolean bn=false;
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        
        for(int i =0;i<arr.length;i++) {
        inv[arr[i]]=i;
        }
        for (int val : inv) {
			System.out.print(val + " ");
		}
        
        for(int i=0;i<arr.length;i++) {
        	if(inv[i]==arr[i]) {
        		bn=true;
        	}else {bn=false;}
        }System.out.println(bn);
	}

}
