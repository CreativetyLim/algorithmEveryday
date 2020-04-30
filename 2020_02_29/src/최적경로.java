import java.util.Scanner;

public class 최적경로 {
	static boolean[] visit ;
	static int n=0;
	static int[][] position;
	static int min = 0xFFFFFf;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			n = scan.nextInt();
			visit = new boolean[n+2];
			position = new int[n+2][2];
			for(int i=0; i <n+2; i++) {
				for(int j=0; j<2; j++) {
					position[i][j] =scan.nextInt();
				}
			}
 			permutation(0,0,position[0][0],position[0][1]);
 			System.out.println("#"+t+" "+min);
 			min = 0xFFFFFF;
		}
	}

	private static void permutation(int idx, int result, int preX , int preY) {
		// TODO Auto-generated method stub
		if(idx == n) {
			result += Math.abs(position[1][0]- preX) +  Math.abs(position[1][1]- preY); 
			min = Math.min(result, min);
			return;
		}
		
		
		for(int i =2 ; i < position.length; i ++) {
			if(!visit[i]) {
				visit[i] = true;
				permutation(idx+1, result+Math.abs(preX- position[i][0]) +  Math.abs(preY- position[i][1]), position[i][0], position[i][1]);
				visit[i] = false;
			}
		}
		
	}
}
