import java.util.Scanner;

public class pattern9diamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int c=1;

		int stars = 1;
		int spaces = n / 2;
		
		int row = 1;
		while(row <= n){
			int c1 = 1;
			while(c1 <= spaces){
				System.out.print(" ");
				c1++;
			}
			
			int c2 = 1;
			while(c2 <= stars){
				System.out.print(c);
				c2++;
				c++;
			}
			
			int c3 = 1;
			while(c3 <= spaces){
				System.out.print(" ");
				c3++;
			}
			
			if(row <= n / 2){
				spaces--;
				stars += 2;
			} else {
				spaces++;
				stars -= 2;
			}
			
			System.out.println();
			row++;
		}
		}

	}

