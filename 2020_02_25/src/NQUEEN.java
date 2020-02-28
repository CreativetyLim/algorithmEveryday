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

	// nqueen() �Լ��� idx ����  Q�� ��� ������ �����ϴ� �Լ�
	private static void nqueen(int idx) {  
		if(idx == n) {
		cnt++;
			return;
		}
		for(int i=0; i<n; i++) {
			//promise�� �����ؾ� ���� ��͸� ��
			if(promise(idx,i)) {   
				map[idx] = i;
				nqueen(idx+1);
			}
		}
	}

	//PROMISE �Լ��� �׳� �� �ڸ��� ���� �� �� �ִ��� ���°�
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
