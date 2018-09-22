import java.util.Scanner;

public class patternfibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
				int n = scn.nextInt();
				
				int cntr=1;
				int t1 = 0, t2 = 1;
				int sum = 0;
				
				while(cntr<=n) {
					int col = 1;
					while(col<=cntr) {
						 
						System.out.print(t1);
						 sum = t1 + t2;
				            t1 = t2;
				            t2 = sum;
						col++;
					}
					System.out.println();
					cntr++;
				}

	}

}
