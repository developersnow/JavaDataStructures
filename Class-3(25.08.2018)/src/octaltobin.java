
public class octaltobin {

	public static void main(String[] args) {
		int oct = 111;
		int n1, n3 = 0;
		int power = 1;
		int sum = 0;
		while (oct != 0) {
			n1 = oct % 10;
			oct = oct / 10;
			switch (n1) {
			case 0: {
				n3 = 0 * power;
				break;
			}
			case 1: {
				n3 = 1 * power;
				break;
			}
			case 2: {
				n3 = 10 * power;
				break;
			}
			case 3: {
				n3 = 11 * power;
				break;
			}
			case 4: {
				n3 = 100 * power;
				break;
			}
			case 5: {
				n3 = 101 * power;
				break;
			}
			case 6: {
				n3 = 110 * power;
				break;
			}
			case 7: {
				n3 = 111 * power;
				break;
			}
			}
			power = power * 1000;
			sum = sum + n3;

		}
		System.out.print(sum);
	}

}
