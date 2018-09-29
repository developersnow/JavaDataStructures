import java.util.ArrayList;

public class matrixPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(getMatrixPath(0, 0, 2, 2));

	}

	public static ArrayList<String> getMatrixPath(int sr, int sc, int er, int ec) {

		if (sr == er && sc == ec) {
			ArrayList<String> s = new ArrayList<>();
			s.add("");
			return s;
		}
		if (sr > er || sc > ec) {
			ArrayList<String> s = new ArrayList<>();
			return s;
		}

		ArrayList<String> mresult = new ArrayList<>();

		ArrayList<String> hresult = getMatrixPath(sr, sc + 1, er, ec);
		ArrayList<String> vresult = getMatrixPath(sr + 1, sc, er, ec);

		for (String res : hresult) {
			mresult.add("h" + res);
		}

		for (String res : vresult) {
			mresult.add("v" + res);
		}

		return mresult;
	}

}
