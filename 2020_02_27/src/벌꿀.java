import java.util.Scanner;

public class ���� {
	static boolean[][] visit;
	static int n;
	static int m;
	static int c; 
	static int[][] map;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		c = scan.nextInt();
		//n ���� �������� m ���� �������� �̴´�. �� �� �κ������� ���ؼ� ���ٿ��� �ִ밪 �̰� ���ϰ�, ���� �ٿ��� �ΰ� �̴°� �̵��� �Ǵ����� �˻�
		map = new int[n][n];
		visit= new boolean[n][n];
		for(int i =0; i <n; i++) {
			for(int j = 0 ; j <n ;j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		makeMap(0,0,0,0,0);
	}
	
	private static void makeMap(int i ,int j , int cnt, int sum, int powsum) {
		// TODO Auto-generated method stub
		for(int r= 0; r<i; r++) {
			for(int c= 0; c <j; c++) {
				
			}
		}
	}

	private static void powerset(int i,int idx, int start) {
		// TODO Auto-generated method stub
		if(idx == m) {
			for(int j=0; j<n; j ++) {
				if(visit[i][j]) {
					System.out.print(map[i][j]+ " " );
				}
			}
			System.out.println();
			return ;
		}
		visit[i][start]= false;
		powerset(i,idx+1,start+1);
		visit[i][start]= true;
		powerset(i,idx+1,start+1);
		
		
	}
}