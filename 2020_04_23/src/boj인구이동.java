import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class point {
	int x ;
	int y;
	int cnt;
	public point(int x, int y,int cnt ) {
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y= y;
		this.cnt= cnt;
	}
}

public class boj인구이동 {
	static int[][] map =new int[101][7];
	static boolean[][] visit ;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] macaron = {{1,1},{2,1},{1,2},{3,3},{6,4},{3,1},{3,3},{3,3},{3,4},{2,1}};
		
		for(int i=0; i <macaron.length; i++) {
			
			// 마카롱 떨어뜨리기
			drop(macaron[i][0],macaron[i][1]);
			
			for(int k =1; k<7; k++ ) {
				for(int j=1; j <101; j++) {
					visit = new boolean[101][7];
					if(map[j][k] ==0) {
						break;
					}
					bfs(j,k);
				}
			}
		}
		String[] answer = new String[6];
		
		for(int i =0; i <6; i++) {
			answer[i] = map[6-i][1]+""+map[6-i][2]+""+map[6-i][3]+""+map[6-i][4]+""+map[6-i][5]+""+map[6-i][6];
		}
	}
	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		if(x== -1) {
			return;
		}
		
		int[] dirX = {1,-1,0,0};
		int[] dirY = {0,0,1,-1};
		
		ArrayList<point> arr =new ArrayList<point>();
		Queue<point> q = new LinkedList<point>();
		q.add(new point(x,y,1));
		arr.add(new point(x,y,1));
		visit[x][y] = true;
		while(!q.isEmpty()) {
			point tmp = q.poll();
			int newx=0;
			int newy=0;
			for(int k =0 ; k<4; k++) {
				newx = tmp.x +dirX[k];
				newy = tmp.y +dirY[k];
				if(newx>0 && newy>0 && newx<101 && newy<7 && !visit[newx][newy] && map[tmp.x][tmp.y]== map[newx][newy]) {
					visit[newx][newy] =true;
					q.add(new point(newx,newy,tmp.cnt+1));
					arr.add(new point(newx,newy, tmp.cnt+1));
				}
			}
		}		
		if(arr.size()>=3) {
			for(int i =0; i <arr.size(); i++) {
				map[arr.get(i).x][arr.get(i).y] = 0;
			}
			for(int i =0; i <arr.size(); i++) {
				int zeroy = arr.get(i).y;
				for(int j =2; j<101; j++)
					if(map[j-1][zeroy] == 0 && map[j][zeroy] != 0) {
						drop(arr.get(i).y,map[j][zeroy]);
						map[j][zeroy] = 0;
					}
			}
		}
		
	}
	private static int drop(int index, int color) {
		// TODO Auto-generated method stub
		if(index<7) {
			for(int i =1; i<101; i++) {
				if(map[i][index]== 0) {
					map[i][index]= color;
					return i;
				}
			}
		}
		return -1;
	}
}
