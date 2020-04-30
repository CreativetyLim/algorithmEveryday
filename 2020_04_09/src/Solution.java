import java.util.Scanner;

public class Solution {
	static boolean[] same;
	static boolean falg ;
	static String begin ;
	static String target ;
	static String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
	public static void main(String[] args) {
		String s ="abcdefa";
		s= s.substring(0,s.length());
		System.out.println(s);
		/*Scanner scan = new Scanner(System.in);
		begin = scan.next();
		target = scan.next();
		same = new boolean[begin.length()];
		int cnt = 0;
		for(int i =0; i <begin.length(); i ++) {
			if(begin.length()==target.length() &&begin.charAt(i) == target.charAt(i)) {
				same[i]= true;
				cnt ++;
			}
		}
		int[] result = new int[begin.length()-cnt];
		permu(0, result,0);*/
		
	}
	private static void permu(int idx, int[] result,int start) {
		// TODO Auto-generated method stub
		if( idx == result.length) {
			
			for(int i =0; i<result.length; i++) {
				//begin = begin.charAt(result[i])
			}
			
		}
		
		for(int i=0 ;i < same.length; i++) {
			result[idx] = i;
			permu(idx+1, result,i+1);
		}
		
	}
	
}
