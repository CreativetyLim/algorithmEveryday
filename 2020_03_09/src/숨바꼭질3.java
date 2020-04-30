import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class node{
	int cnt;
	int idx;
	String s;
	public node(int idx, int cnt, String tmp) {
		// TODO Auto-generated constructor stub
		this.cnt =cnt;
		this.idx = idx;
		s = tmp+idx+" ";
		}
}
public class ¼û¹Ù²ÀÁú3 {
	static int k;
	static boolean[] visit =new boolean[200001];
	static int[] result;
	static node minnode;
	static int min = 0xfffff;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		k = scan.nextInt();
		if(n <k) {
			bfs(n);
			//result[0] = n;
			System.out.println(min);
			System.out.println(minnode.s);
		}
		else {
			System.out.println(n-k); 
			for(int i = n; i>=k; i--) {
				System.out.print(i+" "); 
		}
	}
	}
	private static void bfs(int idx) {
		// TODO Auto-generated method stub
		
		Queue<node> q =new LinkedList<node>();
		q.add(new node(idx,0,""));
		while (!q.isEmpty()) {
			node tmp = q.poll();
			if(tmp.idx<0 ||tmp.idx > 200000) {
				continue;
			}
			if(tmp.cnt> min) {
				return;
			}
			if(tmp.idx == k) {
				if(tmp.cnt < min) {
					min = tmp.cnt;
					minnode = tmp;
				}
				return;
			}
			if(!visit[tmp.idx] && tmp.idx<=100000) {
				visit[tmp.idx]= true;
				q.add(new node(tmp.idx*2, tmp.cnt+1,tmp.s));
				q.add(new node(tmp.idx-1, tmp.cnt+1,tmp.s));
				q.add(new node(tmp.idx+1, tmp.cnt+1,tmp.s));
			}
		}
		
	}
}
