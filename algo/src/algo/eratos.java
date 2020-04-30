package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class eratos {
	public static void main(String[] args) {
		ArrayList<Boolean> primeList;
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		if(n<=1 )return ;
		primeList = new ArrayList<Boolean>(n+1);
		
		primeList.add(false);
		primeList.add(false);
		
		for(int i=2 ;i<=n; i++) {
			primeList.add(i, true);
		}
		
		for(int i =2; (i*i)<= n; i++) {
			if(primeList.get(i)) {
				for(int j =i*2; j<=n; j+=i) {
					primeList.remove(j);
					primeList.add(j, false);
				}
			}
		}
		
		for(int i = m; i <= n; i++ ) {
			if(primeList.get(i)== true)
				System.out.println(i);
			}
		
		
	}
}
