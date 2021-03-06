
public class matrixmultiply {

	public static void main(String[] args) {
		int[][] m1 = { { 10, 20, 30 }, { 10, 20, 30 }, { 10, 20, 30 } };
		int[][] m2 = { { 10, 20, 30 }, { 10, 20, 30 }, { 10, 20, 30 } };

		matrixMultiply(m1,m2);
	}

	public static void matrixMultiply(int[][] m1, int[][] m2) {
		
		int r1 = m1.length;
		int c1 = m1[0].length;
		int r2 = m2.length;
		int c2 = m2[0].length;

		int[][] product = new int[r1][c2];

		if (c1 != r2) {
			System.out.println("Matrix cant be multiplied");
		} else {
			for (int row = 0; row < product.length; row++) {
				for (int col = 0; col < product[row].length; col++) {
					for (int k = 0; k < r2; k++) {
						product[row][col] += m1[row][k] * m2[k][col];
					}
				}
			}
		}
		display(product);
	}
	
	public static void display (int[][] product) {
		for(int i = 0;i<product.length;i++) {
			for(int j =0;j< product[0].length;j++) {
				System.out.print(product[i][j]+" ");
			}System.out.println();
		}
	}

}


		
		
		
		
		