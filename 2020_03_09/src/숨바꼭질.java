import java.util.Arrays;
import java.util.Scanner;

public class ¼û¹Ù²ÀÁú {
	static int k;
	static int[] visit;
	static int[] result;
	static int min = 0xffff;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		k = scan.nextInt();
		visit = new int[Math.max(n, k)+1];
		dfs(0,n);
		result[0] = n;
		System.out.println(min);
		for(int i =0; i <result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	private static void dfs(int idx, int value) {
		// TODO Auto-generated method stub
		if( value<0 || value > (k*2)+1 || idx>min ) {
			return;
		}
		if(value == k ) {
			if(min > idx ) {
				min = idx;
				result = new int[idx+1];
				for(int i=0; i <idx; i++) {
					result[i+1] =visit[i];
				}
			}
			return ;
		}
		
		
		visit[idx] = value*2;
		dfs(idx+1, value*2);
		visit[idx] = value+1;
		dfs(idx+1, value+1);
		visit[idx] = value-1;
		dfs(idx+1, value-1);
	}
}
