
public class snakeLadder {

	public static void main(String[] args) {
		int[] board = new int[25];
		board[2] = 18;
		board[13] = 23;
		board[21] = 9;
		board[23] = 4;
		boolean flag = false;
		int pos = 0;

		int[] dice = { 2, 3, 6, 4, 1, 3, 2, 5, 4, 1, 6, 2, 3, 6, 5, 3 };

		snakesandladder(board, dice);

	}

	public static void snakesandladder(int[] board, int[] dice) {
		int pos = 0;
		for (int i = 0; i < dice.length; i++) {
			if (pos == 0) {

				if (dice[i] == 1 || dice[i] == 6) {
					pos = 1;
				}
			} else {
				if (pos + dice[i] < board.length) {
					pos = pos + dice[i];

					if (board[pos] != 0) {
						pos = board[pos];
					}
				}
			}
		}
		System.out.println(pos);
	}

}
