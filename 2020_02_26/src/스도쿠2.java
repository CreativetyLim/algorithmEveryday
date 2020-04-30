import java.util.Arrays;
import java.util.Scanner;

public class ½ºµµÄí2 {
	static boolean flag= true;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] map = new int[9][9];
		for(int i=0; i <map.length; i++) {
			for(int j =0; j<map.length; j++) {
				map[i][j] =scan.nextInt();
			}
		}
		
		permutation(0, map,0,0);
	}

	private static void permutation(int idx, int[][] map,int start,int exj) {
		// TODO Auto-generated method stub
		if(idx ==9 && flag) {
			for(int i =0; i <map.length; i++) {
					if(map[i][8]==0) {
						return;
				}
			}
			for(int i =0; i <map.length; i++) {
				for(int j =0; j<map.length; j++) {
					System.out.print(map[i][j]+ " ");
				}
				System.out.println();
			}
			flag =false;
			return;
		}
		for(int i = start; i <map.length; i++ ) {
			for(int j=1; j<=9; j++) {
				if(map[idx][i] == 0 &&promise(idx,i,j,map)) {
					map[idx][i] = j;
					permutation(idx, map, i,j+1);
				}
				if(flag && i ==8) { 
					permutation(idx+1, map,0,exj);
				}
				
			}
		}
	}

	private static boolean promise(int row,int col, int value,int[][] map) {
		// TODO Auto-generated method stub
		
		for(int i=0; i <map[row].length; i++) {
			if(map[row][i] !=0 && map[row][i] == value) {
				return false;
			}
		}
		for(int i = 0; i <map.length; i++) {
			if(map[i][col] !=0 && map[i][col] == value ) {
				return false;
			}
		}
		for(int i =0; i<map.length; i++) {
			for(int j=0; j<map.length; j++) {
				if(i/3== row/3 && j/3 ==col/3) {
					
				}
			}
		}
		
		return true;
	}
}
