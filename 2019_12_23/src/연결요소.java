import java.util.Scanner;

public class 연결요소 {
	static int[][] dir;
	static boolean[] check;
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
		 m = scan.nextInt();
		check = new boolean[n+1];
		dir= new int[n+1][n+1];
		for(int i =0; i < m; i++) {
			int a= scan.nextInt();
			int b= scan.nextInt();
			
			dir[a][b] = 1;
			dir[b][a] = 1;
		}
		int count=0;
		for(int i =1; i <=n; i++) {
			if(!check[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	static void dfs(int x) {
		if(check[x]) {
			return;
		}
		else {
			for(int i=1; i <= n; i++) {
				check[x]=true;
				if(dir[x][i] ==1) {
					dfs(i);
				}
			}
		}
	}
}
