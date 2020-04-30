import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node{
	int x ;
	int y; 
	int t;
	public node(int x, int y,int t) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y =y;
		this.t= t;
	}
}
public class 점프게임 {
	static boolean[][] visit;
	static int[][] map;
	static int n;
	static int k;
	static boolean flag = false;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		k = scan.nextInt();
		
		map = new int[2][n];
		visit = new boolean[2][n];
		String s1 = scan.next();
		String s2 = scan.next();
		for(int i =0;i <n; i++) {
			map[0][i] =s1.charAt(i)-'0';
			map[1][i] =s2.charAt(i)-'0';
		}
		
		bfs(0,0);
		//bfs(1,0);
		if(flag)
			System.out.println(1);
		else
			System.out.println(0);
	}
	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		Queue<node> q = new LinkedList<node>();
		q.add(new node(i,j,0));
		
		visit[i][j] = true;
		int[] dirX = {1,-1,0,0};
		int[] dirY = {k,k,1,-1};
		while(!q.isEmpty()) {
			node tmp = q.poll();
			
			if(tmp.y<tmp.t) {
				continue;
			}
			
			int nx;
			int ny;
			for(int k=0;k <4; k++) {
				nx = tmp.x +dirX[k];
				ny = tmp.y +dirY[k];
				if(ny>=n) {
					flag =true;
					break;
				}
				
				if(nx>=0 && ny>tmp.t && nx<2 &&!visit[nx][ny]&& map[nx][ny]==1) {
					//System.out.println(nx+" "+ny+" 여기서옴"+tmp.x+" "+tmp.y);
					visit[nx][ny]= true;
					q.add(new node(nx,ny,tmp.t+1));
				}
			}
		}
		
	}
}
