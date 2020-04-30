import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class 카드구매하기 {
	static int T;
	static int cnt=0;
	static boolean[] visited;
	static int[] output; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int t = 1; t <= T; t++) {
			String s= scan.next();
			int change = scan.nextInt();
			visited = new boolean[s.length()];
			output = new int[s.length()];
			int[] arr =new int[s.length()]; 
			int[] original = new int[s.length()]; 
			for(int i= 0 ; i<s.length(); i++) {
				arr[i] = s.charAt(i)-'0';
			}
			System.arraycopy(arr, 0, original, 0, s.length());
			Arrays.sort(arr);     // 역순으로 정렬 한번 ㄱ
			perm(arr,0);
			System.out.println("?/////////");
			System.out.println(Arrays.toString(original));
		}
		 
		
	}
	private static void perm(int[] arr, int index) {
		// TODO Auto-generated method stub
		if(index == arr.length) {
			System.out.println(Arrays.toString(output));
	        return;
	    }
	 
	    for(int i=0; i<arr.length; i++) {
	        if(visited[i] != true) {
	            visited[i] = true;
	            output[index] = arr[i];
	            perm(arr, index + 1);       
	            visited[i] = false;
	        }
	    }
	}
	
}
