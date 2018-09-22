
public class octadd {

	public static void main(String[] args) {
		
//		int n1 = 4567;
//		int n2 = 7757;
//		int z1,z2,sum,carry=0,i=1;
//		int sum1=0;
//		
//		
//		while(n1 !=0 || n2 !=0 || carry != 0) {
//		
//		z1=n1%10;
//		z2=n2%10;
//		if(z1+z2<8) {
//			sum=z1+z2;
//			carry=0;
//		}else{
//		sum=(z1+z2+carry)%8*i;
//		carry=1;
//		}
//		sum1=sum1+sum;
//		i=10*i;
//		n1=n1/10;
//		n2=n2/10;
//		
//		}
//		
//		System.out.println(sum1);
		
		int n1 = 777;
		int n2 = 1;
		
		int sum=0;
		int power = 1;
		int carry =0;
		
		while(n1 != 0 ||n2 != 0 || carry !=0) {
			int d1 = n1%10;
			n1=n1/10;
			
			int d2=n2%10;
			n2=n2/10;
			
			int d= d1+d2+carry;
			
			carry=d/8;
			sum=d%8*power;
			power = power*10;
		}
		System.out.print(sum);

	}

}
