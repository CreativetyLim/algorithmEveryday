import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x, y ,d;
	public Point(int z,int x, int c) {
		// TODO Auto-generated constructor stub
		this.x = z;
		this.y = x;
		this.d = c;
	}
}
public class ≈ª√‚ {
	static boolean flag = false;
	static char [][] map;
	static int[] dirX ={-1,1,0,0};
	static int[] dirY ={0,0,1,-1};
	static int m ;
	static int n ;
	static int result =-1;
	static boolean[][] visit ;
	static boolean[][] visit2 ;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			n =scan.nextInt();
			m = scan.nextInt();
			visit = new boolean[n][m];
			visit2 = new boolean[n][m];
			map = new char[n][m];
			for(int i=0; i<n; i++) {
				String s= scan.next();
				for(int j=0; j<m; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			int a=0,b=0,c=0,d=0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(map[i][j]== '*') {
						a =i;
						b =j;
					}
					if(map[i][j] == 'S') {
						c =i;
						d= j;
					}
				}
			}
			bfs(a,b,c,d);
			if(result ==-1) {
				System.out.println("KAKTUS");
			}
			else {
				
				System.out.println(result);
			}
		}
		
	private static void bfs(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		Queue<Point> q = new LinkedList<Point>();
		Queue<Point> waterq = new LinkedList<Point>();
		q.offer(new Point(c,d,0));
		waterq.offer(new Point(a,b,0));
		visit[c][d] =true;
		visit2[a][b] =true;
		while(!waterq.isEmpty()) {
			
			int size = q.size();
			int size2 = waterq.size();
			while(size2-->0) {
				Point front = waterq.poll();
				
				for(int k= 0 ; k<4; k++) {
					int nr = front.x + dirX[k];
					int nc = front.y + dirY[k];
					
					if(isIn(nr,nc)) {
						if(!visit2[nr][nc]) {
							visit2[nr][nc] =true;
							map[nr][nc] ='*';
							waterq.offer(new Point(nr, nc, front.d+1));
						}
					}
				}
			}
			while(size-->0) {
				
				Point front = q.poll();
				if(map[front.x][front.y] == 'D') {
					result =front.d+1;
				}
				
				for(int k= 0 ; k<4; k++) {
					int nr = front.x + dirX[k];
					int nc = front.y + dirY[k];
					
					if(isIn(nr,nc) &&map[nr][nc]!='*') {
						if(!visit[nr][nc]) {
							visit[nr][nc] =true;
							q.offer(new Point(nr, nc, front.d+1));
						}
					}
				}
			}
			
		}
		
	}
	private static boolean isIn(int r, int c) {
		// TODO Auto-generated method stub
		return 0<= r && 0<= c && r<n && c<m &&map[r][c]!='X' &&map[r][c]!='D';
	}
}
