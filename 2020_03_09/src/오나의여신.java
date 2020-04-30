//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Point{
//	int row , col , depth;
//	public Point(int z,int x, int c) {
//		// TODO Auto-generated constructor stub
//		row = z;
//		col = x;
//		depth = c;
//	}
//}
//public class 오나의여신 {
//	static char [][] map;
//	static int[] dirX ={-1,1,0,0};
//	static int[] dirY ={0,0,1,-1};
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int T = scan.nextInt();
//		for (int t = 1; t <= T; t++) {
//			int n =scan.nextInt();
//			int m = scan.nextInt();
//			for(int i=0; i<n; i++) {
//				String s= scan.next();
//				for(int j=0; j<m; j++) {
//					map[i][j] = s.charAt(j);
//				}
//			}
//			int a=0,b=0,c=0,d=0;
//			for(int i=0; i<n; i++) {
//				for(int j=0; j<m; j++) {
//					if(map[i][j]== 'D') {
//						a =i;
//						b =j;
//					}
//					if(map[i][j] == 'S') {
//						c =i;
//						d= j;
//					}
//				}
//			}
//			bfs(a,b,c,d);
//		}
//		
//	}
//	private static void bfs(int a, int b, int c, int d2) {
//		// TODO Auto-generated method stub
//		boolean [][] visited = new boolean[3][3];
//		Queue<Point> q = new LinkedList<Point>();
//		Queue<Point> q2 = new LinkedList<Point>();
//		q.offer(new Point(0, 0, 0));
//		visited[0][0] =true;
//		
//		int size = q.size();
//		
//		while(size-->0) {
//			Point front = q.poll();
//			
//			for(int d= 0 ; d<4; d++) {
//				int nr = front.row + dirX[d];
//				int nc = front.col + dirY[d];
//				
//				if(isIn(nr,nc)) {
//					if(!visited[nr][nc]) {
//						visited[nr][nc] =true;
//						q.offer(new Point(nr, nc, front.depth+1));
//					}
//				}
//			}
//		}
//		System.out.println("턴은종료되엇고 q에남은것은"+q);
//	}
//	private static boolean isIn(int r, int c) {
//		// TODO Auto-generated method stub
//		return 0<= r && 0<= c && r<3 && c<3;
//	}
//}
