import java.util.Scanner;

public class 지희의고장난계산기 {
	static boolean[] visit = new boolean[10];
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			for(int i=0; i <10; i++) {
				int n = scan.nextInt();
				if(n==1) {
					visit[i] = true;
				}
			}
			int answer = scan.nextInt();
			boolean[] value = new boolean[6];
			permutation(0,value,0,answer);
			
		}
		
	}
	private static void permutation(int idx,boolean[] value,int cnt, int answer) {
		// TODO Auto-generated method stub
		if( idx == answer ) {
			
			return ;
		}
		if( idx > answer ) {
			
			return; 
		}
		
		for(int i =0 ; i < visit.length; i ++ ) {
			if(!visit[i]) {
				visit[i] = true;
				permutation(idx+1, value, cnt, answer);
				visit[i] =false;
			}
		}
	}
}
