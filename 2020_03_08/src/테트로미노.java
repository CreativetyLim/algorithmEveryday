import java.util.Scanner;
class Point implements Comparable<Point>{
	int x;
	int y;
	int value;
	public Point(int a , int b,int value) {
		// TODO Auto-generated constructor stub
		x= a;
		y= b;
		this.value =value;
	}
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return o.value - this.value;
	}
}
public class 테트로미노 {
	static int[] dirX= {0,0,1,-1};
	static int[] dirY= {1,-1,0,0};
	static int maxAnswer =0;
	static int n;
	static int m;
	static boolean[][] visit;
	static int[][] map ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
		 m = scan.nextInt();
		int maxNum =1;
		map = new int[n][m];
		visit = new boolean[n][m];
		for(int i =0; i <n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		for(int i =0; i <n; i++) {
			for(int j =0; j<m; j++) {
				visit[i][j] =true;
				
				//dfs 로 4칸짜리 최대큰거 찾기
				dfs(i,j,map[i][j],1);
				
				/// 이건 ㅗ ㅏ ㅓ ㅜ 만들기 
				int result = 0;
				if(i>0 && j>0 &&j<m-1) {
					result= map[i-1][j]+map[i][j]+map[i][j+1]+map[i][j-1];
				}
				maxAnswer= Math.max(result, maxAnswer);
				if(i>0 && i<n-1 &&j<m-1) {
					result= map[i-1][j]+map[i][j] +map[i+1][j] + map[i][j+1];
				}
				maxAnswer= Math.max(result, maxAnswer);
				if(i<n-1 && j>0 &&j<m-1) {
					result= map[i+1][j]+map[i][j]+map[i][j+1]+map[i][j-1];
				}
				maxAnswer= Math.max(result, maxAnswer);
				if(i>0 && i<n-1 &&j>0) {
					result= map[i-1][j]+map[i][j] +map[i+1][j] + map[i][j-1];
				}
				maxAnswer= Math.max(result, maxAnswer);
				
				visit[i][j] =false;
			}
		}
		System.out.println(maxAnswer);
		
	}
	
	private static void dfs(int x, int y, int result,int cnt) {
		// TODO Auto-generated method stub
		if(cnt== 4) {
			if(maxAnswer<result) {
				maxAnswer= result;
			}
			return ;
		}
		int nx=0;
		int ny=0;
		for(int k=0; k <4; k++) {
			nx = x + dirX[k];
			ny = y + dirY[k];
			
			if(nx>=0 &&ny>=0 && nx<map.length && ny<map[0].length &&!visit[nx][ny]) {
				visit[nx][ny] =true;
				dfs(nx,ny,result+map[nx][ny],cnt+1);
				visit[nx][ny] =false;
			}
		}
	}
}
