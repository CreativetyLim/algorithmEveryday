import java.util.Scanner;

public class 부분수열의합 {
	static boolean[] visit;
	static int cnt = 0;
	static int  k;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			k = scan.nextInt();
			int[] arr= new int[n];
			visit = new boolean[n];
			for(int i =0; i <arr.length;i ++) {
				arr[i] = scan.nextInt();
			}
			powerset(arr, 0);
			
			System.out.println("#"+t+" " +cnt);
			cnt =0;
		}
		
	}

	private static void powerset(int[] arr, int idx) {
		// TODO Auto-generated method stub
		if(idx == visit.length) {
			int result  =0;
			for(int i =0; i <visit.length; i++) {
				if(visit[i]) {
					result += arr[i];
				}
			}
			if( result == k) {
				cnt ++;
			}
			return ;
		}
		
		visit[idx]=true;
		powerset(arr, idx+1);
		visit[idx]=false;
		powerset(arr, idx+1);
		
	}
}
