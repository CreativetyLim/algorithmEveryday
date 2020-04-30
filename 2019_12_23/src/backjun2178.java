import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class node{
	int i;
	int j;
	int cnt;
	public node(int i, int j, int cnt) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
		this.cnt = cnt;
	}
}
public class backjun2178 {
	static int map[][];
	static boolean check[][];
	static int dis[][];
	static Queue<node> q ;
	static int h;
	static int w;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		h= scan.nextInt();
		w= scan.nextInt();
		map = new int[h+1][w+1];
		for(int i = 1; i<=h; i++) {
			String s = scan.next();
			for(int j=1; j<=w; j++) {
				map[i][j] = s.charAt(j-1)-'0';
			}
		}
		check = new boolean[h+1][w+1];
		bfs(1,1,0);
			
		
		
		}

	

	private static void bfs(int i,int j,int cnt) {
		// TODO Auto-generated method stub
		q = new LinkedList<node>();
		int[] dirX = {-1,0,1,0 };
		int[] dirY = {0,1,0,-1};
		int newX = 0;
		int newY = 0;
		node n = new node(i,j,cnt);
		q.add(n);
		check[n.i][n.j] = true;
		while(!q.isEmpty()) {
			node x =q.poll();
			check[x.i][x.j] =true;
			if(x.i==h && x.j==w) {
				System.out.println(x.cnt);
				return;
			}
			for (int k = 0; k < 4; k++) {
				newX = i + dirX[k];
				newY = j + dirY[k];
				//System.out.println(map[newX][newY]);
				if (newX > 0 && newY > 0 && newX <= h && newY <= w && !check[newX][newY] && map[newX][newY] == 1) {
					System.out.println(newX +" "+newY);
					node nn = new node(newX,newY,cnt);
					q.add(nn);
				}
			}
			
		}
		
		
	}
}