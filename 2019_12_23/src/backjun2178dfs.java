import java.util.Queue;
import java.util.Scanner;

public class backjun2178dfs {
	static int map[][];
	static boolean check[][];
	static int h;
	static int w;
	static int min= 99999;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		h= scan.nextInt();
		w= scan.nextInt();
		map = new int[h+1][w+1];
		check = new boolean[h+1][w+1];
		for(int i = 1; i<=h; i++) {
			String s = scan.next();
			for(int j=1; j<=w; j++) {
				map[i][j] = s.charAt(j-1)-'0';
			}
		}
		
		
		for(int i =0 ; i<h; i++) {
			for(int j =0 ; j<w; j++) {
				dfs(1,1,0);
			}
		}
		System.out.println(min);
	}
	private static void dfs(int i, int j, int cnt) {
		// TODO Auto-generated method stub
		if(check[i][j] == true) {
			return;
		}
		cnt++;
		check[i][j] = true;
		int[] dirX = {-1,0,1,0 };
		int[] dirY = {0,1,0,-1};
		
		if(i==h && j==w) {
			if(min >cnt) {
				min =cnt;
			}
			
		}
		else {
			int newX = 0;
			int newY = 0;
			for (int k = 0; k < 4; k++) {
				newX = i + dirX[k];
				newY = j + dirY[k];
				if (newX > 0 && newY > 0 && newX <= h && newY <= w && !check[newX][newY] && map[newX][newY] == 1) {
					System.out.println(newX +" "+newY+" "+cnt);
					dfs(newX, newY,cnt);
				}
			
			}
		}
	}
}
