public class bintodec {

	public static void main(String[] args) {
		
		int bin = 111001;
		int dec = 0;
		int z ,i=1,sum = 0;
		
		while(bin != 0) {
			z=bin%10*i;
			bin=bin/10;
			sum=sum+z;
			i=i*2;
			
		}
		System.out.print(sum);
	}

}
