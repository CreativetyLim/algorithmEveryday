import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class water {
	int a;
	int b;
	int c;
	public water(int d,int e, int f) {
		// TODO Auto-generated constructor stub
		a= d;
		b= e;
		c= f;
	}
}
public class 물통 {
	static int maxA;
	static int maxB;
	static int maxC;
	static boolean[][][] visit= new boolean[201][201][201];
	static LinkedList<Integer> h = new LinkedList<Integer>();
	static HashSet<Integer> h1= new HashSet<Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		maxA = scan.nextInt();
		maxB = scan.nextInt();
		maxC = scan.nextInt();
		
		bfs(0,0,maxC);
//		Iterator it= h.iterator();
//		while(it.hasNext()) {
//			int i = (int) it.next();
//			if(i !=0)
//			System.out.print(i+" ");
//		}
		Collections.sort(h);
		while(!h.isEmpty()) {
			int a = h.poll();
		System.out.print(a+" ");
		}
		}

	private static void bfs(int i, int j, int k) {
		// TODO Auto-generated method stub
		
		Queue<water>  q= new LinkedList<water>();
		q.add(new water(i,j,k));
		while(!q.isEmpty()) {
			water tmp = q.poll();
			
			if(visit[tmp.a][tmp.b][tmp.c]) {
				continue;
			}
			//System.out.println(tmp.a + " "+tmp.b + " " +tmp.c);
			if(tmp.a ==0 ) {
				if(!h.contains(tmp.c))
				h.add(tmp.c);
			}
			
			if(!visit[tmp.a][tmp.b][tmp.c]) {
				visit[tmp.a][tmp.b][tmp.c]= true;
				
				//a에서 옮기기
					if(maxB>=tmp.a+tmp.b) {
						//System.out.println(1);
						q.add(new water(0,tmp.a+tmp.b,tmp.c));
					}
					else{
						//System.out.println(2);
						q.add(new water(tmp.a+tmp.b-maxB,maxB,tmp.c));
					}
					if(maxC>=tmp.a+tmp.c) {
						//System.out.println(3);
						q.add(new water(0,tmp.b,tmp.c+tmp.a));
					}
					else{
						//System.out.println(4);
						q.add(new water(tmp.a+tmp.c-maxC,tmp.b,maxC));
					}
				//b에서 옮기기
					if(maxC>=tmp.b+tmp.c) {
						//System.out.println(5);
						q.add(new water(tmp.a,0,tmp.c+tmp.b));
					}
					else{
						//System.out.println(6);
						q.add(new water(tmp.a,tmp.b+tmp.c-maxC,maxC));
					}
					
					if(maxA>=tmp.a+tmp.b) {
						//System.out.println(7);
						q.add(new water(tmp.a+tmp.b,0,tmp.c));
					}
					else{
						//System.out.println(8);
						q.add(new water(maxA,tmp.b+tmp.a-maxA,tmp.c));
					}
				//c에서 옮기기
					if(maxA>=tmp.a+tmp.c) {
						//System.out.println(9);
						q.add(new water(tmp.c+tmp.a,tmp.b,0));
					}
					else{
						//System.out.println(10);
						q.add(new water(maxA,tmp.b,tmp.c+tmp.a- maxA));
					}
					
					if(maxB>=tmp.c+tmp.b) {
						//System.out.println(11);
						q.add(new water(tmp.a,tmp.c+tmp.b,0));
					}
					else{
						//System.out.println(12);
						q.add(new water(tmp.a,maxB,tmp.c- maxB+tmp.b));
					}
			
		}
	}
		
	}
}
