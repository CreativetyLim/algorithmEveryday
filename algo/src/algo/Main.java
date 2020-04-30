package algo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int sum =0 ;
		for(int i = 0; i<N; i++) {
			int so = scan.nextInt();
			int y= 0;
			for(int j=1; j<=so; j++) {
				if(so%j == 0) {
					y++;
				}
			}
			if(y==2 ) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
