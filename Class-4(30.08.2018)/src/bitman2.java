import java.util.Scanner;

public class bitman2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int bitmask =1<<k;
		if((n & bitmask)==0) {
			System.out.println("off");
		}else {System.out.println("on");}
		

	}

}
