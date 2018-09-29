package hackerrank;

import java.util.Scanner;

public class Pep_Java_7Recursion_4BinomialPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int n =scn.nextInt();
		printtriangle(0,0,n-1,1);
	}
	
	public static void printtriangle(int r,int c ,int n,int z ) {
		if(r>n)
			return;
		if(c>r) {
			System.out.println();
			printtriangle(r+1, 0, n,1);
			return;
		}
		
		System.out.print(z);
		z=z*(r-c)/(c+1);
	
		
		
		printtriangle(r, c+1, n,z);
	}

}
