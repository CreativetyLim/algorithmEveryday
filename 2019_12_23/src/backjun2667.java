import java.util.Arrays;
import java.util.Scanner;

public class backjun2667 {
	static int[] danji =new int[100];
	static int n;
	static int[][] map;
	static boolean[][] check;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		map = new int[n][n];
		check = new boolean[n][n];
		String[] s = new String[n];
		for(int i =0; i<n; i++) {
				s[i] = scan.next();
		}
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				map[i][j] = s[i].charAt(j)-48;
			}	
		}
		
		int count =0;
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				if(map[i][j] !=0 && check[i][j]== false){
					dfs(i,j,count);
					count++;
				}
				
				}
			}
	
		System.out.println(count);
		/*
		 * int[] result = new int[count];
		 * 
		 * for(int i =0; i<count;i++) { result[i] = danji[i]; }
		 */
		Arrays.sort(danji,0,count);
		for(int i =0; i<count;i++) {
			System.out.println(danji[i]);
		}
		
	}

	private static void dfs(int i, int j,int count) {
		// TODO Auto-generated method stub
		if(check[i][j]==true)
			return;
		
		check[i][j] = true;
		int[] dirX = {-1,0,1,0 };
		int[] dirY = {0,1,0,-1};
		danji[count]++;
		int newX = 0;
		int newY = 0;
		for (int k = 0; k < 4; k++) {
			newX = i + dirX[k];
			newY = j + dirY[k];
			if (newX >= 0 && newY >= 0 && newX < n && newY < n && !check[newX][newY] && map[i][j] == 1) {
				dfs(newX, newY,count);
			}
		
		}
	}
	
}
