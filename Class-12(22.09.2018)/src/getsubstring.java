import java.lang.reflect.Array;
import java.util.ArrayList;

public class getsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSSwithA("ab"));
		

	}

	public static ArrayList<String> getSSwithA(String str) {

		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rresult = getSSwithA(ros);
		ArrayList<String> mresult = new ArrayList<>();

		for (String recs : rresult) {
			mresult.add(recs);
			mresult.add(ch + recs);
			mresult.add((int) ch + recs);
		}
		return mresult;
	}

}
