package hackerrank;

import java.util.Scanner;

public class Pep_Java_7Recursion_1OddAndEvenNumberPrintin {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		print(n);

	}

	public static void print(int n) {
		if(n==0)
			return;
		if(n%2!=0) {
			System.out.println(n);
		}
		print(n-1);
		if(n%2==0)
			System.out.println(n);
	}
}