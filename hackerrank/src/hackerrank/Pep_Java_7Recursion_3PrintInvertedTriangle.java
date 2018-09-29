package hackerrank;

import java.util.Scanner;

public class Pep_Java_7Recursion_3PrintInvertedTriangle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);

			int n =scn.nextInt();
			printtriangle(n-1,0,0);
		}
		public static void printtriangle(int r,int c ,int n) {
			if(r<n)
				return;
			if(c>r) {
				System.out.println();
				printtriangle(r-1, 0, n);
				return;
			}
			System.out.print("*");
			printtriangle(r, c+1, n);
		}

	}
