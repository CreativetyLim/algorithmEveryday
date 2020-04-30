package algo;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int sum =0 ;
		for(int i = N; i<=M; i++) {
			int so =i;
			if(so<=1)so =2;
			int y= 0;
			for(int j=1; j*j<=so; j++) {
				if(so%j == 0) {
					y++;
				}
			}
			if(y==1) {
				System.out.println(so);
			}
		}
	}
}
