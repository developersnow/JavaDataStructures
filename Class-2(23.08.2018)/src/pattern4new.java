import java.util.Scanner;

public class pattern4new {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int cntr=0;
		while(cntr<n) {
			int col = 0;
			int c =1;
			while(col<=cntr) {
				System.out.print(c);
				c=c*(cntr-col)/(col+1);
				col++;
				
			}
			System.out.println();
			cntr++;
		}

	}

}
