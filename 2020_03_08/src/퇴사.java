import java.util.Scanner;

public class Επ»η {
	static int[] t;
	static int[] p;
	static int n;
	static boolean[] visit;
	static int max=  0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		t =new int[n];
		p =new int[n];
		visit = new boolean[n];
		for(int i =0; i <n; i++) {
			t[i] =scan.nextInt();
			p[i] =scan.nextInt();
		}
		
		benefit(0);
		System.out.println(max);
	}
	private static void benefit(int idx) {
		// TODO Auto-generated method stub
		if(idx == n ) {
			int answer=0;
			for(int i =0; i <visit.length; i++) {
				if(visit[i] && i+t[i]<=n) {
					answer += p[i];
				}
			}
			max = Math.max(max, answer);
			return ;
		}
		else if(idx >n) {
			return;
		}
		
		if(t[idx]!=1) {
			visit[idx]= true;
			benefit(idx+t[idx]);
		}
		else {
			visit[idx]= true;
			benefit(idx+1);
		}
		visit[idx]= false;
		benefit(idx+1);
		
	}
}
