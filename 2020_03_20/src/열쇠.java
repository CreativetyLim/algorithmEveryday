//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
///*class Point{
//	int x ;
//	int y;
//	public Point(int x ,int y) {
//		// TODO Auto-generated constructor stub
//		this.x = x;
//		this.y = y;
//		
//	}
//}*/
//public class ¿­¼è {
//	static int h;
//	static int w;
//	static int[][] map ;
//	static boolean[][] visit;
//	static ArrayList<Character> keylist;
//	static ArrayList<Character> doorlist;
//	static ArrayList<Point> doorPoint;
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		h = scan.nextInt();
//		w = scan.nextInt();
//		char[][] map = new char[h][w];
//		for(int i= 0; i<h; i++) {
//			String s = scan.next();
//			for(int j =0; j<w ; j++) {
//				map[i][j] = s.charAt(j);
//				if(map[i][j]>=65 && map[i][j]<=90) {
//					doorlist.add(map[i][j]);
//					doorPoint.add(new Point(i,j));
//				}
//			}
//		}
//		keylist = new ArrayList<Character>();
//		String s = scan.next();
//		for(int i =0; i < s.length(); i ++) {
//			keylist.add(s.charAt(i));
//		}
//		
//		for(int i =0; i <h; i++) {
//			for(int j =0; j<w; j++) {
//				bfs(i,j);
//			}
//		}
//		
//	}
//	private static void bfs(int a, int b) {
//		// TODO Auto-generated method stub
//		Queue<Point> q = new LinkedList<Point>();
//		int dirX[] = {1,-1,0,0};
//		int dirY[] = {0,0,1,-1};
//		q.add(new Point(a, b));
//		
//		while(!q.isEmpty()) {
//			Point tmp = q.poll();
//			
//			for(int k = 0; k< 4; k++) {
//				int nx = tmp.x + dirX[k];
//				int ny = tmp.y + dirY[k];
//				 
//				if(promise(nx,ny)&&!visit[nx][ny]) {
//					visit[nx][ny] =true;
//					if(map[nx][ny]>=97) {
//						keylist.add((char) map[nx][ny]);
//						if(doorlist.contains(map[nx][ny])) {
//						}
//					}
//				}
//			}
//		}
//	}
//	private static boolean promise(int nx, int ny) {
//		// TODO Auto-generated method stub
//		if(map[nx][ny]=='.' || map[nx][ny]>=97 ||map[nx][ny] =='$' ) {
//			
//			return true;
//		}
//		else if(map[nx][ny]>=65 && map[nx][ny]<=90) {
//			if(keylist.contains(map[nx][ny]+32)) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		
//		else
//			return false;
//	}
//}
