
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pdiwskip(6);
	}	// expectation=>5 3 1 2 4
		// faith=>3 1 2 
		//expectation +faith=>5+pdiwskip(4)+4
	public static void pdiwskip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 != 0) {
			System.out.println(n);
		}
		pdiwskip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);
		}
	}

}
