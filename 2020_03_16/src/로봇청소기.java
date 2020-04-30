import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/*class Point{
	int x;
	int y;
	public Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x= x;
		this.y = y;
	}
}*/
public class 로봇청소기 {
	static int h;
	static int w;
	static int[][] map;
	static LinkedList<Point> garbage = new LinkedList<Point>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		w = scan.nextInt();
		h = scan.nextInt();
		map = new int[h][w];
		
		// 입력 부분 
		for(int i=0; i < h; i++) {
			String s = scan.next();
			
			for(int j=0; j < w; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j]=='*') {
					int disMin =0xfffff;
					int idx =0;
					for(int k=0; k<garbage.size(); k++) {
						Point p = garbage.get(k);
						if(Math.pow(p.x-i, 2)+Math.pow(p.y-j, 2) <disMin ) {
							disMin = (int)Math.pow(p.x-i, 2)+(int)Math.pow(p.y-j, 2);
							idx =k;
						}
					}
					garbage.add(idx,new Point(i,j));
					
				}
			}
		}
		
		
		
		
		System.out.println(garbage.size());
		int z = garbage.size();
		while(z-->0) {
			Point t = garbage.poll();
			System.out.println(t.x+" "+t.y);
		}
	}
}
