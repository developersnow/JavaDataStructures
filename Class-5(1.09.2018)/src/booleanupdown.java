import java.util.Scanner;

public class booleanupdown {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int prev = scn.nextInt();
		int curr = scn.nextInt();
		boolean goingDown = curr < prev;

		for (int i = 0; i < n - 1; i++) {
			prev = curr;
			curr = scn.nextInt();

			if (goingDown == true) {
				if (curr > prev) {
					goingDown = false;
				}
			} else {
				if (curr < prev) {
					System.out.println("Invalid");
					return;
				}
			}

		}

	}

}
