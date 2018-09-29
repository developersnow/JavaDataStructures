import java.util.ArrayList;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gamepad(0, 10));

	}

	public static ArrayList<String> gamepad(int src, int des) {

		if (src == des) {
			ArrayList<String> s = new ArrayList<>();
			s.add("");
			return s;
		}
		ArrayList<String> mresult = new ArrayList<>();

		for (int i = 1; i <= 6 && i + src <= des; i++) {
			ArrayList<String> rresult = gamepad(src + i, des);

			for (String res : rresult) {
				mresult.add(i + res);
			}
		}
		return mresult;
	}

}
