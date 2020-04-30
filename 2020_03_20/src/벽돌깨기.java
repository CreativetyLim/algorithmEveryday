import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
	int x ;
	int y ;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y =y ;
	}
}
public class º®µ¹±ú±â {
	static int[][] map;
	static int n;
	static int w;
	static int h;
	static int min= 0xfffff;
	static boolean[][] visit;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			n = scan.nextInt();
			w = scan.nextInt();
			h = scan.nextInt();
		    map = new int[h][w];
			for(int i =0; i <h; i++) {
				for(int j =0; j< w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			
			breakWall(0);
		}
		
		
	}

	private static void breakWall(int idx) {
		// TODO Auto-generated method stub
		int height = 0 ;
		while(height<h &&map[height][idx] ==0 ) {
			height++;
		}
		System.out.println("hi");
		Queue<Node> q = new LinkedList<>();
		if(height<h) {
			q.add(new Node(height,idx));
		}
		
		int[][] copyMap = new int[h][w];
		copyMap = arrayCopy(map);
		int[] dirY = {1,-1,0,0};
		int[] dirX = {0,0,1,-1};
		
		while(!q.isEmpty()) {
			Node tmp = q.poll();
			//  > < v ^ 
			copyMap[tmp.x][tmp.y]= 0; 
			for(int i =0; i < copyMap[tmp.x][tmp.y]; i++) {
				for(int k=0; k<4; k++) {
					int nx =tmp.x + dirX[k];
					int ny =tmp.y + dirY[k];
					
					if(nx>=0&& ny>=0 && nx<h && ny <w&& copyMap[nx][ny]!=0 && !visit[nx][ny]) {
						visit[nx][ny] = true;
						q.add(new Node(nx, ny));
						}
						
						
					}
				}
			}
			
		}
		

	private static int[][] arrayCopy(int[][] aSource) {
		int[][] aDestination = new int[aSource.length][];
		for (int i = 0; i < aSource.length; i++) {
			aDestination[i] = aSource[i].clone();
		}
		return aDestination;
	}
	
}
