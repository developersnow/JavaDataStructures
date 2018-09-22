package test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int num = 0;
		int num2 = 1;
		int i;
		int fibonacci;
		for (i = 0; i < n; i ++)
		{
		    fibonacci = num + num2;
		    num = num2;
		    num2 = fibonacci;
		}
		System.out.print(num);

	}

}
