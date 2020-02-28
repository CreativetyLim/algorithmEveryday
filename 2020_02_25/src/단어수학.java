import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class 단어수학 {
	static int goalIdx;
	static boolean[] visit;
	static String[] s;
	static HashSet<Character> list;
	public static void main(String[] args) {
		list = new HashSet<Character>();
		Scanner  scan = new Scanner(System.in);
		int n = scan.nextInt();
		 s = new String[n];
		for(int i =0; i <n; i++) {
			s[i] = scan.next();
			for(int j =0; j <s[i].length(); j++) {
				list.add(s[i].charAt(j));
			}
		}
		goalIdx = list.size();
		int[] result = new int[goalIdx];
		visit = new boolean[goalIdx];
		permutation(0,result);
	}
	private static void permutation(int idx,int[] result) {
		// TODO Auto-generated method stub
		if( idx == goalIdx ) {
			for(int i= 0; i <list.size(); i++) {
				
			}
			return ;
		}
		
		for(int i =0 ; i<goalIdx; i++) {
			if(!visit[i]) {
				visit[i] =true;
				result[idx] = i;
				permutation(idx+1, result);
				visit[i] =false;
			}
		}
	}
}
