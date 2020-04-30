import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node{
	int x;
	int y;
	public node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y; 
	}
}
public class 인구이동 {
	static boolean flag = true;
	static int sum=0;
	static int cnt=0; 
	static int n,l,r;
	static 	int[][] map; 
	static int result =0 ;
	static boolean[][] visit;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		l = scan.nextInt();
		r = scan.nextInt();
		map = new int[n][n];
		for(int i =0; i <n; i++) {
			for(int j =0; j<n; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		while(flag) {
			int cc=0;
			visit = new boolean[n][n];
			for(int i =0; i <n; i ++) {
				for(int j =0; j<n ; j++) {
					if(!visit[i][j]) {
						bfs(i,j);
						if(!flag)
							cc++;
					}
				}
			}
			if(cc>=n*n-1) {
				flag= false;
			}
			else {
				flag =true;
			}
			result ++;
		}
		System.out.println(result-1);
	}
	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		
		cnt =0;
		sum = 0;
		Queue<node> q = new LinkedList<node>();
		Queue<node> change = new LinkedList();
		q.add(new node(i,j));
		change.add(new node(i,j));
		int[] dirX = {1,-1,0,0};
		int[] dirY = {0,0,1,-1};
		int cntcopy = cnt;
		while(!q.isEmpty()) {
			node tmp = q.poll();
			
			for(int k=0; k<4; k++) {
				int nx = tmp.x + dirX[k];
				int ny = tmp.y + dirY[k];
				
				if(nx>=0 && ny>=0 && nx<n && ny<n &&!visit[nx][ny] && Math.abs(map[tmp.x][tmp.y]- map[nx][ny])<=r &&  Math.abs(map[tmp.x][tmp.y]- map[nx][ny]) >=l) {
					//System.out.println("내가알고싶은정보"+i+" "+j+" "+nx+" "+ny+ " "+Math.abs(map[tmp.x][tmp.y]- map[nx][ny]) );
					visit[nx][ny] =true;
					sum+= map[nx][ny];
					cnt++;
					q.add(new node(nx,ny));
					change.add(new node(nx,ny));
				}
			}
		}
		//System.out.println(sum+" " +cnt);
		while(!change.isEmpty()&&sum>0) {
			node tmpNode = change.poll();
			map[tmpNode.x][tmpNode.y] =sum/cnt;
			flag =true;
		}
		if(cntcopy == cnt) {
			flag =false;
		}
//		for(int z =0; z <n; z++) {
//			for(int x=0; x<n; x++ ) {
//				System.out.print(map[z][x]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
	}
}
