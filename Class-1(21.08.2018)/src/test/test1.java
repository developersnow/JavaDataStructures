package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		int count=0;
		int i =1;
		
		while(i<=n) {
			if(n%i == 0) {
				count++;	
			}
			i++;
		}
			if(count==2) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
			
			
		}
		

	}

