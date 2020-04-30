import java.util.Scanner;

public class pow {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			
			System.out.println(dp(n));
		}
	}

	private static int dp(int n) {
		// TODO Auto-generated method stub
		int[] arr= new int[n+1];
		// 탑 다운 방식  n=1 ,n=2 , n=3 인 경우는 우리가 알고 있다.
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 2;
		}
		if( n == 3 ) {
			return 4;
		}
		// arr[n] 번째의 값을 알고 있다면 return 
		if( arr[n] >0 ) {
			return arr[n];
		}
		arr[n] = dp(n-1)+dp(n-2)+dp(n-3);
		return arr[n];
	}
}
