
public class rotatematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m1 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int row = 0; row < m1.length; row++) {
			for (int col = row; col < m1[row].length; col++) {
				int temp = m1[row][col];
				m1[row][col] = m1[col][row];
				m1[col][row] = temp;
			}
		}

		for (int i = 0; i < m1.length; i++) {
			int left = 0;
			int right = m1[i].length - 1;
			while (left < right) {
				int temp = m1[i][left];
				m1[i][left] = m1[i][right];
				m1[i][right] = temp;
				left++;
				right--;
			}
		}

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
