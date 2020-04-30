import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Merong{
	String s;
	int n;
	void add(char c){
		this.s+=c;
	}
	public Merong(int n, String s) {
		// TODO Auto-generated constructor stub
		this.n = n;
		this.s += s;
		
	}
}
public class dslr {
	static int cnt=0; 
	static int b; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int a=0;
		for(int i =0; i<n; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			bfs(a);
			
			cnt=0;
		}
	}
	private static void bfs(int idx) {
		// TODO Auto-generated method stub
		Queue<Merong> q = new LinkedList<Merong>();
		String s="z";
		q.add(new Merong(idx, s));
		
		while(!q.isEmpty()) {
			//System.out.println(q);
			Merong tmp = q.poll();
			if( tmp.n == b ) {
				System.out.println(tmp.s);
				break;
			}
			cnt++;
			
//			if(cnt >=3) {
//				if(tmp.s.charAt(cnt-1) ==tmp.s.charAt(cnt-2) &&tmp.s.charAt(cnt-1) ==tmp.s.charAt(cnt-3) && tmp.s.charAt(cnt-3) ==tmp.s.charAt(cnt-2)) {
//					tmp.s= tmp.s.substring(0,cnt-3)+'R';
//					cnt= cnt -2;
//				}
//			}
			
			tmp.add('L');
			q.add(new Merong(l(tmp.n),tmp.s));
			tmp.add('D');
			q.add(new Merong(d(tmp.n),tmp.s));
			tmp.add('S');
			q.add(new Merong(s(tmp.n),tmp.s));
			
		}
	}
	private static int l(int a) {
		// TODO Auto-generated method stub
		//1234 1000
		String s = a+"";
		String tmp ="";
		int len = s.length();
		while(len<4) {
			tmp +="0";
			len++;
		}
		int n1 = (s.charAt(1)-'0')*1000;
		int n2 = (s.charAt(2)-'0')*100;
		int n3 = (s.charAt(3)-'0')*10;
		int n4 =(s.charAt(0)-'0');
		return n1+n2+n3+n4;
	}
	private static int s(int a) {
		// TODO Auto-generated method stub
		if(a == 0) {
			a = 10000;
		}
		return a-1;
		
	}
	private static int d(int a) {
		// TODO Auto-generated method stub
		if(a*2>9999) {
			a= (a*2)%10000;
		}
		return 2*a;
	}
}
