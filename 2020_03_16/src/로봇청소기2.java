import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Point{
	int n;
	int x;
	int y;
	int dust;
	
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y = y;
	}
	public Point(int x, int y,int n,int dust ) {
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y = y;
		this.n = n;
		this.dust = dust;
	}
}
public class 로봇청소기2 {
	static int minimin = 0xfffff;
	static boolean[][] visit;
	static int min = 0xfffff;
	static int dustNumber =0;
	static int h;
	static int w;
	static int[][] map;
	
	static int[] input;
	static int[][] garbage = new int[10][2];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		w = scan.nextInt();
		h = scan.nextInt();
		map = new int[h][w];
		visit = new boolean[h][w];
		int robotX = 0;
		int robotY = 0;
		// 입력 부분 
		for(int i=0; i < h; i++) {
			String s = scan.next();
			
			for(int j=0; j < w; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='o') {
					robotX =i;
					robotY= j;
				}
				else if(map[i][j] == '*') {
					garbage[dustNumber][0] = i;
					garbage[dustNumber][1] = j;
					dustNumber++;
				}
			}
		}
		input = new int[dustNumber];
		for(int i =0; i <input.length; i++) {
			input[i] = i ;
		}
		Arrays.sort(input);
		do {
			System.out.println(Arrays.toString(input));
			bfs(robotX, robotY);
			System.out.println(minimin);
			
		}while(nextPermutation());
	}

	private static boolean nextPermutation() {
		// step1
		int i = dustNumber-1;
		while(i>0 && input[i-1]>=input[i] ) --i;
		if(i==0) return false;
		
		// step2
		int j = dustNumber-1;
		while(input[i-1]>=input[j]) --j;
		
		// step3
		int temp = input[i-1];
		input[i-1] = input[j];
		input[j] = temp; 
		
		// step4
		int k = dustNumber-1;
		while(i<k) {
			temp = input[i];
			input[i] = input[k];
			input[k] = temp;
			++i;
			--k;
		}
		return true;
		
	}
	private static void bfs(int robotX, int robotY) {
		// TODO Auto-generated method stub
		int[] dirX = {-1,0,1,0};
		int[] dirY = {0,1,0,-1};
		Point minPoint = new Point(robotX, robotY, 0, 0);
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(robotX, robotY, 0, 0));
		
		//while(dustNumber > minPoint.dust) {
		//visit = new boolean[h][w];
	//	System.out.println(minPoint.x+" " +minPoint.y);	
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			
			if(tmp.x == garbage[input[tmp.dust]][0] && tmp.y == garbage[input[tmp.dust]][1]) {
				if(minimin >tmp.n) {
					minimin = tmp.n;
					tmp.dust++;
					minPoint = tmp;
				}
			}
			int nx=0;
			int ny=0;
			for(int k=0; k<4; k++) {
				nx = tmp.x + dirX[k];
				ny = tmp.y + dirY[k];
				if(nx>=0 && ny>=0 && nx<h && ny<w &&!visit[nx][ny]) {
					visit[nx][ny] =true;
					q.add(new Point(nx, ny));
				}
			}
			
		}
		}
		
		
	}
//}