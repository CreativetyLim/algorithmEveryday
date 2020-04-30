package algo;

import java.util.Scanner;

public class а╤гу {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			int r = scan.nextInt();
			long result = 1;
			while(r!=0) {
				result = (result * n)%1234567891;
				result = (result /r)%1234567891;
				n--;
				r--;
			}
			
			System.out.println("#"+t+" "+result);
		
		}
		
	}
}
