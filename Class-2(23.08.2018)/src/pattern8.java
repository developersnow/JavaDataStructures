import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int col = 0, count = 0, count1 = 0;
		int row = 1;

	        while( row <= n) {
	        	int space = 1; 
	            while(space <= n- row) {
	                System.out.print("  ");
	                ++count;
	                ++space;
	            }
	            

	            while(col != 2 * row - 1) {
	                if (count <= n - 1) {
	                    System.out.print((row + col) + " ");
	                    ++count;
	                }
	                else {
	                    ++count1;
	                    System.out.print((row + col - 2 * count1) + " ");
	                }

	                ++col;
	            }
	            count1 = count = col = 0;
	            ++row;

	            System.out.println();
	        }

	}

}
