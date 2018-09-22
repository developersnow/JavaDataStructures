
public class recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		int n =2;
		System.out.println(factorial(x));
		System.out.println(power(x,n));
	}
	public static int factorial(int x) {
		if(x==1) {
			return 1;
		}
		return 	x*factorial(x-1);
		
	}
	public static int power(int x,int n ) {
		if(n==0) {
			return 1;
		}
		return x*power(x,n-1);
		
		
	}
	public static int powersmart(int x,int n ) {
		if(n==0) {
			return 1;
		}
		int xpn2=powersmart(x, n/2);
		int xpn=xpn2*xpn2;
		
		if(n%2==1) {
			xpn=xpn*x;
		}
		
		return xpn;
	}

}
