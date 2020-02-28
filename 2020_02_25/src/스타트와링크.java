import java.util.Arrays;
import java.util.Scanner;

public class 스타트와링크 {
	static boolean[] visit;
	static int min = 0xfffffff;
	static int[][] ability;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		visit = new boolean[n];
		ability = new int[n][n];
		for(int i =0; i <n; i++) {
			for(int j =0 ; j<n; j++) {
				ability[i][j] = scan.nextInt();
			}
		}
		int[] result = new int[visit.length/2];
		combi(0,0);
		System.out.println(min);
	}
	private static void combi(int idx, int start ) {
		// TODO Auto-generated method stub
		if(idx == visit.length/2) {
			int s=0;
			int l = 0;
			for(int i =0; i<visit.length-1; i++) {
					for(int j =i+1; j<visit.length; j++) {
						if(visit[i] &&visit[j]) {
							s+= (ability[i][j]+ability[j][i]);
						}
						else if(!visit[i] &&!visit[j] ) {
							l+= (ability[i][j]+ability[j][i]);
						}
					}
			}
			if(min > Math.abs(l-s)) {
				min = Math.abs(l-s);
			}
			return;
		}
				
		for(int i =start; i <visit.length; i++) {
			visit[i]= true;
			combi(idx+1, i+1);
			visit[i]= false;
		}
		
		
		
	}
}
