import java.util.Scanner;

public class apart {
	static int n;
	static int[][] map;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		map = new int[n][n];
		int h= 0;
		String[] s = new String[n];
		for(int i =0; i<n; i++) {
				s[i] = scan.next();
		}
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				map[i][j] = s[i].charAt(j)-48;
			}	
		}
		
		for(int i =0; i<n; i++) {
			for(int j =0; j<n; j++) {
				System.out.print(map[i][j]);
			}	
			System.out.println();
		}
		
		
	}
}
