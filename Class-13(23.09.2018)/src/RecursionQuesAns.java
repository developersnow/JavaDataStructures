import java.util.ArrayList;

public class RecursionQuesAns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		printSSWAscii("abc", "");
////		printKPC("784", "");
//		getMatrixPath(0, 0, 2, 2, "");
//		gamepad(0, 10, "");
		int counter = 0;

		printMazePath(0, 0, 2, 2, "");

	}

	public static void printSSWAscii(String ques, String asf) {

		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);

		printSSWAscii(ros, asf + ch);
		printSSWAscii(ros, asf + "");
		printSSWAscii(ros, asf + (int) ch);
	}

	static String[] codes = { "yz", "abc", "de", "fgi", "jk", "lm", "nop", "qrst", "uv", "wx", "yz" };

	public static void printKPC(String ques, String asf) {

		if (ques.length() == 0) {
			System.out.print(asf);
			return;
		}
		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		String code = codes[ch - '0'];

		for (int i = 0; i < code.length(); i++) {
			printKPC(ros, asf + code.charAt(i));
		}

	}

	public static void getMatrixPath(int sr, int sc, int er, int ec, String psf) {

		if (sr == er && sc == ec) {
			System.out.println(psf);
			return;
		}

		if (sr < er) {
			getMatrixPath(sr + 1, sc, er, ec, psf + "V");
		}
		if (sc < ec) {
			getMatrixPath(sr, sc + 1, er, ec, psf + "H");

		}
	}

	public static void gamepad(int src, int des, String psf) {

		if (src == des) {
			System.out.println(psf);
			return;
		}

		for (int i = 1; i <= 6 && i + src <= des; i++) {
			gamepad(src + i, des, psf + i);

		}
	}

	public static int counter = 0;

	public static void printMazePath(int sr, int sc, int er, int ec, String psf) {
		if (sr == er && sc == ec) {
			System.out.println(++counter + "." + psf);
			return;
		}

		for (int i = 1; i <= er - sr; i++) {
			printMazePath(sr + i, sc, er, ec, psf + "H" + i);
		}
		for (int i = 1; i <= ec - sc; i++) {
			printMazePath(sr, sc + i, er, ec, psf + "V" + i);
		}
		for (int i = 1; i <= er - sc && i <= ec - sc; i++) {
			printMazePath(sr + i, sc + i, er, ec, psf + "D" + i);
		}
	}
	
	

}