import java.util.Scanner;

public class printbinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.println(Integer.toBinaryString(~n));
		int z ,i=1,sum = 0;
		while(n != 0) {
			z=n%2*i;
			n=n/2;
			sum=sum+z;
			i=i*10;
		}
	}

}