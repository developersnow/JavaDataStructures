
public class rotation {

	public static void main(String[] args) {
		int n = 6754;
		int r = 1,n1,z,n2=0;
		int power=1;
		int sum=0;
		int n3=n;
		while (n3!=0) {
			n1 = n3 % 10;
			n3 = n3/ 10;
			n2++;
			power=10*power;
			}
		while(r!=0) {
			n1=n%10;
			n=n/10;
			sum=n1*power+n;
			r--;
		}
		System.out.print(sum);
		
		}
}