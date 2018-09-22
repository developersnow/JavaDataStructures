import java.util.Scanner;

public class upperorlower {

	public static void main(String[] args) {
		// print case without using ascii
		
		Scanner scn = new Scanner(System.in);
		
		char ch= scn.nextLine().charAt(0);
		
		if((ch<='Z')&&(ch>='A')) {
			System.out.println(ch+" is uppercase");
			//My Approach
			char ch1 = 'a';
			for (int j='A';j<ch;j++) {
				
				int i = ch1++;
			}
			System.out.println(ch1);
		}
		if((ch<='z')&&(ch>='a')) {
			System.out.println(ch+" is lowercase");
			//Sir Approach
			char uch=(char)(ch-'a'+'A');
			System.out.println(uch+" is its upercase");
			
		}
		
	}

}
