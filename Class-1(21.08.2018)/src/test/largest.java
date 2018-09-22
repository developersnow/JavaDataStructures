package test;

public class largest {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		int c = 40;
		
		if(a>=b && a>=c) {
			System.out.println(a+"is largest.");
			return;
		}
		
		if(b>=a && b>=c) {
			System.out.println(b+"is largest.");
			return;
		}
		
		System.out.println(c+"is largest.");

	}

}