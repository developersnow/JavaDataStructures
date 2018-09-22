
public class octalsub {

	public static void main(String[] args) {
		int n1 = 1000;
		int n2 = 1;

		int sum = 0;
		int power = 1;
		int borrow = 0;
		int d;

		while (n1 != 0 || n2 != 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;

			int d2 = n2 % 10;
			n2 = n2 / 10;
			d1=d1-borrow;
			if (d1<d2) {
				borrow = 1;
				d = d1 - d2 + 8;
			} else {
				d = d1 - d2;
			}
			sum = sum + d * power;
			power = power * 10;
		}
		System.out.print(sum);

	}

}
