import java.util.Scanner;

public class rectangles {

	public static void main(String[] args) {
		// triangles not touch-true
		// rest all false
		Scanner scn = new Scanner(System.in);
		
		int x1 = scn.nextInt();
		int x2 = scn.nextInt();
		int x3 = scn.nextInt();
		int x4 = scn.nextInt();
		int y1 = scn.nextInt();
		int y2 = scn.nextInt();
		int y3 = scn.nextInt();
		int y4 = scn.nextInt();
		boolean bn=false;
		
		if(x3>x2 ||x4<x1||y4>y1||y3<y2) {
			System.out.println();
			System.out.println("Triangles not overlap");
		}else{System.out.println("Triangles overlap");}
	
	}
}
