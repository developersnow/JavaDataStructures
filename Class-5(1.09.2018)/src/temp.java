
public class temp {

	public static void main(String[] args) {
		int min = 0;
		int max = 200;
		int far = 0;
		while (far != max) {
			int cel = (int) ((5.0 / 9) * (far - 32));// or you can use 5.0 instead of making it double
			System.out.println(far + "=" + cel);// instead of"" if we use '' it will give an answer as a far+cel+Ascii
												// of space
			far = far + 20;
		}
		
	}

}
