import java.util.Scanner;

public class arrayequal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++) {
            arr[i]=scn.nextInt();
        }
        
        if(!scn.hasNextInt()) {
        	System.out.println("Invalid Input");
        }
        int x =scn.nextInt();
        
        for(int i=0;i<arr.length;i++) {
            if(x==arr[i]) {
                System.out.println(i);
                return;
            }
        }System.out.println(-1);

	}

}
