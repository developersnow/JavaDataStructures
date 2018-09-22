import java.util.Scanner;

public class dectobin {

	public static void main(String[] args) {
		
		int dec = 57;
		int bin = 0;
		int z ,i=1,sum = 0;
		
		while(dec != 0) {
			z=dec%2*i;
			dec=dec/2;
			sum=sum+z;
			i=i*10;
			
		}
		System.out.print(sum);
	}

}
