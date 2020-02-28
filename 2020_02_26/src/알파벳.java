import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ¾ËÆÄºª {
	static int r;
	static int c;
	static int[] dirX = {0,0,-1,1};
	static int[] dirY = {-1,1,0,0};
	static int max= 0;
	static char[][] map;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		r= scan.nextInt();
		c= scan.nextInt();
		map =new char[r][c];
		for(int i=0; i<r; i++) {
			String s = scan.next();
			for(int j =0; j<c; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		ArrayList<Character> list= new ArrayList<Character>(); 
		dfs(0,0,1,list);
		System.out.println(max);
	}

	private static void dfs(int i, int j,int cnt, ArrayList<Character> list) {
		// TODO Auto-generated method stub
		list.add(map[i][j]);
		if(cnt> max) {
			max= cnt;
		}
		int nx = 0;
		int ny = 0;
		for(int k=0; k<4; k++) {
			nx = i + dirX[k];
			ny = j + dirY[k];
			int flag = 0;
			if(nx>=0&&ny>=0 && nx<r && ny<c) {
				if(list.contains(map[nx][ny])) {	
					flag++;
					continue;
				}
				if(flag==0) {
					dfs(nx,ny,cnt+1,list);
					list.remove(list.size()-1);
				}
			}  
			
			
			
		}
		return;
	}
}
