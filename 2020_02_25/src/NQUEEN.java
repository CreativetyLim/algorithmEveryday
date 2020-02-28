import java.util.Scanner;

public class NQUEEN {
	static int n ; 
	static int[] map;
	static int cnt=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		 map = new int[n];
		nqueen(0);
		System.out.println(cnt);
	}

	// nqueen() 함수는 idx 행의  Q을 어디에 놓을지 결정하는 함수
	private static void nqueen(int idx) {  
		if(idx == n) {
		cnt++;
			return;
		}
		for(int i=0; i<n; i++) {
			//promise를 만족해야 다음 재귀를 돔
			if(promise(idx,i)) {   
				map[idx] = i;
				nqueen(idx+1);
			}
		}
	}

	//PROMISE 함수는 그냥 그 자리에 퀸이 들어갈 수 있는지 보는것
	private static boolean promise(int idx,int i) {
		// TODO Auto-generated method stub
		for(int j = 0;  j<idx; j++ ) {
			if(map[j]==i || Math.abs(map[j]-i)==Math.abs(idx)-j) {
				return false;
			}
		}
		return true;
	}
}
