import java.util.Scanner;

public class 디저트가게 {
	static int n;
	static int[][] map;
	static boolean[] visit;
	static int max =-1;
	static int[] dirX = {1,1,-1,-1};
	static int[] dirY = {1,-1,-1,1};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			n = scan.nextInt();
			map = new int[n][n];
			for(int i =0; i <n; i++) {
				for(int j = 0; j<n; j++) {
					map[i][j] =scan.nextInt();
				}
			}
			
			for(int k=n-1; k>0; k--) {
				for(int i=0; i <n-1; i++) {
					for(int j=1; j<n-1; j++) {
						if(i+k-1 <n && j+k-1 <n ) {
							visit = new boolean[100];
							makeSquare(i,j,k);
						}
					}
				}
			}
			System.out.println("#"+t+" " + max);
		}
		
		
	}
	private static void makeSquare(int i, int j, int k) {
		// TODO Auto-generated method stub
		int startPointx =i;
		int startPointy =j;
		int cnt = 0;
		//System.out.println("c처음값"+i+ " " +j);
		i-=1;
		j-=1;
		
		for(int a= 1, b= 1; i<n-1&&j<n-1; ) {
			i+= a;
			j+= b;
			if(visit[map[i][j]]) {
				return;
			}
			else {
				visit[map[i][j]]=true;
			}	
		}
		
		for(int a= 1, b= -1; i<n-1&&j>=0; ) {
			//System.out.println(i+" "+j);
			i+= a;
			j+= b;
			cnt += 2;
			if(visit[map[i][j]]) {
				return;
			}
			else {
				visit[map[i][j]]=true;
				if(i-k>=0 && j-k>=0) {
					while(k>0) {
						if(visit[map[i][j]]) {
							return ;
						}
						k--;
					}
				}
				
				for(int d = 1; i>=0 && j <n-1;) {
					i-=d;
					j+=d;
					if(visit[map[i][j]]) {
						return ;
					}
					if(i== startPointx && j==startPointy) {
						break ;
					}
				}
				
			}	
			
			cnt+= k*2;
			if(cnt >max) {
				max =cnt;
			}
			cnt-= k*2;
		}
		
		
		
	}
}
