import java.util.ArrayList;
import java.util.Scanner;

public class swea_최장경로 {
	static int[][] arr;
	static boolean[] visit;
	static int max=1;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			
			arr =new int[n][n];
			visit = new boolean[n];
			for(int i=0; i < m; i++) {
				int a = scan.nextInt();
				int b = scan.nextInt();
				
				arr[a-1][b-1] = 1; 
				arr[b-1][a-1] = 1; 
			}
			for(int i = 0 ;i <visit.length; i ++) {
				for(int j =0; j<visit.length; j++) {
					if(arr[i][j] == 1) {
						visit[i]=true;
						dfs(i);
						visit[i] =false;
					}
				}
			}
			System.out.println("#"+t+" "+max);
			max =1;
		}
	}
	private static void dfs(int idx) {
		// TODO Auto-generated method stub
		int cnt= 0 ;
		for(int i =0; i <visit.length ; i++) {
			if(visit[i]) {
				cnt++;
			}  
		}
		max = Math.max(max, cnt);
		
		if ( idx == arr.length) {
			return ;
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			if(!visit[i] &&arr[idx][i]==1) {
				visit[i] = true;
				dfs(i);
				visit[i] =false;
			}
		}
		//visit[idx] = false;
 		
	}
} // 1 2 4 
