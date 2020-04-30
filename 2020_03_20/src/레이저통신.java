import java.awt.Label;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int x ;
	int y;
	int dir;
	int cnt;
	public Point(int x ,int y, int dir,int cnt) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.cnt = cnt;
	}
}
public class 레이저통신 {
	static int min = 0xfffff;
	static int w;
	static int h;
	static int[][] map ;
	static int[][] visit;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		w = scan.nextInt();
		h = scan.nextInt();
		map = new int[h][w];
		visit = new int[h][w];
		for(int i=0; i <h; i++) {
			String s = scan.next();
			for(int j=0; j <w; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		out:
		for(int i =0; i <h; i++) {
			for(int j=0; j<w; j++) {
				if(map[i][j]=='C') {
					bfs(i,j);
					break out;
				}
			}
		}
		System.out.println(min);
	}
	private static void bfs(int a, int b) {
		// TODO Auto-generated method stub
		int dirX[] = {1,-1,0,0};
		int dirY[] = {0,0,1,-1};
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(a, b,0,0));
		visit[a][b] =0;
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			
			if(map[tmp.x][tmp.y] == 'A') {
				//System.out.println();
				if(!(a==tmp.x && b ==tmp.y)) {
					System.out.println(visit[tmp.x][tmp.y]);
					min = Math.min(visit[tmp.x][tmp.y], min);
				} 
			}
			
			for(int k=0; k<4; k++) {
				int nx = tmp.x +dirX[k];
				int ny = tmp.y +dirY[k];  // 위 1 ,아래 2, 오른3 왼 4  1 , 2, 3 ,4
				if(nx>=0 && ny>=0 && nx<h && ny<w && visit[nx][ny]>0 &&visit[nx][ny]>=tmp.cnt && map[nx][ny]!='*') {
					
					//System.out.println(tmp.x+" "+tmp.y+" "+nx+" "+ny+" "+(k+1)+"방향으로보냄"+tmp.dir +"전방향이엿고 cnt= " +tmp.cnt);
					visit[nx][ny]= tmp.cnt;
					if(tmp.dir == k+1 || tmp.dir ==0) {
						q.add(new Point(nx,ny,k+1,tmp.cnt));
					}
					else {
						//System.out.println(nx+" " +ny);
						q.add(new Point(nx,ny,k+1,tmp.cnt+1));
					}
				}
			}
			
		}
	}
}
