import java.lang.reflect.Array;
import java.util.ArrayList;

public class KeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(keypad1("784"));

	}

	static String[] codes = { "yz", "abc", "de", "fgi", "jk", "lm", "nop", "qrst", "uv", "wx", "yz" };

	// expec784-7
	public static ArrayList<String> keypad1(String str) {

		if (str.length() == 0) {
			ArrayList<String> bresult = new ArrayList<>();
			bresult.add("");
			return bresult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> rresult = keypad1(ros);
		ArrayList<String> mresult = new ArrayList<>();


		String code =codes[ch-'0'];
		
		for (String recs : rresult) {

			for(int i =0 ; i<code.length(); i++) {
			mresult.add(code.charAt(i)+recs);	
			}
			
		}
		return mresult;
	}

}
